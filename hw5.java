//Написать метод, которому в качестве аргументов передается строка и число, 
//метод должен отпечатать в консоль указанную строку, указанное количество раз;
import java.util.Scanner;
 public class hw5 {

     public static void main(String[] args) {

         Scanner in = new Scanner(System.in);
         System.out.print("Stroka: ");
         String a = in.nextLine();
         System.out.print("Number: ");
         int b = in.nextInt();
         var r = a.repeat(b);
         System.out.print(r);
         in.close();
     }
 }