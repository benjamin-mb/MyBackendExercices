package Excercice;
import java.util.Scanner;

public class EjercicioPrimerSemestre5 {
    public static void main(String[] args) {
        Scanner lea =new Scanner (System.in);
        char Nr, Sx, labor, BAN;
        BAN = '0';
        String nom;
        float DT=0,VRD=0, VRP=0, As=0, Ad=0, Ar=0, TOTAL=0;
        int cm=0, cf=0;
        System.out.print("Desea ingresar el primer Trabajdor=");
        Nr= lea.next().charAt(0);
        while ((Nr == 'S')||(Nr == 's'))
        {
            System.out.print("ingrese el nombre:");
            nom = lea.next();
            BAN = '0';

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
            System.out.print("salario de "+ nom + "es: " + VRP);
            if ((Sx == 'F')|| (Sx == 'f')) /*estos son contadores*/
            {
                cf = cf + 1; /*o puede ser cf++; */
            }
            else
            {
                cm++;
            }
            switch (labor) /*estos son acumuladores*/
            {
                case 'S','s' ->
                        As = As + VRP;

                case 'R','r'->
                        Ar = Ar + VRP;

                case 'D' ,'d'->
                        Ad = Ad + VRP;

                default ->
                {
                    System.out.println("error en el ingreso de labor");
                }
            }

            System.out.println("");
            System.out.print("DESEA INGRSAR OTRO TRABAJADOR");
            Nr= lea.next().charAt(0);
        }
        System.out.println("");
        System.out.println("/////////////////////////////////////////////////////////////////////////////////");
        System.out.println("Cantidad de mujeres: " + cf);
        System.out.println("Cantidad de hombres: " + cm);
        System.out.println("total pagado en siembra: "+ As);
        System.out.println("total pagado en deshierbe: "+ Ad);
        System.out.println("total pagado en recoleccion: "+ Ar);
        TOTAL = As + Ar + Ad;
        System.out.println("la nomina total pagada en la finca es: " + TOTAL);
    }
}
