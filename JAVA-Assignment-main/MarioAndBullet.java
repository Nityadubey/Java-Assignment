import java.util.Scanner;

public class MarioAndBullet {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int T = sc.nextInt();
            
            while (T-- > 0) {
                
                int X = sc.nextInt();
                int Y = sc.nextInt();
                int Z = sc.nextInt();
                
                int travelTime = Y / X;
                
                int waitTime = Math.max(0, Z - travelTime);
                
                System.out.println(waitTime);
            }
        }
    }
}