package utils;

public class CommonUtils 
{
	
	public static void sleep(long milli)
	{
		try {
			Thread.sleep(milli);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}

}
