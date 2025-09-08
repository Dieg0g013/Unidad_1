
package eva1_14_if_votarr;

import java.util.Scanner;

public class EVA1_14_IF_VOTARR {

    public static void main(String[] args) {
        int año, edad;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Introduce el año de nacimiento");
        año = captu.nextInt();
        edad = 2025 - año;
        
        if (edad >= 18) {
            System.out.println("Puedes votar");
        } else {
            System.out.println("No puedes votar");
        }
    }
    
}
