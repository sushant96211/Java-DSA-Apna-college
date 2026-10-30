import java.util.Scanner;

public class isPrime2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your no:");
        int n = sc.nextInt();
        boolean isPrime = true;
        for (int i =2 ; i < Math.sqrt(n); i++) {
            if (n%i==0) {
                isPrime = false;                
            } 
        }
        if (isPrime==true) {
            System.out.println("you no "+n+" is a prime no");
        } else {
            System.out.println("you no "+n+" is not a prime no");
        }
        System.out.println("End of Code....!");
    }
}