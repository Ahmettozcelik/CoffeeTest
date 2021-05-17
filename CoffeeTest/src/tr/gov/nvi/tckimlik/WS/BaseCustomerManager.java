package tr.gov.nvi.tckimlik.WS;

public abstract class BaseCustomerManager implements CustomerService{

	@Override
	public void save(Customer customer) {
		
		System.out.println("Saved to Db: " + customer.getFirstName());
		
	}

}
