package pl.sda.gdajava25;
/**
 * 3 Zadanie:
 * Stwórz program i w nim pętlę. Użytkownik podaje słowa (tokeny) składające się z liter i cyfr.
 * Jeśli użytkownik wpisze token (słowo) które składa się w kratkę (naprzemian) z liter i cyfr,
 * to rzuć exception o nazwie "MixedWordsException".
 * <p>
 * Wyjątek MUSI być przechwycony w aplikacji. (jakie znasz typy wyjątków?)
 */

import pl.sda.gdajava25.exception.MixedWordsException;
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
