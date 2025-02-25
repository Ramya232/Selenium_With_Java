package Week1Day4;

public class FindDups {		

	public static void main(String[] args) {
		
		    int num[] = {12, 11, 40, 12, 5, 6, 5, 12, 11};
		    		    
		    for (int a=0;a<num.length-1;a++)
		    {
		    	for(int b=a+1;b<num.length;b++)
		    	{
		    		if (num[a]==num[b]) 
		    		{
		    			System.out.println("Duplicate number" +num[a]);
		    		}
		    	}
		    }
		    
		 }
		 
		    	
} 