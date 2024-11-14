// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	String word = args[0];
        word = word.toUpperCase();
        int num = Integer.parseInt(args[1]);
        String testGroup = "AEFHILMNORSX";
        char charToTest;
        boolean isSame = false;

        for(int i = 0; i < word.length(); i++) {

            charToTest = word.charAt(i); 
            isSame = false;
            System.out.print("Give me a");

                if(testGroup.indexOf(i) != -1) {
                        System.out.print("n ");
                } else {
                        System.out.print(" ");
                }
           
            System.out.println(word.charAt(i) + ": " + word.charAt(i) + "!");
        }

        System.out.println("What does that spell?");
        for(int i = 0; i < num; i++) {
                System.out.println(word + "!!!");
        }

        }
}
