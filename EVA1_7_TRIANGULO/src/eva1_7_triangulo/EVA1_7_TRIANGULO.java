
package eva1_7_triangulo;

public class EVA1_7_TRIANGULO {

    public static void main(String[] args) {
        //AREA TRIANGULO
        //AREA = (BASE X ALTURA) ENTRE 2;
        double area, base, altura;// tres variables de tipo double
        //INCIALIZACIÓN:
        base = 11;
        altura = 3;
        //SE APLICA PRECEDENCIA DE OPERADORES
        area = (base * altura) / 2.0;//CUIDADO CON DIVIDIR ENTRE ENTEROS
        System.out.println("El area de un triangulo base 11 y altura 3 es de: ");
        System.out.println(area);
    }
    
}
