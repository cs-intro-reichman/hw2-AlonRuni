// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int highestSeed = Integer.parseInt(args[0]);
		int seed = 1;
		int startPoint = 1;
		int countItems = 1;
		boolean oneInBeginning = true;

		if (args[1].equals("v")) {
	
			while (startPoint < highestSeed + 1) {
				countItems = 1;
				oneInBeginning = true;
				seed = startPoint;

				while ((seed != 1) || (oneInBeginning == true)) {
					oneInBeginning = false;
					System.out.print(seed + " ");
					if (seed % 2 == 0) {
						seed /= 2;
					} else {
						seed = seed * 3 + 1;
					}
					countItems++;
				}
				System.out.print(1 + " ");
				System.out.println("(" + countItems + ")");
				startPoint++;
			}

			System.out.println("Every one of the first " + highestSeed + " hailstone sequences reached 1.");
		} else {
			while (startPoint < highestSeed + 1) {
				countItems = 1;
				oneInBeginning = true;
				seed = startPoint;

				while ((seed != 1) || (oneInBeginning == true)) {
					oneInBeginning = false;
					if (seed % 2 == 0) {
						seed /= 2;
					} else {
						seed = seed * 3 + 1;
					}
					countItems++;
				}
				startPoint++;
			}
			System.out.println("Every one of the first " + highestSeed + " hailstone sequences reached 1.");
		}

	}
}
