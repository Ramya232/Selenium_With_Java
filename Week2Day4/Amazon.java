package Week2Day4;
public class Amazon extends CanaraBankAbstract 
{
	
	public void cashOnDelivery()
	{
		System.out.println("Implementing interface method - cashOnDelivery");
	}
	public void upiPayments()
	{
		System.out.println("Implementing interface  method - upiPayments");
	}
	public void internetBanking()
	{
		System.out.println("Implementing interface method - internetBanking");
	}
	public void cardPayments() {
		System.out.println("Implementing interface  method -  cardPayments");
		
	}
		
	public static void main(String[] args) {
		Amazon a =new Amazon();
		a.cashOnDelivery();
		a.upiPayments();
		a.internetBanking();
		a.cardPayments();
		a.cardPayments();
	}
		
		
		
	
	public void recordPAymentDetails() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
