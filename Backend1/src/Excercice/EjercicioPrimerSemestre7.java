package Excercice;
import java.util.Scanner;
public class EjercicioPrimerSemestre7 {
    public static void main(String[] args) {
        Scanner lea = new Scanner (System.in);
        int op = 0;
        do
        {
            System.out.println("          MENU");

            System.out.print("          1.MULTIPLICACION");
            System.out.print("          2.POTENCIA");
            System.out.print("          3.DIVISION");
            System.out.print("          4. SUMMA");
            System.out.print("          5.RESTA");
            System.out.println("          6.SALIR");

            System.out.print("          elija su opcion:");
            op = lea.nextInt();
            switch (op)
            {
                case 1 ->
                {
                    potencia(op);
                }

                case 2 ->
                {
                    double base, exp,rdo; /* double es un float pero con mas capacidad,esro se puso para poder usar el math.pow que es potencia*/
                    System.out.println("\n\n");
                    System.out.println("////////////////POTENCIA////////////////");
                    System.out.println("");
                    System.out.print("DIGITE LA BASE: ");
                    base =lea.nextFloat();
                    System.out.print("DIGITE EL EXPONENTE: ");
                    exp= lea.nextFloat();
                    rdo = Math.pow(base, exp);
                    System.out.println("");
                    System.out.println(base + " ELEVADO A LA "+ exp + "ES IGUAL A "+ rdo );
                    System.out.println("\n\n");
                    System.out.println("para volver al menu dijite un caracter y presione enter");
                    char BAN = lea.next().charAt(0);

                }
            }
        }
        while (op != 6);


    }
    public static void potencia (int op)
    {
        Scanner lea= new Scanner (System.in);
        double n1, n2,rdo; /* double es un float pero con mas capacidad,esro se puso para poder usar el math.pow que es potencia*/
        System.out.println("\n\n");
        System.out.println("////////////////MULTIPLICACION ////////////////");
        System.out.println("");
        System.out.print("DIGITE EL MULTIPLICANDO: ");
        n1 =lea.nextFloat();
        System.out.print("DIGITE EL MULTIPLICADOR: ");
        n2= lea.nextFloat();
        rdo = n1 * n2;
        System.out.println("");
        System.out.println(" la multiplicacion entre " +n1+ " por "+ n2+ "es: "+ rdo);
        System.out.println("\n\n");
        System.out.println("para volver al menu dijite un caracter y presione enter");
        char BAN = lea.next().charAt(0);
    }


}
