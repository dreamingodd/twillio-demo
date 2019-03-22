package xyz.trendfashion.twillio;

import java.util.Random;

public class Tools {
    public static final String ACCOUNT_SID = "AC153bda67c1194031c47d1813e8f54f96";
    public static final String AUTH_TOKEN = "--";

    public static String getVerifyCode(int digit) {
        Random random = new Random();
        String code = "";
        while (digit > 0) {
            code += random.nextInt(10);
            digit--;
        }
        return code;
    }
}
