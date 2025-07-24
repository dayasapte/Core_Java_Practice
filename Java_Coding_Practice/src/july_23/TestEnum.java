package july_23;

public class TestEnum {

	public static void main(String[] args) {
		
		System.out.println(Week.SUNDAY);

		String str = Week.SUNDAY.toString();
		
		for(Week day:Week.values()) {
			
			System.out.println(day.ordinal());
		}
	}

}
