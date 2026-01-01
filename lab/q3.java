package lab;
import java.io.*;
import java.util.Scanner;
public class q3 {
    public static void main (String[] args) throws Exception{
        File f1= new File("original.txt");
        Scanner sc = new Scanner(f1);

        File f2 = new File("reverse.txt");
        PrintWriter out = new PrintWriter(f2);

        while(sc.hasNextLine()){
            String line = sc.nextLine();
            String reversed = "";

            for(int i=line.length()-1; i>=0; i--){
                reversed += line.charAt(i);
            }
            out.println(reversed);
        }
        sc.close();
        out.close();
    }
}