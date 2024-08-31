package Excercice;
import java.util.Scanner;

public class EjercicioPrimerSemestre6 {
    public static void main(String[] args) {
        Scanner lea = new Scanner (System.in);
        /*ejemplo como dr hace para validar sexo*/

        char Nr, Sx, labor, BAN;
        BAN = '0';
        String nom;
        float DT=0,VRD=0, VRP=0, As=0, Ad=0, Ar=0, TOTAL=0;
        int cm=0, cf=0;
        System.out.print("Desea ingresar el primer Trabajdor=");
        Nr= lea.next().charAt(0);

        do
        {
            if (BAN == '0')
            {
                System.out.print("Digite el sexo: ");
                BAN = '1';
            }
            else
            {
                System.out.print("Error, vuelva y digite el sexo: ");
            }
            Sx = lea.next().charAt(0);
        }
        while ((Sx != 'F') && (Sx != 'M') && (Sx != 'f') && (Sx != 'm'));

        /*ejemplo para buscar los dias trabajados correctamente depenfiendo de la labor, si la labor no existe no funciona*/
        System.out.print("dias trabajados:");
        DT = lea.nextFloat();
        System.out.print("ingrese el valor del dia:");
        VRD= lea.nextFloat();
        BAN = '0'; /* esto es llamad bandera y se hace para realizar validacion de datos por si una persona se equivoca, esto se utiliza con el do while mayormente*/
        do /* este ciclo do while lo estamos haciendo para que  haga mientras la letra sea diferente de rds o RDS */
        {
            if (BAN == '0')
            {
                System.out.println("ingrese la labor relizada:");
                BAN = '1';
            }
            else
            {
                System.out.println(" error, ingrese de nuevo la labor relizada:");
            }
            labor = lea.next().charAt(0);
        }
        while ((labor != 's') && (labor != 'r') && (labor != 'd') && (labor != 'S') && (labor != 'R') && (labor != 'D'));
        VRP = DT * VRD;
    }
}
