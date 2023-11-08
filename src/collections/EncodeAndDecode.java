package collections;

import java.util.Base64;

public class EncodeAndDecode {
    public static void main(String[] args) {
        String inputData = "Java Base64 Encoding Example";
        Base64.Encoder encoder = Base64.getEncoder();
        Base64.Decoder decoder = Base64.getDecoder();


        System.out.println(inputData.getBytes());
        System.out.println(encoder.encodeToString(inputData.getBytes()));

        System.out.println("Decoding");
        byte[] data = decoder.decode(encoder.encodeToString(inputData.getBytes()));
        String originalData = new String(data);
        System.out.println(originalData);
    }
}
