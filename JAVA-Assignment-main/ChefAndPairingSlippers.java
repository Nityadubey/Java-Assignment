import java.util.Scanner;

public class ChefAndPairingSlippers {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int T = sc.nextInt();
            
            while (T-- > 0) {
                
                int N = sc.nextInt();
                int L = sc.nextInt();
                int X = sc.nextInt();
                
                int right = N - L;
                
                int pairs = Math.min(L, right);
                
                System.out.println(pairs * X);
            }
        }
    }
}