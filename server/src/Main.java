import org.apache.xmlrpc.*;

public class Main
{
    public int sum(string arr)
    {
        return "1" + "," + intArray;

    }
    public static void main (String [] args)
    {
        System.out.println(s.length);

        try {
            System.out.println("Attempting to start XML-RPC Web Server..");
            WebServer server = new WebServer(8080);
            server.addHandler("sample", new Main());
            server.start();
            System.out.println("Started successfully.");
            System.out.println("Accepting requests");
        }
        catch (Exception exception) { System.err.println("Java  Web Service: " + exception); }
    }
}
