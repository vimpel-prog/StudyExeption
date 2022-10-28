public class Data {
    public static boolean checkData(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (!isAllowedLength(login) || !isAllowedSymbols(login)) {
            throw new WrongLoginException("Логин содержит не допустимые символы или слишком длинный");
        } else if (!isAllowedSymbols(password) || !isAllowedLength(password) || !isAllowedSymbols(confirmPassword) || !isAllowedLength(confirmPassword) || !password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароль содержит не допустимые символы, слишком длинный или не равен подтверждающему паролю");
        } else return true;
    }

    private static boolean isAllowedSymbols(String s) {
        String s1 = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz1234567890_";
        char[] sToChar = s.toCharArray();
        boolean isOk = true;
        for (char c : sToChar) {
            if (!s1.contains("" + c)) {
                isOk = false;
                break;
            }
        }
        return isOk;
    }

    private static boolean isAllowedLength(String s) {
        return s.length() > 0 && s.length() < 21;
    }
}
