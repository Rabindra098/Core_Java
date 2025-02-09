package Problems;

public class GasBookingServiceTester 
{
	 public static void main(String[] args) {
	        GasBookingService service = new GasBookingService();
	        GasCustomer customer1 = new GasCustomer(1, "Alice", "123 Street", "1234567890");
	        GasCustomer customer2 = new GasCustomer(2, "Bob", "456 Avenue", "0987654321");

	        service.bookGas(customer1);
	        service.bookGas(customer2);

	        System.out.println("Is first-time customer (Alice): " + service.isFirstTimeCustomer(customer1));
	        System.out.println("Is first-time customer (Bob): " + service.isFirstTimeCustomer(customer2));

	        int bill1 = service.calculateBill(customer1, 200);
	        int bill2 = service.calculateBill(customer2, 200);
	        
	        System.out.println(service.printBill(customer1, bill1));
	        System.out.println(service.printBill(customer2, bill2));
	    } 
}
