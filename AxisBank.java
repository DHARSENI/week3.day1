package week3.day1;

public class AxisBank extends BankInfo {
	@Override
	public void deposit() {
		System.out.println("automatic deposit amount");
	}

	public static void main(String[] args) {
		AxisBank ab=new AxisBank();
		ab.fixed();
		ab.saving();
		ab.deposit();

	}

}
