# Tutorial 7
1.
#a
```java
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Random;

public class TextFileWrite{
    public static void main(String[]args)throws Exception{
        Random rd= new Random();
        PrintWriter out = new PrintWriter(new FileWriter("integer.txt"));

    for(int i=0; i<10; i++){
        out.println(rand.nextInt(1001));
    }
    out.close();
    }
}
#b
```java
import java.io.File;
import java.util.Scanner;

public class TextFileRead{
    public static void main(String[]args) throws Exception{
        Scanner sc = new Scanner(new File("integer.txt"));
        int max = Integer.MIN_VALUE;

        while(sc.hasNextInt()){
            int num = sc.nextInt();
            System.out.println(num);
            if(num>max){
                max=num;
            }
        }
    System.out.println(" Largest integer: "+max);
    sc.close();
    }
}
