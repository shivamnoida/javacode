import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class MyClint {

    Socket s;
    PrintWriter out;
    BufferedReader bsys = new BufferedReader(new InputStreamReader(System.in));
    BufferedReader bout;
    String data;

    MyClint() {
        try {
            s = new Socket(InetAddress.getLocalHost(), 7777);
            System.out.println("Connecting on port 7777");

            System.out.println("Connected with server");
            if (s != null) {
                bout = new BufferedReader(new InputStreamReader(s.getInputStream()));
                out = new PrintWriter(s.getOutputStream(), true);
                boolean check = true;
                while (check) {
                    System.out.print("<< ");
                    String msg = bsys.readLine();
                    out.println(msg);
                    
                    data = bout.readLine();
                    System.out.println("Server: " + data);
                    if (data.equalsIgnoreCase("bye")) {
                        System.out.println("Raam Ram JI");
                        check = false;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bout != null) bout.close();
                if (out != null) out.close();
                if (bsys != null) bsys.close();
                if (s != null) s.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new MyClint();
    }
}
