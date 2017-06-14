package task12;


public class WrongPasswordException extends  Exception{
    String login;
    String password;
    String confirm_pass;

    public WrongPasswordException(String message) {
        super(message);
    }

}
