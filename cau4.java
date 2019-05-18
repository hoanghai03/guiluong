import java.util.Scanner;

public class cau4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a= new int[4];
        for(int i=0;i<4;i++){
           a[i] = scanner.nextInt();
        }
        int min=a[0],max=a[0];
        for(int i=1;i<4;i++){
            if(a[i] <a[0]) min=a[i];
            if(a[i] >a[0]) max=a[i];
        }
        System.out.println("so lon nhat va be nhat lan luot la :" + max + " va " + min);
    }
}
