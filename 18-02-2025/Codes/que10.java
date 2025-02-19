import java.util.*;

class que10{
	
	public static void main(String[] args){
		
		double dicPrice=0;
		double finalAmt=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Amount");
		double amt=sc.nextInt();
		
		if(amt >= 1000){
			dicPrice=amt*0.20;
		}
		else if(amt>=500 && amt<=999){
			dicPrice=amt*0.10;
		}
		else{
			dicPrice=amt*0.05;
		}
		
		finalAmt=amt-dicPrice;
		System.out.println(finalAmt);
		
		
	}
}