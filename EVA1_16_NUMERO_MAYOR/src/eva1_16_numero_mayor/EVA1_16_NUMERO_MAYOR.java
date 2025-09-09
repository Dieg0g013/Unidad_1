
package eva1_16_numero_mayor;

import java.util.Scanner;

public class EVA1_16_NUMERO_MAYOR {

    public static void main(String[] args) {
        int num1, num2;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Introduce el primer numero");
        num1 = captu.nextInt();
        
        System.out.println("Introduce el segundo numero");
        num2 = captu.nextInt();
        
        if (num1 > num2) {
            System.out.println("El numero mayor es el primero");
        } else {
            if (num1 == num2) {
            System.out.println("Son iguales");
            } else {
                 System.out.println("El numero mayor es el segundo");
            }
        }
    }
    
}
