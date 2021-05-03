package gun4Odev2;

public class NeroCustomerManager extends BaseCustomerManager  {
	public void Save(Customer customer) {
		System.out.println("Nero kullanýcýsý veri tabanýna kaydedildi :" + customer.getFirstName() + " " + customer.getLastName());
	}

}
