
public class Constants {

	public static void main(String[] args) {
		TimeSpan week = new TimeSpan(7);
		System.out.printf("One week has %d hours \n", week.calculateHours());
		System.out.printf("One week has %d minutes \n", week.calculateMinutes());
		
		TimeSpan month = new TimeSpan(30);
		System.out.printf("One month has %d hours \n", month.calculateHours());
		System.out.printf("One month has %d minutes \n", month.calculateMinutes());

	}

}
