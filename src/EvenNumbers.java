import java.util.Scanner;

//Even Numbers from User's given range 
public class EvenNumbers {

	public static void main(String[] args) {
		int a,n;
		System.out.println("Enter the First Value: ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		System.out.println("Enter the last value: ");
		n = sc.nextInt();
		System.out.println("Even numbers betweeen "+a+" and "+n+ " are ");
		
		for(int i=a;i<=n;i++) {
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
	}

}
