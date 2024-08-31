package Excercice;
import java.util.Random;


public class ExerciceOutside {
    public static void main(String[] args) {
        /*write a program that creates and prints a random phone number of the form
        xxx-xxx-xxxx. include the dashes in the output. Do not let the first three digits
        contain 8 or 9 (but no more restrictive than that), and make sure that the second set
        of the three digits is not greater than 742
         */
        Random rand = new Random();
        int number1 = rand.nextInt(7);
        int number2 = rand.nextInt(7);
        int number3 = rand.nextInt(7);
        int midle = rand.nextInt(741);
        int finaln = rand.nextInt(9000);

        String MidleNumber = Integer.toString(midle);
        String FinalNumber = Integer.toString(finaln);
        String FirstNumber= Integer.toString(number1);
        String SecondNumber = Integer.toString(number2);
        String ThirdNumber = Integer.toString(number3);

        while (MidleNumber.length() < 3) {
            MidleNumber = "1" + MidleNumber;
        }
        while (FinalNumber.length() < 4) {
            FinalNumber = "1" + MidleNumber;
        }
        System.out.println(FirstNumber+SecondNumber+ThirdNumber+"-"+MidleNumber+"-"+FinalNumber);
    }
}
