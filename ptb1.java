import java.text.DecimalFormat;
import  java.util.Scanner;

public class ptb1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat=new DecimalFormat("#.###");
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        double x;
        if(a==0){
            if(b==0) System.out.println("pt vo so nghiem");
            else System.out.println("pt vo nghiem");
        }
        else{
            x= (double) -b/a;
            System.out.println("nghiem x la : "+ decimalFormat.format(x));
        }

    }
}
