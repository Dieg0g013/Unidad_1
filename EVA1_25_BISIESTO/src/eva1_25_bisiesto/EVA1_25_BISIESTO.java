
package eva1_25_bisiesto;

import java.util.Scanner;

public class EVA1_25_BISIESTO {
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int year;
        
        System.out.println("Introduce un año");
        year = captu.nextInt();
        
        if(year % 4 != 0){
            System.out.println("No es bisiesto");     
         }
        if((year % 100 == 0) && (year % 400 != 0)){
            System.out.println("No es bisiesto");
        }
        if((year % 100 == 0) && (year % 400 == 0)){
            System.out.println("Es bisiesto");
        }
        if((year % 4 == 0) && (year % 100 != 0)){
            System.out.println("Es bisiesto");
        }
    }
}
