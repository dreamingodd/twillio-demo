package xyz.trendfashion.twillio;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SmsDemo {

    public static void main(String[] args) {
        Twilio.init(Tools.ACCOUNT_SID, Tools.AUTH_TOKEN);

        // 移动，联通，电信
        List<String> phoneList = Arrays.asList("+8617179889848", "+8618910621021", "+8618588260056", "+8618057193088", "+8617742018804");
//        List<String> phoneList = Arrays.asList("+8618258103675");

        // to, from 比较奇怪
        List<Message> messageList = phoneList.stream().map(phone -> {
            String messageBody = "【牛视科技】您的验证码是" + Tools.getVerifyCode(6) + "！";
            Message message = Message.creator(new PhoneNumber(phone), new PhoneNumber("+12018907929"), messageBody).create();
            return message;
        }).collect(Collectors.toList());

        messageList.forEach(message -> System.out.println(message.getSid()));
    }
}
