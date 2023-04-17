package ke.co.Safaricom;

//Logic for decoding Class
public class Decoding {
    public static final String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";


    //Start of main method for decode
    public static String decode(String message, int shiftKey) {
        message = message.toUpperCase();
        String decipherText = "";
        for (int i = 0; i < message.length(); i++) {
            char messageUnit = message.charAt(i);
            if (Character.isLetter(messageUnit)){
                int charPosition = alphabets.indexOf(messageUnit);
                int keyValue = (alphabets.length()-shiftKey + charPosition);
                if (keyValue < 26 ) {
                    decipherText +=  alphabets.charAt(keyValue);
                }
                else
                    decipherText += alphabets.charAt(keyValue % 26);

            }else if (Character.isDigit(messageUnit)) {
                int charPosition = alphabets.indexOf(messageUnit);
            }else
                decipherText += messageUnit;
        }
        return decipherText;
    }//End of decode method

}//End of Class Logic for Decoding

