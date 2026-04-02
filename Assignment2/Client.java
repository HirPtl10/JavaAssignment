import java.net.*;
import java.io.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost", 9000);
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        Scanner sc = new Scanner(System.in);
        String msg;
        while (!(msg = sc.nextLine()).equalsIgnoreCase("bye")) {
            out.println(msg);
            System.out.println(in.readLine());
        }
        out.println("bye");
        s.close();
    }
}
