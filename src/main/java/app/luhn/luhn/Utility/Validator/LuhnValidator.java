package app.luhn.luhn.Utility.Validator;

public class LuhnValidator {

    public static boolean isValid(String cardNumber) {
        if (cardNumber == null || cardNumber.isEmpty()) {
            return false;
        }

        int sum = 0;
        boolean doubleDigit = false;
        for (int i = cardNumber.length() - 1; i >= 0; i--) {
            char digitChar = cardNumber.charAt(i);
            int digit = Character.digit(digitChar, 10);
            if (digit == -1) {
                return false; // Not a valid digit
            }

            if (doubleDigit) {
                int doubledDigit = digit * 2;
                if (doubledDigit > 9) {
                    doubledDigit -= 9;
                }
                sum += doubledDigit;
            } else {
                sum += digit;
            }

            doubleDigit = !doubleDigit;
        }

        return sum % 10 == 0;
    }
}
