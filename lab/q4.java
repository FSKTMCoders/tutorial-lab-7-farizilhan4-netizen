package lab;
import java.io.*;
import java.util.Scanner;
public class q4 {
    public static void main(String[] args) throws Exception{
        File f = new File ("words.txt");
        PrintWriter out = new PrintWriter(f);
        out.println("I love coding");
        out.close();

        System.out.println("I love coding");

        Scanner sc = new Scanner(f);
        int charcount =0;
        int wordcount=0;
         
        while(sc.hasNextLine()){
            String characters = sc.nextLine();
            for(int i=0; i<characters.length(); i++){
                if(characters.charAt(i)!= ' '){
                    charcount++;
                
                }   
            }
            String[] word = characters.split(" ");
            for(int j=0; j<word.length; j++){
                wordcount+=1;
            }
                }
        System.out.println("Number of characters : " + charcount);
        System.out.println("Number of words : " + wordcount);
         sc.close();
            }
           
        }
       

