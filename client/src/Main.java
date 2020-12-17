import org.apache.xmlrpc.*;
import org.junit.Assert;
import java.util.*;


public class Main {

    public  static void main (String [] args)
    {
        try {
            XmlRpcHandler server = new  XmlRpcClient("http://localhost:8080");
            Vector params = new Vector();

            int[]intArray = { 1,2,3,4,5 };
            string joinedString = Arrays.toString(intArray);
            joinedString.assertEquals("[1, 2, 3, 4, 5]", joinedString);

            params.addElement(joinedString);

            Object result = server.execute("sample.sum", params);
            System.out.println(result);
        }
        catch (Exception exception)
        {
            System.err.println("JavaClient: " + exception);
        }
    }
}