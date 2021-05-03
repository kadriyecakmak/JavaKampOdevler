package gun4Odev2;

public class BaseCustomerManager implements CustomerService {

	@Override
	public void Save(Customer customer) {
		System.out.println("Save to db : " + customer.getFirstName());

	}

}
