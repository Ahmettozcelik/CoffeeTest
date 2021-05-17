package tr.gov.nvi.tckimlik.WS;
import java.rmi.RemoteException;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	private CustomerCheckService checkService;
	
	public StarbucksCustomerManager(CustomerCheckService checkService) {
		
		this.checkService = checkService;
	}

	@Override
	 public void save(Customer customer) {
		
		
		 if (checkService.CheckIfRealPerson(customer))
	        {
	            super.save(customer);
	        }
	        else
	        {
	           System.out.println("Not a valid person.");
	        }    

	     
	    }

	
}