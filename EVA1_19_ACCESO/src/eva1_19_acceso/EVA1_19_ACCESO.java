
package eva1_19_acceso;

import java.util.Scanner;

public class EVA1_19_ACCESO {
    //Constantes
    final static String ACCESO_USU = "DIEGO";
    final static String ACCESO_CONTRA = "1234";
    final static double PI = 3.1416;
    
    public static void main(String[] args) {
        String usuario, contra;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("*******Control de Acceso******");
        System.out.println("Restaurante La cucaracha Crocante");
        System.out.println("Usuario: ");
        usuario = captu.nextLine();
        System.out.println("Contraseña");
        contra = captu.nextLine();
        
        if(usuario.equals(ACCESO_USU)) {
            if(usuario.equals(ACCESO_USU)) {
            System.out.println("Acceso concedido");
            } else {
            System.out.println("ACCESO DENEGADO");
            }
        } else {
            System.out.println("Incorrecto");
        }
    }
    
}
