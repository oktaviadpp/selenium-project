package global;

import java.util.Random;

public class randomAccess {
    public String randomEmail = generateRandomEmail();
    public String randomName = generateRandomName();
    public static void main(String[] args) {
        String randomEmail = generateRandomEmail();
        String randomName = generateRandomName();

        System.out.println("Random Email: " + randomEmail);
        System.out.println("Random Name: " + randomName);
    }

    public static String generateRandomEmail() {
        String[] domains = { "gmail.com", "example.com"};

        // Generate a random username
        String username = generateRandomString(8);

        // Pick a random domain from the array
        Random random = new Random();
        String domain = domains[random.nextInt(domains.length)];

        return username + "@" + domain;
    }
    public static String generateRandomString(int length) {
        String characters = "abcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder(length);
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }

        return sb.toString();
    }

    public static String generateRandomName(){
        String name = generateRandomString(12);
        return name;
    }
}
