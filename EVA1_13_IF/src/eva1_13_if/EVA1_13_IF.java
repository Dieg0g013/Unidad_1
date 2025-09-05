
package eva1_13_if;

import java.util.Scanner;

public class EVA1_13_IF {
    public static void main(String[] args) {
        double califa;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Introduce la calificacion");
        califa = captu.nextDouble();
        //Estructura de control IF - THEN - ELSE
        //IF solo evalua verdadero (true) o falso (false)
        if (califa >= 70) { 
            //Aquí va lo que corresponde a verdadero
            System.out.println("Felicitaciones, acreditaste!!"); 
        } else {
            //Aquí va lo que corresponde a falso (opcional)
            System.out.println("Azotes!!");
        }
    }
    
}
