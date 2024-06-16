import java.util.Scanner;

public class Conversor {

    public static String convertir(){
        ConsultaDivisa consulta = new ConsultaDivisa();
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese la moneda base: ");
        String a = teclado.nextLine();

        System.out.println("Ingrese la monda a convertir: ");
        String b = teclado.nextLine();

        Divisa divisa = consulta.divisaApi(a,b);

        System.out.println("Ingrese el monto: ");

        double monto = teclado.nextDouble();

        double resultado = monto * divisa.conversion_rate();

        System.out.printf("Resultado: %.2f",resultado);

        return String.format("[Operacion: %s --- %s\n Monto ingresado: %.2f\n Resultado operacion: %.2f]\n",
                a,b,monto,resultado);
    }

}
