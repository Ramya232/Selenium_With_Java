package WeekOneDayTwo;

    public class Browser {

	public void launchbrowser()
	{
		System.out.println("Browser launched successfully");
		
	}
	
	public void loadUrl()
	{
		System.out.println("\"Application URL loaded successfully\"");
	}
	public static void main(String[] args) {
		
		
		Browser b=new Browser();
		b.launchbrowser();
		b.loadUrl();
		
	}

}
