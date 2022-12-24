package methodoverriding;

public class NabilBank extends CentralBank {
	
	@Override
	protected void getBankName() {
		// TODO Auto-generated method stub
		System.out.println("Nabil Bank");
	}
	
	@Override
	protected void getInterestRate() {
		// TODO Auto-generated method stub
		System.out.println("15%");
	}
}
