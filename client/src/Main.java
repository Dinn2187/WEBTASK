import org.apache.xmlrpc.*;

import java.util.*;


public class Main {

    public  static void main (String [] args)
    {
        try {
            XmlRpcHandler server = new  XmlRpcClient("http://localhost:8080");
            Vector params = new Vector();

            int[]intArray = { 1,2,3,4,5 };
            joinedString = Arrays.toString(intArray);
            assertEquals("[1, 2, 3, 4, 5]", joinedString);

            try
            {
                a = Integer.parseInt(args[0]);
                b = Integer.parseInt(args[1]);
            }
            catch(Exception e)
            {
                System.out.println("Error"+e);
            }
            params.addElement(a);
            params.addElement(b);
            Object result = server.execute("sample.sum", params);
            int sum = ((Integer) result).intValue();
            System.out.println(a+"\n"+b+"\n"+"The sum is: "+ sum);
        }
        catch (Exception exception)
        {
            System.err.println("JavaClient: " + exception);
        }
    }
}