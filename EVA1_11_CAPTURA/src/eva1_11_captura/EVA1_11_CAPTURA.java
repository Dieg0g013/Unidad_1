
package eva1_11_captura;

import java.util.Scanner;

public class EVA1_11_CAPTURA {

    public static void main(String[] args) {
        //Calculo de velocidad:
        //Solicitar distancia (M) y tiempo (S)
        //Calcular la velocidad (M/S)
        //Declarar variables y scanner
        
        //Solicitar datos
        
        //Realizar calculos
        
        //Mostrar resultados
        Scanner captu = new Scanner(System.in);
        double M, S, op, km;
        
        System.out.println("Ingrese la distancia en metros");
        M = captu.nextDouble();
        //distancia
        
        System.out.println("Ingrese el tiempo en segundos");
        S = captu.nextDouble();
        //Tiempo
        
        //Resultados
        op = M / S;
        System.out.println("La velocidad es: ");
        System.out.print(op);
        System.out.println("m/s");
        
        //Formula
        System.out.println("El resultado en km/h es: ");
        km = op * 3.6;
        System.out.print(km);
        System.out.println("km/h");
    }
    
}
