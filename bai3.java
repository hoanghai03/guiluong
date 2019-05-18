import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int x = scanner.nextInt();
        if(x%400==0 || (x%4==0 && x%100!=0)){
            System.out.println("Số ngày trong năm "+ x +" la : 366 ngay");
        } else System.out.println("Số ngày trong năm "+ x +" la : 365 ngay");
    }
}
