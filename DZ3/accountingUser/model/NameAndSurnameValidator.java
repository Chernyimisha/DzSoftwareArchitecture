package OOP_seminars.accountingUser.model;

public class NameAndSurnameValidator {

        private String userInput;

        public NameAndSurnameValidator(String userInput) {
            this.userInput = userInput;
        }

        public void validate() throws Exception {
            if (!userInput.matches("^\\S+$")) {
                throw new Exception("Валидация не прошла");
            }
        }

    }

