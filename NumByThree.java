import java.util.Scanner;
public class NumByThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        if(findNum(arr, n)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        sc.close();
    }

    static boolean findNum(int[] arr,int n) {
        int sum = 0;
        for(int i=0;i<n;i++) {
            sum += arr[i];
        }
        if(sum%3 == 0) {
            return true;
        } else {
            return false;
        }
    }
}