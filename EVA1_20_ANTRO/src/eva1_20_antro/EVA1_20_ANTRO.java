
package eva1_20_antro;

import java.util.Scanner;

public class EVA1_20_ANTRO {
    final static String mayor_de_18 = "si";
    final static String crede = "si";
    
    public static void main(String[] args) {
         Scanner captu = new Scanner(System.in);
         String edad, ide;
    
    
    System.out.println("Eres mayor de edad?");
    edad = captu.nextLine();
    if (edad.equals(mayor_de_18)) {
        } else {
        System.out.println("No puedes entrar");
    }
        System.out.println("Cuentas con credencial?");
        ide = captu.nextLine();
        if (ide.equals(crede)) {
            System.out.println("Puedes entrar");
        } else {
            System.out.println("No puedes entrar");
        }
    
        
        
    }
}
    
