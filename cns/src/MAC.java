import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;

public class MAC{

    public static void main(String[] args) {

        try {

            // get a key generator for the HMAC-MD5 keyed-hashing algorithm
            KeyGenerator keyGen = KeyGenerator.getInstance("HmacMD5");

            // generate a key from the generator
            SecretKey key = keyGen.generateKey();


            // create a MAC and initialize with the above key
            Mac mac = Mac.getInstance(key.getAlgorithm());
            mac.init(key);

            String message = "This is a confidential message";

            // get the string as UTF-8 bytes
            byte[] b = message.getBytes("UTF-8");

            // create a digest from the byte array
            byte[] digest = mac.doFinal(b);

            System.out.println(digest.toString());
        }
        catch (NoSuchAlgorithmException e) {
            System.out.println("No Such Algorithm:" + e.getMessage());
            return;
        }
        catch (UnsupportedEncodingException e) {
            System.out.println("Unsupported Encoding:" + e.getMessage());
            return;
        }
        catch (InvalidKeyException e) {
            System.out.println("Invalid Key:" + e.getMessage());
            return;
        }

    }

}
