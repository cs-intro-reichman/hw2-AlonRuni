// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
		int activityTimes = Integer.parseInt(args[0]);
		double mul = 1;
		double fraction = -1/mul;
		double sumAll = 1;

		for(int i = 0; i < activityTimes -1; i++) {
			mul += 2;
			fraction = 1/mul;
			if(i % 2 == 0)fraction *= (-1);
			sumAll = sumAll + fraction;
		}
		

		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("aproximated pi: " + sumAll * 4);
	}
}
