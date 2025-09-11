
package eva1_22_aaceso_tabla;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class EVA1_22_AACESO_TABLA {
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
        //Operador and (y)
        if(usuario.equals(ACCESO_USU) && contra.equals(ACCESO_USU)){
            System.out.println("Acceso concedido");
        }else {
            System.out.println("Acceso denegado");
        }
    }
    
}
