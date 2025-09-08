
package eva1_15_descuento;

import java.util.Scanner;

public class EVA1_15_DESCUENTO {

    public static void main(String[] args) {
        int venta;
        double desc, prec;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Cual fue el precio de la venta");
        venta = captu.nextInt();
        
        if (venta > 1000) {
            System.out.println("Tienes un descuento del 15% que seria:");
            desc = venta * .15;
            System.out.println(desc);
            System.out.println("El precio con descuento quedaria en: ");
            prec = venta - desc;
            System.out.println(prec);
        } else {
            System.out.println("No aplica descuento");
        }
                
        
    }
    
}
