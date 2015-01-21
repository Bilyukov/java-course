
public class Parsing {

	public static void main(String[] args) {
		
		String numberVar = "33";
		
		String doubleVar = "22.55";
		
		String booleanVar = "true";
		
		try {
			
			int num = Integer.parseInt(numberVar);
			double dob = Double.parseDouble(doubleVar);
			boolean b = Boolean.parseBoolean(booleanVar);
			
			System.out.println(num);
			System.out.println(dob);
			System.out.println(b);
			
		} catch (NumberFormatException e) {
			System.out.println("Възникна грешка при парсването!");
		} catch (NullPointerException e){
			System.out.println("Подаден нулев string");
		}
		

	}

}
