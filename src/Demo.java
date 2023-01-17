
public class Demo {

	public static void main(String[] args) {
		System.out.println("5==5: " + (5 == 5));
		System.out.println("5>5: " + (5 > 5));
		System.out.println("5>4: " + (5 > 4));
		System.out.println("4>5: " + (4 > 5));
		System.out.println("5>=5: " + (5 >= 5));

		System.out.println("5<5: " + (5 < 5));
		System.out.println("5<4: " + (5 < 4));
		System.out.println("4<5: " + (4 < 5));
		System.out.println("5<=5: " + (5 <= 5));
		System.out.println("5!=5: " + (5 != 5));
		System.out.println("5!=6: " + (5 != 6));

		System.out.println("5==5 && 6==6: " + (5 == 5 && 6 == 6));
		System.out.println("5==5 && 7==6: " + (5 == 5 && 7 == 6));
		System.out.println("6==5 && 7==6: " + (6 == 5 && 7 == 6));

		System.out.println("5==5 || 6==6: " + (5 == 5 || 6 == 6));
		System.out.println("5==5 || 7==6: " + (5 == 5 || 7 == 6));
		System.out.println("6==5 || 7==6: " + (6 == 5 || 7 == 6));

		System.out.println("!true: " + (!true));
	}

}
