//Ejercicio 1
import java.util.Scanner;
public class proyecto
{
    public static void main(String [] args)
    {
        Scanner lectura = new Scanner(System.in);
        //RETO 1
        System.out.println("Ingrese la temperatura F°");
        double F = lectura.nextDouble();
        double C = (F - 32) / 1.8;
        System.out.println("Temperatura a C° " + Math.round(C));
       
        //RETO 2
        /*System.out.println("Ingrese los meses del bebe ");
        double edad = lectura.nextDouble();
        System.out.println("Ingrese el peso del bebe ");
        double peso = lectura.nextDouble();
        double dosisvacuna = (peso + 10) / (edad * 10) * 8;
        System.out.println("Dosis de vacunas: " + Math.round(dosisvacuna));*/

    }
}

