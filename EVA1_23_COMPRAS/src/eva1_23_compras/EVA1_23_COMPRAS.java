
package eva1_23_compras;

import java.util.Scanner;

public class EVA1_23_COMPRAS {
     final static String credi = "si";
    final static String efe = "si";

    public static void main(String[] args) {
        String crede, efec;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Cuentas con efectivo?");
        efec = captu.nextLine();
        System.out.println("Cuentas con credito?");
        crede  = captu.nextLine();
        
        if(efec.equals(efe) || crede.equals(credi)){
            System.out.println("Puedes comprar");
        } else {
            System.out.println("No puedes comprar");
        }
        
    }
    
}
