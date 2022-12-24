package abstraction;

public class NCCBank extends CentralBank{

	@Override
	protected void getBankName() {
		// TODO Auto-generated method stub
			System.out.println("NCC Bank");
	}

	@Override
	protected void getInterestRate() {
		// TODO Auto-generated method stub
			System.out.println("15%");
	}

}
