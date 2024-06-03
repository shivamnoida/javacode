import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import javax.net.ssl.SSLContext;

class MyServer{
	ServerSocket ss;

	Socket s;
	PrintWriter out;
	BufferedReader bsys=new BufferedReader(new InputStreamReader(System.in));
	BufferedReader bout;
	String data;
	 MyServer(){
		 try {
			ss=new ServerSocket(7777);
			System.out.println("connection on port 9999");
			s=ss.accept();
			System.out.println("connected");
			if(s!=null) {
			bout=new BufferedReader(new InputStreamReader(s.getInputStream()));
			out=new PrintWriter(s.getOutputStream(),true);
			boolean check=true;
			while(check) {
				 data=bout.readLine();
				 System.out.println("clint"+data);
				 if(data.equalsIgnoreCase("bye")) {
					  System.out.println("Raam Ram JI");
					  check=false;
				 }
				 System.out.println("<<");
				String msg=bsys.readLine();
				 out.println(msg);}
		} 
		 }catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
}
public class Server_Socket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyServer();

	}

}
