
package eva1_24_califas;

import java.util.Scanner;

public class EVA1_24_CALIFAS {
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int Cal;
        
        System.out.println("Introduce tu calificacion en numero");
        Cal= captu.nextInt();
        
        if ((Cal >= 90)&&(Cal <=100)){
            System.out.println("A");
        } else {
        }
        if ((Cal >= 80)&&(Cal <=89)) {
            System.out.println("B");
        } else {  
        }
         if ((Cal >= 70)&&(Cal <=79)) {
            System.out.println("C");
        } else {   
         }
          if ((Cal >= 60)&&(Cal <=69)) {
            System.out.println("D");
        } else { 
          }
           if ((Cal >= 0)&&(Cal <=59)) {
            System.out.println("F");
            } 
                      if (Cal > 100) {
                System.out.println("No es valido");
        }
    }                 
}
