import java.net.*;
import java.io.*;
import java.util.*;

public class URLToFile {
    public static void main(String[] args) throws Exception
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter website URL:");
		String website = new String(scan.next());
        URL oracle = new URL(website);
        BufferedReader in = new BufferedReader(new InputStreamReader(oracle.openStream()));
		System.out.println("Enter output file name:");
		String outFile = new String(scan.next());
		PrintWriter out = new PrintWriter(new File(outFile));
        String inputLine;
        while((inputLine = in.readLine()) != null)
		{
            out.println(inputLine);
		}
        in.close();
		out.close();
    }
}