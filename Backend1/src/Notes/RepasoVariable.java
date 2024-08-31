package Notes;

public class RepasoVariable {
public static void main(String [] args){
    byte moveLeft=127;
    short moveLeft2=(short)moveLeft;


 int num1=19,promedio;
 String num2="30";
 //parseo esto es para cambiar una variable de tipo string a numero o viceversa
    int NewNum2=Integer.parseInt(num2);
    promedio=(num1+NewNum2)/2;
    System.out.println(promedio);

}
}
