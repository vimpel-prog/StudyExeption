public class Main {
    public static void main(String[] args) {
        String login = "S___erg";
        String password = "13212fdsf";
        String confirmPass = "13212fdsf";
        try {
            System.out.println(Data.checkData(login,password,confirmPass));
        } catch (WrongLoginException | WrongPasswordException e) {
            throw new RuntimeException(e);
        }
    }
}