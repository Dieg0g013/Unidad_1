
package eva1_17_if_anidaado;

import java.util.Scanner;

public class EVA1_17_IF_ANIDAADO {

    public static void main(String[] args) {
        int dia;
        Scanner day = new Scanner(System.in);
        System.out.println("Numero del dia de la semana");
        dia = day.nextInt();
        
        if(dia == 1) {
            System.out.println("Domingo");
        } else if(dia == 2) {
            System.out.println("Lunes");
        } else if (dia == 3) {
            System.out.println("Martes");
        } else if(dia == 4) {
            System.out.println("Miercoles");
        } else if(dia == 5) {
            System.out.println("Jueves");
        } else if(dia == 6) {
            System.out.println("Viernes");
        } else if(dia == 7) {
            System.out.println("Sabado");
        } else {
            System.out.println("El dia no es valido");
        }
       
    }
    
}
