package ke.co.Safaricom;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //Entry of the user inputs to encode or decode or quit/continue
        Scanner userInputObject = new Scanner(System.in);
        do {
            System.out.println("Enter process for encoding(Enter e to encode)/decode(Enter d to decode)");
            String process = userInputObject.nextLine();

            System.out.println("Enter message to encode or decode:");
            String message = userInputObject.nextLine();

            System.out.println("Enter shift key(Enter shift key between 0-25):");
            int key = userInputObject.nextInt();

            if (process.equalsIgnoreCase("e")){
                System.out.println("Encoding data in progress...");
                System.out.println("The Processed data for output is  =>  " );
                String encodedMessage = Encoding.encode(message, key);
                System.out.println("The Processed data for output is  =>  " + encodedMessage);
            } else if (process.equalsIgnoreCase("d")) {
                System.out.println("Decoding data in progress...");
                System.out.println("\nThe Processed data for output is  =>  " );
            } else {
                System.out.println("Invalid process entered");
                continue;
            }
            System.out.println("\nDo you want to quit(Enter q) or continue(Enter c)");
            String input = userInputObject.nextLine();

            String nextStep = userInputObject.nextLine();
            if (nextStep.startsWith("q")){
                break;
            }
        } while(true);
    }//main method ends
}//App Class End

