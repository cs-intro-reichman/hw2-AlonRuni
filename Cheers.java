// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	String word = args[0];
        word = word.toUpperCase();
        int num = Integer.parseInt(args[1]);
        char[] testGroup = {'A','E', 'F', 'H', 'I', 'L', 'M', 'N', 'O', 'R', 'S', 'X'};
        char charToTest;
        boolean isSame = false;

        for(int i = 0; i < word.length(); i++) {

            charToTest = word.charAt(i); 
            isSame = false;
            System.out.print("Give me a");

            //comparing the each letter to the group of letters which should print "an" instead of "a"
            for(int j = 0; j < testGroup.length; j++) {
                if(charToTest == testGroup[j]) {
                        System.out.print("n ");
                        isSame = true;
                        break;
                }
                
            }  

            if(isSame != true) System.out.print("  ");
            System.out.println(word.charAt(i) + ": " + word.charAt(i) + "!");
        }

        System.out.println("What does that spell?");
        for(int i = 0; i < num; i++) {
                System.out.println(word + "!!!");
        }

        }
}
