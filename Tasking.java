public class Tasking        
{ 
// method main():   program starting point
public static void main( String[] args    ) 
   {
      System.out.println("Tasking Exercise\n");
      System.out.println("Trying vision()");
      //... vision();       //: The Liberal Arts and Science Academy cultivates ...
	  vision();
     
      System.out.println("Trying favorite()");
      //... favorite();     //: nbr1 = 1112
      //... favorite();     //: nbr2 = 1112
	  System.out.println("nbr1 = " + Task.favorite());
	  System.out.println("nbr2 = " + Task.favorite());
      
      System.out.println("Trying wasted()");
      //... wasted( 3.75, 30 );   //: 11 gallons
      //... wasted( 7.50,  5 );   //: 4 gallons
	  Task.wasted(3.75, 30);
	  Task.wasted(7.5, 5);
      
      System.out.println("Trying count()");
      //... count( 1.5, 0.9, 500 );   //: 438 beans
      //... count( 2.0, 1.0,  25 );   //: 13 beans
	  System.out.println(Task.count( 1.5, 0.9, 500 ) + " beans");
	  System.out.println(Task.count( 2.0, 1.0,  25 ) + " beans"); 
         
   }
   // method vision(): returns the first line of the LASA vision statement:
	public static void vision()
	{
		System.out.println("The Liberal Arts and Science Academy cultivates ...");
	}
   
}