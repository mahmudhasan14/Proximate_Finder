/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proximateFinder;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author mahmu
 */
public class Validate {
    public static boolean validateEmail(String email) {
    boolean status = false;
    String EMAIL_PATTERN = "^[\\w-\\+]+(\\.[\\w-]+)*@(gmail|yahoo|hotmail|outlook)\\.[A-Za-z]{2,}$";
    Pattern pattern = Pattern.compile(EMAIL_PATTERN);
    Matcher matcher = pattern.matcher(email);
    if (matcher.matches()) {
        status = true;
    } else {
        status = false;
    }
    return status;
}
    public static boolean validateName(String name) {
    boolean status = false;
    String NAME_PATTERN = "^[A-Za-z]+([\\s'-][A-Za-z]+)*$";
    Pattern pattern = Pattern.compile(NAME_PATTERN);
    Matcher matcher = pattern.matcher(name);
    if (matcher.matches()) {
        status = true;
    } else {
        status = false;
    }
    return status;
}

}
