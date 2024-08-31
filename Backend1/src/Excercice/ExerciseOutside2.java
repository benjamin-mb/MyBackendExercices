/*write a program that print the sum of cubes
prompt for and read two integers and print the sum of each value raised to the third
power
 */
package Excercice;
import java.util.Scanner;

public class ExerciseOutside2 {
    public static void main(String[] args) {
        int integer1=0;
        int integer2=0;
        double cube=0;

        Scanner scan= new Scanner(System.in);

        System.out.println("enter the first number:");
        integer1 = scan.nextInt();
        System.out.println("please enter the second number: ");
        integer2= scan.nextInt();
    //math pow es para potenciar
        cube = Math.pow(integer1,3)+Math.pow(integer2,3);
        System.out.println(cube);


    }
}
