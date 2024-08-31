package Excercice;
import java.util.Scanner;

public class EjercicioPrimerSemestre3 {
    public static void main(String[] args) {
        Scanner lea= new Scanner(System.in);
        int n1, n2,cantidad ;
        System.out.println("cuantas parejas de numero va a ingresar:");
        cantidad = lea.nextInt();
        /*esto se  hace para que el usuario escoga cuantos acciones quiere hacer*/
        for (int i = 0; i < cantidad  ; i++)
        {
            System.out.print("digite el primer numero:");
            n1 = lea.nextInt();
            System.out.print("digite el segundo numero:");
            n2 = lea.nextInt();
            if (n1 < n2)
            {
                System.out.println( n1 + "-" + n2);
            }
            else
            {
                System.out.println( n2 +"-"+n1);
            }
        }
    }

}
