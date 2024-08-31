package Notes;

import java.util.Scanner;

public class Switch {


    static String productName;
    static int productId;
    static double cost;
    static float profit;
    static double price;

    static Scanner sc= new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    public static void createProduct(){
        //arrays
        String []product= new String[5];// es un array statico porq solo permite 5


        System.out.println("id: ");
        productId=sc.nextInt();
        product[0]=productId+"";
        System.out.println("productName: ");
        productName = sc.next();
        product[1]= productName;
        System.out.println("cost: ");
        cost=sc.nextDouble();
        product[2]=Double.toString(cost);
        System.out.println("profit");
        profit=sc.nextFloat();
        product[3]=Float.toString(profit);
        System.out.println("Precio: ");
        price=calculatePrice(profit,cost);
        product[4]=Double.toString(price);
        System.out.println(price);
    }

    public static double calculatePrice(float profit, double cost){
        double price = cost/(1-(profit/100));
        return price;
    }

    public static void printProduct(){
        System.out.println("id: "+productId+"\n"+
                "nombre producto: "+productName+"\n"+
                "precio: "+ price);
    }
    public static void menu(){
        System.out.println("Seleccione 1.Crear producto  2.Ver producto");
        int opc= sc.nextInt();
        sc.nextLine();

        switch(opc){
            case 1:
                System.out.println("crear producto");
                createProduct();
                break;
            case 2:
                System.out.println("ver producto");
                printProduct();
                break;
            default:
                System.out.println("ingrese una op valida");
        }
    }
}
