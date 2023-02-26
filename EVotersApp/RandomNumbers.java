package EVotersApp;

import java.util.Random;

public class RandomNumbers {
    public static StringBuilder generateNumbersAndLetters(int number){
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder code = new StringBuilder();
        Random random = new Random();
        while (code.length() < number){
            int x = (int)(random.nextFloat() * letters.length());
            code.append(letters.charAt(x));
        }

        return code;
    }

    public static StringBuilder generateNumbers(int number){
        String letters = "1234567890";
        StringBuilder code = new StringBuilder();
        Random random = new Random();
        while (code.length() < number){
            int x = (int)(random.nextFloat() * letters.length());
            code.append(letters.charAt(x));
        }

        return code;
    }

    public static StringBuilder generateLetters(int number){
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder code = new StringBuilder();
        Random random = new Random();
        while (code.length() < number){
            int x = (int)(random.nextFloat() * letters.length());
            code.append(letters.charAt(x));
        }
        return code;
    }
}
