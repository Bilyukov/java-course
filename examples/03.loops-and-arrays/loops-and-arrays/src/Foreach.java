
public class Foreach {
	public static void main(String[] args) {
		String[] weekDays = { "Понеделник",
							"Вторникс",
							"Сряда",
							"Четръртък",
							"Петък",
							"Събота",
							"Неделя" };
		
		for (String day : weekDays) {
			System.out.println(day);
		}
	}
}
