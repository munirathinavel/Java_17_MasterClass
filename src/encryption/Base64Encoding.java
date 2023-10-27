package encryption;

import java.util.Base64;
import java.util.UUID;

public class Base64Encoding {

    public static void main(String[] args) {
        String input = "Cool Buddy!";
        System.out.println("\nOriginal Data: \n\r" + input);
        byte[] encodedString = Base64.getEncoder().withoutPadding().encode(input.getBytes());
        System.out.println("\nEncoded Data: \n\r" + Base64.getEncoder().withoutPadding().encodeToString(input.getBytes()));

        byte[] decodedString = Base64.getDecoder().decode(encodedString);
        System.out.println("\nEncoded Data:\n\r " + new String(decodedString));
        System.out.println();

        String url = "https://www.geeksforgeeks.org/basic-type-base64-encoding-and-decoding-in-java/";
        String encodedUrl = Base64.getUrlEncoder().encodeToString(url.getBytes());
        System.out.println("\nEncoded URL:\n\r" + encodedUrl);

        byte[] decodedUrl = Base64.getUrlDecoder().decode(encodedUrl);
        System.out.println("\nDecoded URL:\n\r" + new String(decodedUrl));
        System.out.println();


//         MIME Encoding / Decoding
        StringBuilder buffer = getMimeBuffer();
        System.out.println("\nOriginal UUID MIME:" + buffer);
        String mimeEncoded = Base64.getMimeEncoder().encodeToString(buffer.toString().getBytes());
        System.out.println("\nMIME encoded String:\n\r" + mimeEncoded);

        byte[] decoded = Base64.getMimeDecoder().decode(mimeEncoded);
        System.out.println("\nMIME Decoded String:\n\r" + new String(decoded));


    }

    private static StringBuilder getMimeBuffer() {
        StringBuilder buffer = new StringBuilder();
        for (int count = 0; count < 10; ++count) {
            String uuid = UUID.randomUUID().toString();
            System.out.println("UUID:" + uuid);
            buffer.append(uuid);
        }
        return buffer;
    }
}
