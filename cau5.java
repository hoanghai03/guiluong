import java.util.Scanner;

public class cau5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a=scanner.nextFloat();
        float b=scanner.nextFloat();
        float c=scanner.nextFloat();
        if(a+b>c || a+c>b || b+c>a){
            System.out.println("cos the tao thanh tam giac");
            float chuvi;
            chuvi=a+b+c;
            System.out.println("chu vi tam giac la : " + chuvi);
        }
        else System.out.println("khong the tao thanh tam giac");
    }
}
