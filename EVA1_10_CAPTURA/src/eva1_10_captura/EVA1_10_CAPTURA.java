
package eva1_10_captura;

import java.util.Scanner;

public class EVA1_10_CAPTURA {
    public static void main(String[] args) {
        //Solicitar la temperatura en farenheit
        Scanner captu = new Scanner(System.in);
        double far, cent;
        //CAPTURA:
        System.out.println("Temperatura en grados Farenheit: ");
        far = captu.nextDouble();
        //Darle la temperatura en grados centigrados
        cent = 5*(far - 32) / 9;
        System.out.println("La temperatura es: ");
        System.out.println(cent);
        
    }
    
}
