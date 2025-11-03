package example.java.concurrency;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MultiThread {

	public static void main(String[] args) throws InterruptedException {
		final Customer c = new Customer();
		Thread t1 = new Thread() {
			public void run() {
				c.withdraw(2000);
			}
		};
		t1.start();

		Thread t2 = new Thread() {
			public void run() {
				c.deposit(500);
//				try {
//					Thread.sleep(2000);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
				c.deposit(3000);
			}
		};
		t2.start();
	}

}

class Customer {
	private int balance = 1000;

	public Customer() {
		System.out.println("Tài khoản của bạn là " + balance);
	}

	public void withdraw(int amount) {
		System.out.println("Đang thực hiện giao dịch rút tiền " + amount + "...");
		while (balance < amount) {
			System.out.println("Không đủ tiền rút!!!");
//			try {
//				wait(); // Chờ nạp tiền
//			} catch (InterruptedException ie) {
//				System.out.println(ie.toString());
//			}
		}
		balance -= amount;
		System.out.println("Rút tiền thành công. Tài khoản của bạn hiện tại là " + balance);
	}

	public void deposit(int amount) {
		System.out.println("Đang thực hiện giao dịch nạp tiền " + amount + "...");
		balance += amount;
		System.out.println("Nạp tiền thành công. Tài khoản của bạn hiện tại là " + balance);
//		notify(); // Thông báo đã nạp tiền
	}

}
