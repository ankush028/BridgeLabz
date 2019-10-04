
import java.util.ArrayList;
import java.util.Arrays;
public class Utility {
	public static boolean isAnagramString(String str1,String str2){
			if(str1.length()==str2.length()){
				char a[]  = str1.toCharArray();
				char b[] = str2.toCharArray();
				
				Arrays.sort(a);
				Arrays.sort(b);
				if(Arrays.equals(a,b)){
					return true;
				}else{
				return	false;
				}
			}
		return false;
	}
	public static boolean isAnagram(String n1,String n2){
		
		char a[] = n1.toCharArray();
		char b[] = n2.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		if(Arrays.equals(a,b)){
			return true;
		}	
			return false;
	}
	
	public static boolean isPrime(int n){
		if(n==0||n==1){
			return false;
		}
			for(int i=2;i<n;i++){
				if(n%i==0){
					return false;
				}
			}
	return true;
	}
	public static ArrayList<Integer> isPrimePallindrom(ArrayList<Integer> alist){
		ArrayList<Integer> blist = new ArrayList<Integer>();
		for(int i=0;i<alist.size();i++){
			int a = alist.get(i);
			int reverse=0;
			while(a>0){
				int r = a%10;
				reverse = reverse*10+r;
				a=a/10;
			}
			if(reverse==alist.get(i)){
				blist.add(reverse);
			}
			
		}
		return blist;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

	}

}
