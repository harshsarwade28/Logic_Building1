public class Que9 {

	public static void main(String[] args) {
	
		int num=4825;
		int large=0;
		
		while(num>0)
		{
			int rem=num%10;
			if(rem>large)
				large=rem;
			
			num=num/10;
		}
		
		System.out.println(large);
		
	}

}