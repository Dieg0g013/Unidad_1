
package eva1_26_operaciones;
public class EVA1_26_OPERACIONES {
    public static void main(String[] args) {
        int val = 1, val2 = 3;
        int resu;
        resu = val / val2;
        System.out.print("1 / 3 = ");
        System.out.println(resu);
        
        double v = 7, v2= 3;
        double res;
        res = v / v2;
        System.out.println("7.0 / 3.0");
        System.out.println(res);
        
        //Calcular el residuo
        //Residuo = modulo = %
        int num = 2024, num2 = 4;
        int resi;
        resi = num % num2; //Calculo de residuo
        System.out.println("Residuo de 2024 % 4 = ");
        System.out.println(resi);
        if(resi == 0){
            System.out.println("Puede que sea bisiesto");
        }
    }
    
}
