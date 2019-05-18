import java.util.Scanner;

public class ptb2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        float a=scanner.nextFloat();
        float b=scanner.nextFloat();
        float c=scanner.nextFloat();
        ptbac2(a,b,c);

    }

    public static void ptbac2 (float a, float b ,float c) {
        if(a==0){
            if(b==0) System.out.println("pt vo so nghiem");
            else {
                float x=  -b/a;
                System.out.println("nghiem x la : "+ x);
            }
            return;
        }
        float x1,x2;
        float delta = b*b-4*a*c;
        if(delta<0) {
            System.out.println("pt vo nghiem");
        }
        else if(delta==0) System.out.println("pt co nghiem kep x1 = x2 = "+ (double) -b/2*a );
        else {
            x1 = (float) (-b+Math.sqrt(delta)/(2*a));
            x2 = (float) (-b-Math.sqrt(delta)/(2*a));
            System.out.println("pt co 2 nghiem phan biet x1 = "+ x1 +"va x2 = "+ x2);
        }

    }
}
