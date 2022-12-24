package methodoverriding;

public class PrabhuBank extends CentralBank {
	
	@Override
	protected void getBankName() {
		// TODO Auto-generated method stub
		System.out.println("Prabhu Bank");
	}
	
	@Override
	protected void getInterestRate() {
		// TODO Auto-generated method stub
		System.out.println("12%");

}
}
