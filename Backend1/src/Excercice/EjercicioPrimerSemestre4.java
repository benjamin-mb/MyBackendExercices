package Excercice;
import java.util.Scanner;

public class EjercicioPrimerSemestre4 {
    public static void main(String[] args) {
        Scanner lea= new Scanner(System.in);
        System.out.println("cuntas ventas va a ingresar");
        int N;
        N=lea.nextInt();
        for (int i = 0; i < N; i++)
        {
            System.out.print("ingrese el nombre del articulo comprado:");
            String NA;
            NA = lea.next();
            System.out.print("ingrese el identificador de la linea del producto:");
            char linea;
            linea = lea.next().charAt(0);
            System.out.print("ingrese el valor unitario de el producto:");
            float VP;
            VP = lea.nextFloat();
            System.out.print("ingrese la cantidad de articulos comprados de l producto "+ NA +": ");
            int CP;
            CP = lea.nextInt();
            switch(linea)
            {
                case 'A':
                {
                    System.out.println("*********FACTURA*********");
                    float VB;
                    VB = (VP * CP);
                    System.out.print("el valor bruto de la compra es:");
                    System.out.println(VB);
                    float IVA;
                    IVA = VB * 4 / 100;
                    System.out.print("IVA:");
                    System.out.println(IVA);
                    float VN;
                    VN = IVA + VB;
                    System.out.print("valor neto:");
                    System.out.println(VN);
                    break;
                }
                case 'F':
                {
                    System.out.println("*********FACTURA*********");
                    float VB;
                    VB = (VP * CP);
                    System.out.print("el valor bruto de la compra es:");
                    System.out.println(VB);
                    float IVA;
                    IVA = VB * 19 / 100;
                    System.out.print("IVA:");
                    System.out.println(IVA);
                    float VN;
                    VN = IVA + VB;
                    System.out.print("valor neto:");
                    System.out.println(VN);
                    break;
                }
                case 'V':
                {
                    System.out.println("*********FACTURA*********");
                    float VB;
                    VB = (VP * CP);
                    System.out.print("el valor bruto de la compra es:");
                    System.out.println(VB);
                    float IVA;
                    IVA = VB * 15 / 100;
                    System.out.print("IVA:");
                    System.out.println(IVA);
                    float VN;
                    VN = IVA + VB;
                    System.out.print("valor neto:");
                    System.out.println(VN);
                    break;
                }
                case 'E':
                {
                    System.out.println("*********FACTURA*********");
                    float VB;
                    VB = (VP * CP);
                    System.out.print("el valor bruto de la compra es:");
                    System.out.println(VB);
                    float IVA;
                    IVA = VB * 22 / 100;
                    System.out.print("IVA:");
                    System.out.println(IVA);
                    float VN;
                    VN = IVA + VB;
                    System.out.print("valor neto:");
                    System.out.println(VN);
                    break;
                }
                default:
                {
                    System.out.println("ERROR");
                    System.out.println("REVISE LA LINE QUE INGRESO SOLO EXITEN (A/F/V/E)");
                    break;
                }
            }
        }
    }
}
