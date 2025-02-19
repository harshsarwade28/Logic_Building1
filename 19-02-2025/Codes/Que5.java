public class Que5 {

	public static void main(String[] args) {
		
		
		int num=8;
		int first=0;
		int second=1;
		
		for(int i=0; i<=num; i++)
		{
			System.out.println(first);
			
			int next=first+second;
			first=second;
			second=next;
		}
	}

}