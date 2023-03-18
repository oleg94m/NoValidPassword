package Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NoValidPassword {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ввести пароль");

        Pattern pattern = Pattern.compile("^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@!@#$%^&*()+=?><,.])(?!.*(.)\\1{2})[A-Za-z\\d@!@#$%^&*()+=?><,.]{8,}$");
        //має велику чи маленьку букву (?=.*[A-Za-z])
        //цифра люба (?=.*\\d)
        //(?=.*[@$!%*#?&]) символ який я додав
        //{8,} мін кількість
        // (?!.*(.)\1{2}) провіряю на повторення більше 3

        while (true) {
            String password = reader.readLine();
            Matcher matcher = pattern.matcher(password);
            if (matcher.matches()) {
                System.out.println("проходить валідацію");
                break;
            } else {
                System.out.println("не проходить валідацію");

            }
        }
    }
}




