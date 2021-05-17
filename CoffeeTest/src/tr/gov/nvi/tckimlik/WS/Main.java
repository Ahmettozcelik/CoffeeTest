package tr.gov.nvi.tckimlik.WS;
import java.time.LocalDate;

public class Main {

	public static void main(String[] args) throws Exception {
		BaseCustomerManager customerManager=new StarbucksCustomerManager(new MernisServiceManager()); 
		
		Customer yasin=new Customer();
		
		Customer ahmet = new Customer(1,"Ahmet","�z�elik",LocalDate.of(1996,2,5),"11111111111");
		
		yasin.setId(2);
		yasin.setFirstName("Yasin");
		yasin.setLastName("�z�elik");
		yasin.setDateOfBirth(LocalDate.of(1997,11,8));
		yasin.setNationalityId("00000000000");
		
		customerManager.save(ahmet);
		
		
		
	}

}
