import Abstract.*;
import Adapter.MernisServiceAdapter;
import Concrete.*;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		//BaseCustomerManager customerManager = new NeroCustomerManager();
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		Customer customer= new Customer(1,"Erdener","Dereci",1992,"124124");
		customerManager.Save(customer);
	}

}
