import java.util.Scanner;

public class primeRange {
    public  static boolean  isPrime(int n){
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
         return true;
    }
        public static int primeRange(int n){
            for (int i = 2; i <= n; i++) {
                if (isPrime(i)==true) {
                    System.out.println(i);
                }
            }
            return 0;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the range of prime no:");
            int n = sc.nextInt();
            System.out.println(primeRange(n));
            System.out.println("End of code....!");
        }
    }
