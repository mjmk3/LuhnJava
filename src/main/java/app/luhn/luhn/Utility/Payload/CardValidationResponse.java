package app.luhn.luhn.Utility.Payload;

public class CardValidationResponse {

    private boolean valid;
    private String cardType;

    public

    boolean

    isValid()

    {
        return valid;
    }

    public

    void

    setValid(boolean valid)

    {
        this.valid = valid;
    }

    public String getCardType()

    {
        return cardType;
    }

    public

    void

    setCardType(String cardType)

    {
        this.cardType = cardType;
    }
}
