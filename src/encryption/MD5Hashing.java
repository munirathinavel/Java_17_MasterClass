package encryption;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Hashing {
    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {

        byte[] data = Files.readAllBytes(
                Paths.get("/Users/munirathinavel.c/IdeaProjects/Java Programming Masterclass/src/basic/Exercise.java"));
        byte[] hash = MessageDigest.getInstance("MD5").digest(data);
        String checksum = new BigInteger(1, hash).toString(16);
        System.out.println("Checksum:" + checksum);
    }
}
