package methodoverriding;

public class EverestBank extends CentralBank {

	@Override
	protected void getBankName() {
		// TODO Auto-generated method stub
		System.out.println("Everest Bank");
	}
	
	@Override
	protected void getInterestRate() {
		// TODO Auto-generated method stub
		System.out.println("10%");
	}
}
