package Excercice;
import  java.util.Scanner;

public class EjercicioPrimerSemestre {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        int n1, n2, n3;
        System.out.println("primer numero 1: ");
        n1 = lea.nextInt();
        System.out.println("ingrese numero 2: ");
        n2 = lea.nextInt();
        System.out.println("ingrese numero 3: ");
        n3 = lea.nextInt();
        if ( n1 < n2)
        {
            if(n1<n3)
            {
                System.out.println("el menor es el numero " + n1 );
            }
            else
            {
                System.out.println( n1 + "el menor es "+ n3);
            }
        }
        else
        {
            if (n2 < n3 )
            {
                System.out.println("el menor es " + n2);

            }
            else
            {
                System.out.println("el menor es" + n3);
            }

        }
    }
}
