import java.util.Scanner;

public class firstOcurrence {
    public static int check(int arr[],int i,int key){
        if (i==arr.length) {
            return -1;
        }
        if(arr[i]== key){
            return i;
        }
        return check(arr, i+1, key);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter your size of sorted array:");
		int n = sc.nextInt();
        System.out.println("enter your element:");
		int[] marks = new int[n];
		for (int i = 0; i < marks.length; i++) {
			marks[i] = sc.nextInt();
		}
		System.out.print("Array:{");
		for (int i = 0; i < marks.length; i++) {
			if (i > 0 && i < n) {
				System.out.print(",");
			}
			System.out.print(marks[i]);
		}
		System.out.println("}");
        System.out.print("enter your key:");
        int a = sc.nextInt();
        System.out.println(check(marks, 0,a));
    }
}

