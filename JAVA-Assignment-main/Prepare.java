import java.util.Scanner;

class Prepare
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num , result ; 
		System.out.print("Enter a number: ");
		num = sc.nextDouble();
		result = Math.sqrt(num);
		System.out.println("The square root of " + num + " is " + result);
        sc.close();
	}
}
        