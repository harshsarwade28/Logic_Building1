import java.util.*;

class que11{
	
	public static void main(String[] args){
	

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st Subject marks: ");
		int sub1=sc.nextInt();
		
		System.out.println("Enter 2nd Subject marks: ");
		int sub2=sc.nextInt();
		
		System.out.println("Enter 3rd Subject marks: ");
		int sub3=sc.nextInt();
		
		int failCont=0;
		
		if(sub1<40)
			failCont++;
		if(sub2<40)
			failCont++;
		if(sub3<40)
			failCont++;
		
		switch(failCont){
			
			case 0:
			System.out.println("Passes");
			break;
			
			default:
			System.out.println("Student Failed in "+failCont+" Subjects");
			
		}
		
	}
}