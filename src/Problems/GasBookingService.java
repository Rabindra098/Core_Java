package Problems;

import java.util.ArrayList;

public class GasBookingService 
{
	    private ArrayList<GasCustomer> customerList;

	    public GasBookingService() {
	        this.customerList = new ArrayList<>();
	    }

	    public void bookGas(GasCustomer customer) {
	        customerList.add(customer);
	    }

	    public boolean isFirstTimeCustomer(GasCustomer customer) {
	        for (GasCustomer c : customerList) {
	            if (c.getPhoneNumber().equals(customer.getPhoneNumber())) {
	                return false;
	            }
	        }
	        return true;
	    }

	    public int calculateBill(GasCustomer customer, int baseCharge) {
	        return isFirstTimeCustomer(customer) ? 800 : baseCharge;
	    }

	    public String printBill(GasCustomer customer, int billAmount) {
	        return "Gas booking confirmed for " + customer.getCustomerName() + ". Bill Amount: " + billAmount;
	    }
}


