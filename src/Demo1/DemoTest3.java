package Demo1;

public class DemoTest3 {
	
	public static void main(String args[]) {

		int temperature = 41;
		String season = "Null";
		String whatAmIThinking = "Null";

		if (temperature >= 0 && temperature <= 20) {
			season = "Winter ";
			whatAmIThinking = "too cold, can’t wait for summer";

		} else if (temperature >= 21 && temperature <= 36) {
			season = "Fall ";
			whatAmIThinking = "Confused, recovering from cold ";

		} else if (temperature >= 41 && temperature <= 60) {
			season = "Spring ";
			whatAmIThinking = "More Confused, thinking about winter ";

		} else if (temperature >= 61 && temperature <= 100) {
			season = "Summer";
			whatAmIThinking = "Too hot, can’t wait for winter ";

		} else {
			season = "Wrong Data && Java & Coffee";
			whatAmIThinking = "Java & Coffe";

			
		}
		System.out.println(temperature);
		System.out.println(season);
		System.out.println(whatAmIThinking);


             int x = 10;
	     int y = 40;

		if(x > y){
			System.out.println("Greater");
		}else{
			System.out.println("Less");

		}

		
	}

}
