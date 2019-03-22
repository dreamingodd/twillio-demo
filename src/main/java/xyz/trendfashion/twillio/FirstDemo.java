package xyz.trendfashion.twillio;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class FirstDemo {
    public static final String ACCOUNT_SID =
            "AC153bda67c1194031c47d1813e8f54f96";
    public static final String AUTH_TOKEN =
            "-";

    public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        // to, from 比较奇怪
        Message message = Message.creator(new PhoneNumber("+8615869154101"),new PhoneNumber("+12018907929"),"【牛视科技】您的验证码是789878！")
                .create();

        System.out.println(message.getSid());
    }
}
