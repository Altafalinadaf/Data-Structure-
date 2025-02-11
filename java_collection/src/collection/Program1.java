package collection;

// this is example of polymorpism

interface PaymentMethod  {
	void pay();
}

class UPI implements PaymentMethod{
	public void pay() {
		System.out.println("pay using UPI");
	}
}


class PhonePay implements PaymentMethod{
	public void pay() {
		System.out.println("pay using phone pay");
	}
}

class GooglePay implements PaymentMethod{
	public void pay() {
		System.out.println("pay using google pay ");
	}
}

public class Program1 {
	public void disp(PaymentMethod p) {
		p.pay();
	}
	
	public static void main(String[] args) {
		
		// this is old version 
//		UPI upi=new UPI(); // it cannot hold the object of other class // it holds only its own class object 
//		upi.pay();
		
		//PaymentMethod p1=new UPI();
		PaymentMethod p1=new GooglePay();
		p1.pay();
		
	}

}
