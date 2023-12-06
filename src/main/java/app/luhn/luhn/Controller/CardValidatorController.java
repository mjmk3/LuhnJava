package app.luhn.luhn.Controller;

import app.luhn.luhn.Utility.Validator.LuhnValidator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/card-validator")
public class CardValidatorController {

    @GetMapping("/validate/{cardNumber}")
    public boolean validateCardNumber(@PathVariable("cardNumber") String cardNumber) {
        return LuhnValidator.isValid(cardNumber);
    }
}
