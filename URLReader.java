import java.net.*;
import java.io.*;
import java.util.*;

public class URLToFile {
    public static void main(String[] args) throws Exception
	{
		Scanner scan = new Scanner(System.in)
		System.out.println("Enter website URL:");
		String website = new String(scan.next());
        URL oracle = new URL(website);
        BufferedReader in = new BufferedReader(new InputStreamReader(oracle.openStream()));
		System.out.println
		PrintWriter out = new PrintWriter(new File())
        String inputLine;
        while ()
            System.out.println(inputLine);
        in.close();
    }
}