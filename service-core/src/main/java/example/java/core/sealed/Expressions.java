package example.java.core.sealed;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Expressions {

	public int caculateThreeNumber(int numberArg1, int numberArg2, int numberArg3) {
		ConstantExpr number1 = new ConstantExpr(numberArg1);
		ConstantExpr number2 = new ConstantExpr(numberArg2);
		ConstantExpr number3 = new ConstantExpr(numberArg3);

		PlusExpr totalNumber12 = new PlusExpr(number1, number2);
		NegExpr negativeNumber3 = new NegExpr(number3);

		TimesExpr multiplyTwoNumbers = new TimesExpr(totalNumber12, negativeNumber3);

		return multiplyTwoNumbers.eval();
	}

}

sealed interface Expr permits ConstantExpr, PlusExpr, TimesExpr, NegExpr {
	public int eval();
}

final class ConstantExpr implements Expr {
	int i;

	ConstantExpr(int i) {
		this.i = i;
	}

	public int eval() {
		return i;
	}
}

final class PlusExpr implements Expr {
	Expr a, b;

	PlusExpr(Expr a, Expr b) {
		this.a = a;
		this.b = b;
	}

	public int eval() {
		return a.eval() + b.eval();
	}
}

final class TimesExpr implements Expr {
	Expr a, b;

	TimesExpr(Expr a, Expr b) {
		this.a = a;
		this.b = b;
	}

	public int eval() {
		return a.eval() * b.eval();
	}
}

final class NegExpr implements Expr {
	Expr e;

	NegExpr(Expr e) {
		this.e = e;
	}

	public int eval() {
		return -e.eval();
	}
}
