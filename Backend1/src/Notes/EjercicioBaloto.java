package Notes;
import java.util.Random;

public class EjercicioBaloto {
    public static void main(String[] args) {

        Random Random=new Random();
        int user1=36;
        int user2=13;
        int user3=8;
        int user4=76;
        int user5=92;
        int user6=69;

        int Winner = Random.nextInt(100);
        System.out.println(Winner);
        if (user1==Winner){
            System.out.println("User 1 eres el ganador");
        } else if (user2 == Winner) {
            System.out.println("User 2 eres el ganador");
            
        }
        else{
            System.out.println("nadie es ganador");
        }


    }
}
