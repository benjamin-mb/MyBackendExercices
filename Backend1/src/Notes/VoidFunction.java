package Notes;
import java.util.Scanner;

public class VoidFunction {
    static int costumerId;
    static String costumerName;
    static String email;
    static String password;
    static boolean status;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        createCostumer();
        printCostumerData();
    }

    public static void createCostumer() {
        //estoes una funcion

        System.out.println("ingrese el id del usuario:");
        costumerId = scan.nextInt();
        System.out.println("ingrese el name:");
        costumerName = scan.nextLine();
        scan.nextLine();
        System.out.println("ingrese el email:");
        email = scan.nextLine();
        System.out.println("ingrese el password:");
        password:
        scan.nextLine();
        System.out.println("seleccione un estado:");
    }

    public static void printCostumerData() {
        System.out.println("id:" + costumerId + "\n" +
                "nombre: " + costumerName + "\n" +
                "correo: " + email + "\n" +
                "status");
    }
/*
    public static String selectStatus(int selection) {
        if (selection == 1) {
            String Active = String.valueOf(StatusUserEnum.True);
        } else {

        }*/



}
