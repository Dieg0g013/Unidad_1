
package eva1_28_moneda;

import java.util.Scanner;

public class EVA1_28_MONEDA {

    public static void main(String[] args) {
         Scanner captu = new Scanner(System.in);
         String usuario, moneda;
         //Como lanzamos una moneda?
         //Random para elegir algo aleatorio
         System.out.println("Elige aguila o sello (A/S)");
         usuario = captu.nextLine();
         
         double aleatorio = Math.random();
         System.out.println("Numero: " + aleatorio);
         
         if(aleatorio > 0.5){
             moneda = "A";
             System.out.println("Salio aguila");
         } else {
             moneda = "S";
             System.out.println("Salio sello");
         }
         if(usuario.equals(moneda)){
             System.out.println("Ganaste");
         } else {
             System.out.println("Perdiste");
         }
             
         
          }
    
}
