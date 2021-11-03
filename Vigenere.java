public class Vigenere
{
	//declare instance variables for text and keyword
   String plainText = "";
   String key = "";
   String newKey = "";

	//default constructor
   public Vigenere ()
   {
	   plainText = "Default Text";
	   key = "AAAAAAAAAAAA";
   }
	
	//initialization constructor
   public Vigenere (String theMsg, String theKey)
   {
      plainText = theMsg;
      key = theKey;
   }

	
	//modifier method for text
	public void setPlainText(String text)
	{
		plainText = text;
	}
	
	//modifier method for keyword
	public void setKey(String theKey)
	{
		key = theKey;
	}
	
	//accessor method for text
	public String getPlainText()
	{
		return plainText;
	}
	
	//accessor method for keyword
	public String getKey()
	{
		return key;
	}
	
	//encrypt method
		//return a String
		//no parameters
	   public String encrypt()
      {
         if(key.length() < plainText.length())
		 {
			 String temp = new String(key);
			 for(int i = 0; i < plainText.length(); i++)
			 {
				 newKey = newKey + temp.charAt(i % temp.length());
			 }
		 } else
		 {
			 newKey = key;
		 }
		 int num = 0;
		 int shift = 0;
		 int idx = 0;
		 char cryptChar = '\n';
		 String answer = new String();
		 for (int i = 0; i < plainText.length(); i++)
		 {
			 num = (int)(plainText.charAt(i));
			 shift = (int)(num + newKey.charAt(i));
			 idx = (((shift - 52) % 26) + 65);
			 cryptChar = (char)(idx);
			 answer = answer + cryptChar;
		 }
		 
		 //System.out.println(key);
		 //System.out.println(plainText);
		 return answer;
      }
   
	
	//decrypt method
		//return a String
		//no parameters
	public String decrypt()
	{
		if(key.length() < plainText.length())
		 {
			 String temp = new String(key);
			 for(int i = 0; i < plainText.length(); i++)
			 {
				 newKey = newKey + temp.charAt(i % temp.length());
			 }
		 } else
		 {
			 newKey = key;
		 }
		 int num = 0;
		 int shift = 0;
		 int idx = 0;
		 char cryptChar = '\n';
		 String answer = new String();
		 for (int i = 0; i < plainText.length(); i++)
		 {
			 num = (int)(plainText.charAt(i));
			 shift = (int)(num - newKey.charAt(i));
			 idx = (((shift - 52) % 26) + 65);
			 cryptChar = (char)(idx);
			 answer = answer + cryptChar;
		 }
		 
		 //System.out.println(key);
		 //System.out.println(plainText);
		 return answer;
	}
	
   
   //equals method
      //return a boolean
      //Vigenere reference parameter
	  public boolean equals(Vigenere vig)
	  {
		  boolean sameText = vig.getPlainText().equals(plainText);
		  boolean sameKey = vig.getKey().equals(key);
		  //System.out.println(vig.getPlainText() + " " + vig.getKey() + " " + sameText + " " + sameKey + " " + plainText + " " + key);
		  return sameText && sameKey;
	  }
	
   
	//toString() method
   public String toString()
   {
      return("plain Text     = " + plainText + "\nkey            = " + key + "\nencrypted Text = " + encrypt());
   }
	
}
