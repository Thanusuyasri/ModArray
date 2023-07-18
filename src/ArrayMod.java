import java.util.Scanner;

public class ArrayMod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a= new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = scanner.nextInt();
        }
        int p = scanner.nextInt();
        int power = 1,result = 0;
        for(int i = n-1;i>=0;i--)
        {
            result = (result+((a[i]%p)*power))%p;
            power = (power*10)%p;
        }
        System.out.println(result);
    }
}
