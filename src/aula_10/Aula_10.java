
package aula_10;

import java.util.Scanner;

public class Aula_10 {   
    public static void main(String[] args) {
        System.out.println("Hello World!");
         int n1,n2,n3,media;
         Scanner medias = new Scanner(System.in);
         
         System.out.println("digite a primeira nota");
         n1 = medias.nextInt();
         System.out.println("digite a segunda nota");
         n2 = medias.nextInt();
         System.out.println("digite a segunda nota");
         n3 = medias.nextInt();
         media = (n1 + n2 +n3)/3;
         System.out.println("a media é :" + media);
         
        
    }
    
}
