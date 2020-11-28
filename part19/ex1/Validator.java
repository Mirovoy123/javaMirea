package part19.ex1;

public class Validator {
    public void validate(String value) {
        if (value.length() != 10) {
            throw new IllegalArgumentException("ИНН должен состоять из 10 знаков.");
        }
        if (value.charAt(0) == '0') {
            throw new IllegalArgumentException("ИНН не может начинаться с нуля.");
        }
        for (int i = 1; i < 10; i++) {
            if (!Character.isDigit(value.charAt(i))) {
                throw new IllegalArgumentException("ИНН может состоять только из цифр.");
            }
        }
    }
}