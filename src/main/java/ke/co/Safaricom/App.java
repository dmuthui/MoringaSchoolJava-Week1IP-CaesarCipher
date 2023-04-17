package ke.co.Safaricom;

import java.util.Scanner;

public class App {
    // Method  - Getter for process
    public String getProcess() {
        return process;
    }

    // Method  - Setter for process
    public void setProcess(String process) {
        this.process = process;
    }

    // Method  - Getter for message
    public String getMessage() {
        return message;
    }

    // Method  - Setter for message
    public void setMessage(String message) {
        this.message = message;
    }

    // Method  - Getter for key
    public String getKey() {
        return key;
    }

    // Method  - Setter for key
    public void setKey(String key) {
        this.key = key;
    }

    private String process;
    private String message;
    private String key;
    public static void main(String[] args) {
        //Entry of the user inputs (Encode/Decode,Message,Key and Output)to encode or decode or quit/continue
        Scanner userInputObject = new Scanner(System.in);
        do {
            System.out.println("Enter process for encoding(Enter e to encode)/decode(Enter d to decode)");
            String process = userInputObject.nextLine();

            System.out.println("Enter message to encode or decode(No output for digits):");
            String message = userInputObject.nextLine();


            //Logic for entry of Shift key which validates that key entered is between 0-25
            System.out.println("Enter shift key(Enter shift key between 0-25):");
            int key = userInputObject.nextInt();
                //Logic to ensure Shift key between 0 - 25
                if (key < 0) {
                    System.out.println("Enter key greater than 0");
                    System.out.println("\nDo you want to quit(Enter q) or continue(Enter c)");
                    String input = userInputObject.nextLine();
                    String nextStep = userInputObject.nextLine();
                    continue;
                } else if (key > 25) {
                    System.out.println("Enter Shift key less than 25");
                    System.out.println("\nDo you want to quit(Enter q) or continue(Enter c)");
                    String input = userInputObject.nextLine();
                    String nextStep = userInputObject.nextLine();
                    continue;
                    //Logic to validate the Encode/Decode process entered(Whether E/e or D/d will executed.
                } else if (process.equalsIgnoreCase("e")) {
                    System.out.println("Encoding data in progress...");
                    String encodedMessage = Encoding.encode(message, key);
                    System.out.println("The Encoded data for output is:  =>  " + encodedMessage);
                } else if (process.equalsIgnoreCase("d")) {
                    System.out.println("Decoding data in progress...");
                    String decodedMessage = Decoding.decode(message, key);
                    System.out.println("\nThe Decoded data for output is:  =>  " + decodedMessage);
                }else {
                    System.out.println("Invalid process entered");
                    continue;
                      }
                System.out.println("\nDo you want to quit(Enter q) or continue(Enter c)");
                String input = userInputObject.nextLine();
                String nextStep = userInputObject.nextLine();
                  if (nextStep.startsWith("q")) {
                      break;
                  }
        } while (true);
    } // App Method ends
}//App Class ends
