package sk.itsovy.regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public boolean checkMail(String mail){
        //* prijima lubovolny pocet
        //. hocijaky znak
        //.find() len hlada ci sa tam nachadza
        //.matches() hlada presne ci je to to cele take
        Pattern pat = Pattern.compile("^([a-zA-Z0-9]?\\.?\\-?\\_?){1,}\\@{1}[a-zA-Z0-9]{1,}\\.{1}[A-Za-z]{2,4}$");
        Matcher m = pat.matcher(mail);
        return  m.matches();
    }

    public boolean checkIBAN(String iban){
        Pattern pattern = Pattern.compile("^[A-Z]{2}[0-9]{2}((\\ ([0-9]{4})){5}|(([0-9]{4})){5})$");
        Matcher match = pattern.matcher(iban);
        return match.matches();
    }

    public boolean checkPhoneNumber(String num){
        Pattern vzor = Pattern.compile("^(09[0-9]{2}\\ ?[0-9]{3}\\ ?[0-9]{3}|\\+4219\\ ?[0-9]{3}\\ ?[0-9]{3}\\ ?[0-9]{3}|00421\\ ?9[0-9]{2}\\ ?[0-9]{3}\\ ?[0-9]{3})$");
        Matcher match = vzor.matcher(num);
        return match.matches();
    }
}
