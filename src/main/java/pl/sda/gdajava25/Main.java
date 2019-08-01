package pl.sda.gdajava25;

import pl.sda.gdajava25.scanner.MixedWordsException;
import pl.sda.gdajava25.scanner.ThrowOrNotThrow;


public class Main {
    public static void main(String[] args) {
        ThrowOrNotThrow throwOrNotThrow = new ThrowOrNotThrow();

        try {
            throwOrNotThrow.startUp();
        } catch (MixedWordsException e) {
            System.err.println(e.getMessage());
        }

    }
}
