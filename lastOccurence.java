
import java.util.Scanner;

public class lastOccurence {
    public static int last(int arr[],int key,int i){
        if (i==arr.length) {
            return -1;
        }
        int found = last(arr, key, i+1);
        if (found==-1 && arr[i]==key) {
            return i;
            
        }
        return found;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {8,3,6,5,20,2,5,3};
        System.out.println(last(arr, 5, 0));
        }
    }
