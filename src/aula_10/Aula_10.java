
package aula_10;

import java.util.Scanner;

public class Aula_10 {   
    public static void main(String[] args) {
       
        Scanner nome =  new Scanner(System.in);
        Scanner medias = new Scanner(System.in);
        String qual;
       
         
        int n1,n2,n3,media;
         
      
         System.out.print("Informe seu nome :");
         qual = nome.nextLine();
         
         System.out.print("\ndigite a primeira nota :");
         n1 = medias.nextInt();
         System.out.print("\ndigite a segunda nota :");
         n2 = medias.nextInt();
         System.out.print("\ndigite a segunda nota :");
         n3 = medias.nextInt();
         media = (n1 + n2 +n3)/3;
         
         System.out.println("O seu nome: "
                 +qual+"\nA media é :" + media);
         
        
    }
    
}
