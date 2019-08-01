package pl.sda.gdajava25.scanner;

import pl.sda.gdajava25.exception.MixedWordsException;

import java.util.Scanner;

public class ThrowOrNotThrow {
    private final static Scanner SCANNER = new Scanner(System.in);


    public void startUp() throws MixedWordsException {
        do {
            String comend = SCANNER.next();
            if (mixedWorldCheck(comend)) {
                throw new MixedWordsException("Słowo składa sie naprzemiennie z cyfr i liter!");
            }


        } while (true);
    }

    private boolean mixedWorldCheck(String comend) {
        if (comend.length() > 1) {
            if (Character.isLetter(comend.charAt(0)))
                return startsWithLetter(comend);
            if (Character.isDigit(comend.charAt(0)))
                return startWithDiggit(comend);
            return false;
        }
        return false;
    }

    private boolean startWithDiggit(String comend) {
        char[] chars = comend.toCharArray();
        boolean b = true;
        for (int i = 0; i < chars.length; i++) {
            if (i % 2 == 0) {
                b &= Character.isDigit(chars[i]);
            } else {
                b &= Character.isLetter(chars[i]);
            }
        }
        return b;

    }

    private boolean startsWithLetter(String comend) {
        char[] chars = comend.toCharArray();
        boolean b = true;
        for (int i = 0; i < chars.length; i++) {
            if (i % 2 == 0) {
                b &= Character.isLetter(chars[i]);
            } else {
                b &= Character.isDigit(chars[i]);
            }
        }
        return b;

    }

}
