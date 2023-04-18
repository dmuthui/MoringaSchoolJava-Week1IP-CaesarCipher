package  ke.co.Safaricom;

//Logic for Encoding Class
public class Encoding {
    public static final String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    //Start of main method for encode
    public static String encode(String message, int shiftKey) {
        message = message.toUpperCase();
        String cipherText = "";
        for (int i = 0; i < message.length(); i++) {
            char messageUnit = message.charAt(i);
            if (Character.isLetter(messageUnit)){
                int charPosition = alphabets.indexOf(messageUnit);
                int keyValue = (shiftKey + charPosition);
                if (keyValue < 26 ) {
                    cipherText += alphabets.charAt(keyValue);

                } else
                    cipherText += alphabets.charAt(keyValue % 26);

            }else
                cipherText += messageUnit;

        }
        return cipherText;

    }//End of encode method
}//End of Class Logic for Encoding
