package task12;

public class Run {
    public static void main(String[] args) {

        validate("ssfs", "gsgsbc", "gsgs");

    }

    public static void validate(String login, String password, String confirm_pass) {
        try {
            if (login.length() > 20) {
                throw new WrongLoginException();
            }

            if (password.length() > 20 && confirm_pass == login) {
                throw new WrongPasswordException("Пароль не верній");
            }
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("WrongPassEx" + e);
        } finally {
            System.out.println(login + " " + confirm_pass + " " + password);
        }
    }
}
