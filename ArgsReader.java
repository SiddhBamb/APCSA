import java.util.*;
/**
 * Write a description of class ArgsReader here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArgsReader
{   
    public static void main(String[] args) {
		
		ArrayList<String> arg = new ArrayList<String>();
        System.out.println("Command-line arguments:");
		System.out.println("Press ctrl+c to end program and print a list of the words you entered.");
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			arg.add(scan.next());
		}
		for(int i = 0; i<arg.size(); i++){
			System.out.println(arg.get(i));
		}
	
      //  for (String arg : args) {
           // System.out.println(arg);
      //  }
}
   /* public static void main(String[] args){
        System.out.println("Hello");
        for(int i=0;i<args.length;i++){
           System.out.println(args[i]); 
        }
    }*/
}
