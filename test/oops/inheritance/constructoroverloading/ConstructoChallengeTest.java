package oops.inheritance.constructoroverloading;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructoChallengeTest {

    @Test
    public void testConstructorChallenge() {
        ConstructoChallenge challenge = new ConstructoChallenge();
        System.out.println(challenge);

        ConstructoChallenge challenge1 = new ConstructoChallenge("email@email.com");
        System.out.println(challenge1);

        ConstructoChallenge challenge2 = new ConstructoChallenge("Name", "email@email.com");
        System.out.println(challenge2);

        ConstructoChallenge challenge3 = new ConstructoChallenge("Name", "email@email.com", 123456.78);
        System.out.println(challenge3);
    }

}