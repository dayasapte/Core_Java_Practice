package july_3;

public class BreakContinueExamples {

	public static void main(String[] args) {
		
		
		for(int i=1;i<=10;i++) {
			if(i==6)
				break;
			System.out.println(i);	
		}
		
		System.out.println("End of for Loop ");
		
		for(int j=1;j<=10;j++) {
			
			if(j==2 || j==5 || j==8)
				continue;
			System.out.println(j);
		}

	}

}
