package app.luhn.luhn.Controller;

import app.luhn.luhn.Utility.Payload.CardValidationResponse;
import app.luhn.luhn.Utility.Validator.BrandIdentity;
import app.luhn.luhn.Utility.Validator.LuhnValidator;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/card-validator")
public class CardValidatorController {

    @GetMapping("/validate/{cardNumber}")
    public ResponseEntity<CardValidationResponse> validateCardNumber(@PathVariable("cardNumber") String cardNumber) {
        boolean isValid = LuhnValidator.isValid(cardNumber);
        String cardBrand = BrandIdentity.identifyCardType(cardNumber);

        CardValidationResponse response = new CardValidationResponse();
        response.setValid(isValid);
        response.setCardType(cardBrand);

        return ResponseEntity.ok(response);
    }
}
