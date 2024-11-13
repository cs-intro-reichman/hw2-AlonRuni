// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	String word = args[0];
        word = word.toUpperCase();
        int num = Integer.parseInt(args[1]);
        char[] test = {'A','E', 'F', 'H', 'I', 'L', 'M', 'N', 'O', 'R', 'S', 'X'};
        char e;
        boolean isSame = false;

        for(int i = 0; i < word.length(); i++) {
            e = word.charAt(i); 
            isSame = false;
            System.out.print("Give me a");

            //testing for letters to print "an" insstead of "a"
            for(int j = 0; j < test.length; j++){
                if(e == test[j]) {
                        System.out.print("n ");
                        isSame = true;
                        break;
                }
                
            }  

            if(isSame != true) System.out.print("  ");
            System.out.println(word.charAt(i) + "!");
        }

        System.out.println("What does that spell??");
        for(int i = 0; i < num; i++) {
                System.out.println(word + "!!!");
        }

        }
}
