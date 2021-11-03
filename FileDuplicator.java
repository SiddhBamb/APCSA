import java.util.*;
import java.io.*;

public class FileDuplicator
{
	public static void dup(String fileName) throws FileNotFoundException
	{
		String newFile = fileName.substring(0, fileName.length()-4) + ".Output.txt";
		String output = new String(newFile);
		
		Scanner in = new Scanner(new File(fileName));

		PrintWriter out = new PrintWriter(new File(output));
		
		String a;
		while(in.hasNextLine())
		{
			a = in.nextLine();
			out.println(a);
		}
		out.close();
		System.out.println("Success. Your file was copied. The copy's filename is: " + output);
	}
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the name of the file you would like to duplicate, with the path:");
		String name = new String(scan.nextLine());
		dup(name);
	}
}