
import java.util.*;

public class stack {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        System.out.print("Enter the Size of Stack:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println(st);
    }
}
