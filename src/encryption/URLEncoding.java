package encryption;

import java.net.URLDecoder;
import java.net.URLEncoder;

public class URLEncoding {

    public static void main(String[] args) {

        String encodedURL = URLEncoder.encode("http://google.com?param1=value1&param2=value2");
        System.out.println("encodedURL:" + encodedURL);

        String decodedURL = URLDecoder.decode(encodedURL);
        System.out.println("DecodedURL:" + decodedURL);

    }
}
