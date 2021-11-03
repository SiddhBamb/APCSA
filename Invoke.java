// name:  
// purpose: demonstrate further method prowess

public class Invoke 
{
   // method piggyBank(): returns what the change is worth in cents
	public static int piggyBank(int pennies, int nickels, int dimes, int quarters, int halfDollars)
	{
		int cashValue = pennies + (5*nickels) + (10*dimes) + (25*quarters) + (50*halfDollars);
		return cashValue;
	}

	// method mp4Sizer(): estimates the number of gB needed to store media
	public static int mp4Sizer(int songs, int videos, int photos)
	{
		double storageSize = ((3.04 * songs) + (89.3 * videos) + (1.72 * photos))/1000;
	
		if((int)storageSize == storageSize)
		{
			int finalStorageSize = (int)(storageSize);
			return finalStorageSize;
		} else
		{
			int finalStorageSize = (int)(storageSize + 1);
			return finalStorageSize;
		}
		
	}
	
}
