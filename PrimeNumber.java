import java.util.ArrayList;

public class PrimeNumber {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> alist = new ArrayList<Integer>();
		
			for(int i=0;i<=1000;i++){
			if(Utility.isPrime(i)){
				alist.add(i);
			}
					}
	System.out.println(alist);
	
	
}
	}