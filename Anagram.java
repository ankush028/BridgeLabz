import java.util.Scanner;


public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first name");
		String str = sc.nextLine();
		System.out.println("Enter the Second name");
		String str2 = sc.nextLine();
		System.out.println(Utility.isAnagramString(str, str2));
	}

}
