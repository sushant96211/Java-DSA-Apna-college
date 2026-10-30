import java.util.Scanner;

public class trappedRainwater{
    public static int rain(int arr[]){
        int n = arr.length;
        int leftmax[] = new int[n];
        leftmax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(leftmax[i-1],arr[i]);
        }

         int rightmax[] = new int[n];
        rightmax[n-1] = arr[n-1];
        for (int i = n-2; i >=0 ; i--) {
            rightmax[i] = Math.max(rightmax[i+1],arr[i]);
    }

    int trapwater = 0;
    for (int i = 0; i < n; i++) {
        int waterlevel = Math.min(leftmax[i],rightmax[i]);
        trapwater += waterlevel - arr[i];   
    }
    return trapwater;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter your size of sorted array:");
		int n = sc.nextInt();
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
            System.out.println(rain(marks));
    }
}

