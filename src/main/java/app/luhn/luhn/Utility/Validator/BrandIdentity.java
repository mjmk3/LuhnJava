package app.luhn.luhn.Utility.Validator;

public class BrandIdentity {

    private static final String[] VISA_PREFIXES = {"4", "49", "44", "47"};
    private static final String[] MASTERCARD_PREFIXES = {"51", "52", "53", "54", "55", "58", "222", "223", "224", "225", "226", "227", "228", "229", "230", "231", "232", "233", "234", "235", "236", "237", "238", "239", "240", "241", "242", "243", "244", "245", "246", "247", "248", "249", "250", "251", "252", "253", "254", "255", "256", "257", "258", "259", "260", "261", "262", "263", "264", "265", "266", "267", "268",

            "269", "270", "271", "272"};
    private static final String[] AMERICAN_EXPRESS_PREFIXES = {"34", "37"};
    private static final String[] DISCOVER_PREFIXES = {"6011", "65"};
    private static final String[] JCB_PREFIXES = {"35"};

    public static String identifyCardType(String cardNumber) {
        if (cardNumber == null || cardNumber.isEmpty()) {
            return null;
        }

        for (String prefix : VISA_PREFIXES) {
            if (cardNumber.startsWith(prefix)) {
                return "VISA";
            }
        }

        for (String prefix : MASTERCARD_PREFIXES) {
            if (cardNumber.startsWith(prefix)) {
                return "MASTERCARD";
            }
        }

        for (String prefix : AMERICAN_EXPRESS_PREFIXES) {
            if (cardNumber.startsWith(prefix)) {
                return "AMERICAN_EXPRESS";
            }
        }

        for (String prefix : DISCOVER_PREFIXES) {
            if (cardNumber.startsWith(prefix)) {
                return "DISCOVER";
            }
        }

        for (String prefix : JCB_PREFIXES) {
            if (cardNumber.startsWith(prefix)) {
                return "JCB";
            }
        }

        return "UNKNOWN";
    }
}
