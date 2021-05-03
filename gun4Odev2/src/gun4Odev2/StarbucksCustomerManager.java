package gun4Odev2;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	private CustomerCheckService customerCheckService;
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	

	public void Save(Customer customer) {
		
		if(customerCheckService.CheckIfRealPerson(customer)) {
			System.out.println("Starbucks kullanýcýsý veritabanýna kaydoldu : "+ customer.getFirstName());
			return;
		}else{
			System.out.println("Kullanýcý doðrulama iþlemi baþarýsýz");
		}
		
	}

}
