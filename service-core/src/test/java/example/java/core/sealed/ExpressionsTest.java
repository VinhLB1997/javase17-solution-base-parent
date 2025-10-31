package example.java.core.sealed;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ExpressionsTest {

	private Expressions expressions;

	@BeforeEach
	void setUp() {
		expressions = new Expressions();
	}

	@Test
	@DisplayName("Math: (6 + 7) * (-8) = -104 ")
	void shouldAddTwoPositiveNumbers() {
		int result = expressions.caculateThreeNumber(6, 7, 8);

		assertThat(result).as("Kết quả phải là -104").isEqualTo(-104);
	}
}
