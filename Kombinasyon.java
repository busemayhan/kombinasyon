package Giris;
import java.util.Scanner;
public class Kombinasyon {
    public static void main(String[] args) {
        //C(n,r) = n! / (r! * (n-r)!)
        Scanner input=new Scanner(System.in);
        int n;
        int r;
        System.out.print("n sayisini giriniz:" );
        n=input.nextInt();
        //System.out.println("r sayısını giriniz:");
        //r=input.nextInt();

        int total1=1;
        int total2=1;
        int total3=1;
        int kombinasyon;

        for(int i=1;i<=n;i++){
            total1=total1*i;
        }
        //System.out.println(n+"faktoriyel"+total1);

        System.out.print("r sayisini giriniz:");
        r=input.nextInt();
        for(int j=1;j<=r;j++){
            total2=total2*j;
        }
        //System.out.println(r+"faktoriyel"+total2);

        for(int k=1;k<=(n-r);k++){
            total3=total3*k;
        }
        //System.out.println((n-r)+"faktoriyel"+total3);
        kombinasyon=(total1/(total2*total3));
        System.out.println("kombinasyon:"+kombinasyon);
    }
    //C(n,r) = n! / (r! * (n-r)!)

}
