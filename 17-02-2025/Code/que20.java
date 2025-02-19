import java.util.*;

class que20{
	
	public static void main(String[] args){
		
		int cnt=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		while(num>0){
			
			num=num/10;
			cnt++;
		}
		System.out.println(cnt);
	}
}