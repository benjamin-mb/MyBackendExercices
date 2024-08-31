package Excercice;
import java.util.Scanner;

public class EjercicioPrimerSemestre2 {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        String NT;
        System.out.print("ingrese el nombre del empleado: ");
        NT = lea.next();
        float VH;
        System.out.print("ingrese el salario basico hora: ");
        VH = lea.nextFloat();
        float NHT;
        System.out.print("ingrese el numero de horas trabajadas: ");
        NHT = lea.nextFloat();
        float ST;
        ST = VH * NHT;
        System.out.print("el salario bruto de " + NT + "es: "+ ST);
        float bon;
        if (NHT <= 48)
        {
            bon= 20000;
        }
        else
        {
            if (NHT <= 58)
            {
                bon = 50000;
            }
            else
            {
                bon = 100000;
            }


        }
        System.out.println( "las bonificaciones son: " +bon);
        float Deducciones = 0;
        if( VH <= 5000)
        {
            Deducciones = 10000;
        }
        else
        {
            if ((VH> 5000) && (VH<8000))
            {
                Deducciones = 20000;
            }
            else
            {
                if(VH >= 8000)
                {
                    Deducciones = 50000;
                }
            }
        }
        System.out.println("las deducciones son: " + Deducciones);
        float SN;
        SN = VH * NHT - Deducciones;
        System.out.println("el salario neto de "+ NT + "es: " + SN);
    }
}
