
import java.util.Scanner;

public class shortest {
    public static int shortD(String str){
        int x = 0;
        int y = 0;
        for (int i = 0; i < str.length(); i++) {
            char dir = str.charAt(i);
            if (dir == 'E') {
                x++;
            } else if(dir == 'N'){
                y++;
            }
            else if(dir == 'S'){
                y--;
            }
            else{
                x--;
            }
        }
        int X = x*x;
        int Y = y*y;
      return (int) Math.sqrt(X + Y);
    }
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the path:");
        String  path = sc.nextLine();
        System.out.println("shortest dis:"+shortD(path));
    }
}
