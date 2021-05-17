package tr.gov.nvi.tckimlik.WS;

import java.rmi.RemoteException;

public class MernisServiceManager implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		boolean result;
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy(); 
		
		try { 
			result = kpsPublicSoapProxy.TCKimlikNoDogrula(
					Long.parseLong(customer.getNationalityId()),					
					customer.getFirstName().toUpperCase(),
					customer.getLastName().toUpperCase(),
					customer.getDateOfBirth().getYear()); 
		}
	    catch (RemoteException e) { 
			result = false; 
			e.printStackTrace(); 
		}
		
		return result;	
		
	}

}
