package constants;

public class Messages {
    public interface CartMessages{
         String REGULAR_MESSAGE = "Thank you for your purchase!",
                ALERT_MESSAGE = "Please fill out Name and Creditcard.";
    }
   public interface LogInMeCartMessages{
        String SHORT_PASSWORD = "Password is too short!",
                PASSWORD_WITHOUT_SPECIAL_CHARACTERS = "Password must include special characters!",
                PASSWORD_WITHOUT_NUMBER = "Password must include number!",
                PASSWORD_WITHOUT_LETTER = "Password must include letter";
    }
  
   public interface ContactMessages{
        String REGULAR_MESSAGE = "Thanks for the message!!",
               ALERT_MESSAGE = "Incorrect data format";
   }
  public interface SignUpMessages{
        String REGULAR_MESSAGE = "Thank you for your registration!",
                ALERT_MESSAGE = "Incorect password";
    }

}
