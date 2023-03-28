import java.util.Scanner;
public class ardisikToplam {
    public static int sum(int n1,int n2) {
        int result = 0;
        for (int i = n1;i <= n2;i++)
            result += i;
        return result;
        }

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String x;

        do{
            System.out.print("Toplamaya başlamak istediğiniz sayıyı yazınız:");
            int a = input.nextInt();
            System.out.print("Toplamayı bitirmek istediğiniz sayıyı yazınız:");
            int b = input.nextInt();

            System.out.println(a + " sayısından " + b + " sayısına kadar olan toplam =" + sum(a, b));
            System.out.println("---------------");
            System.out.println("UYARI! ^ Siz 'a' tuşuna basana kadar işlem devam edecektir. ^");
            System.out.println("# Devam etmek için herhangi bir tuşa basın. #");
            x=input.next();
        }
        while(!x.equals("a")) ;
    }
}
