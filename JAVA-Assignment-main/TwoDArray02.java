import java.util.Scanner;

class TwoDArray02
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int r, c;

        System.out.print("Enter number of rows: ");
        r = sc.nextInt();

        System.out.print("Enter number of columns: ");
        c = sc.nextInt();

        int arr[][] = new int[r][c];

        System.out.println("Enter elements:");

        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix is:");

        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}