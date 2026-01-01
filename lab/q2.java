package lab;
import java.io.*;
import java.util.Scanner;
import java.net.URL;
import java.net.URLConnection;
public class q2 {
   public static void main(String[]args) throws Exception{
    URL u = new URL ("http://www.fsktm.um.edu.my");
    URLConnection cnn = u.openConnection();
    InputStream is = cnn.getInputStream();
    Scanner in = new Scanner(is);
    File f = new File("index.htm");
    PrintWriter out = new PrintWriter(f);
    while(in.hasNextLine()){
   
     String line =in.nextLine();
        System.out.println(line);
        out.println(line);
    }
  in.close();
  out.close();
   }
}
