
package Palindrome;

import java.util.Scanner;


public class Palindrome {

 
    public static void main( String[] args) {
       
        String T =" ";
        System.out.println("Veuillez entrer le mot à tester");
        Scanner  sc = new Scanner(System.in);
        T = sc.nextLine();
       
        int i= 0;
       int j=T.length() -1 ;
       
       System.out.println(T);
       
       while ((i<j) && (T.charAt(i) == T.charAt(j)))
       {
           i=i+1; j=j-1;
           
       }
        if ((T.charAt(i))!= T.charAt(j)){
           System.out.println("n'est pas un palindrome");
       }
           else 
           System.out.println("Est un palindrome");
    
       
    
    
  }
}
