import java.util.Scanner;


public class IntegerAnagram {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		String n1 = sc.next();
		System.out.println("Enter the second Number");
		String n2 = sc.next();
		System.out.println(Utility.isAnagram(n1, n2));
		sc.close();
		
	}

}
