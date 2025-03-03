package Week2day3;

public class Chrome extends Browser
{
	public void takeSnap()
	{
		System.out.println("Take Snap");

	}
	public void clearCokies()
	{
		System.out.println("Clear Cokies");

	}
	public static void main(String[]args)
	{
		Chrome ch =new Chrome();
		ch.b();
		ch.openURL();
		ch.CloseBrowser();
		ch.clearCokies();
	}
		
	}
