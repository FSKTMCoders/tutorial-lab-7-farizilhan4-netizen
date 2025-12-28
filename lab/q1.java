package lab;
import java.io.*;
import java.util.Scanner;
public class q1 {
    public static void main(String[] args) throws Exception{
 File f = new File("coursename.dat");
 FileOutputStream fos = new FileOutputStream(f);
 DataOutputStream out = new DataOutputStream(fos);

    out.writeUTF("WXES1116");
    out.writeUTF("WXES1115");
    out.writeUTF("WXES1110");
    out.writeUTF("WXES1112");
        out.close();

Scanner sc = new Scanner(System.in);
System.out.println("Enter course code: ");
String usercode = sc.nextLine();
DataInputStream in = new DataInputStream(new FileInputStream(f));
boolean matched = false; //creates a variable to remember whether a match was found while reading the file.


while(in.available()> 0){ //While there is still data left to read from the file, keep doing the loop
    String code = in.readUTF();
    if(usercode.equals(code)){
        matched = true;
    if(code.equals("WXES1116")){
        System.out.println("Programming I");
    } else if(code.equals("WXES1115")){
        System.out.println("Data Structure");
    } else if(code.equals("WXES1110")){
        System.out.println("Operating System");
    } else if(code.equals("WXES1112")){
        System.out.println("Computing Mathematics");
       break;  //set matched to true if a match is found  
    }
    }
 }
 in.close();
sc.close();
}
    }
