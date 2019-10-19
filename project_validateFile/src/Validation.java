import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Validation {

    String name;
    String birthNumber;
    String dateBirth;

    public Validation(String name,String birthNumber,String dateBirth){
        this.name=name;
        this.birthNumber=birthNumber;
        this.dateBirth=dateBirth;
    }

     public boolean validateName(){
        Pattern vzor = Pattern.compile("^[A-Z][a-z]{1,}\\ [A-Z][a-z]{1,}$");
        Matcher m = vzor.matcher(name);
        return m.matches();
     }

     public boolean validateBrithNumber(){
        Pattern vzor = Pattern.compile("^\\d{2}[0,1,5,6]\\d{3}\\/[0-9]{3,4}$");
        Matcher m = vzor.matcher(birthNumber);

        if (m.matches()&&birthEqualnumber()){

            birthNumber=birthNumber.replaceAll("/","");
            long number=Long.parseLong(birthNumber);

            return number%11 == 0;

        }else{
            return false;
        }
     }

     public boolean validateDateBirth(){
        Pattern vzor = Pattern.compile("^([0][1-9]|[1][0-9]|[2][0-9]|[3][0-1])\\.([0][1-9]|[1][0-2])\\.([1][9][0-9][0-9]|[2][0][0-1][0-9])$");
        Matcher m = vzor.matcher(dateBirth);
        return m.matches();
     }



    public boolean birthEqualnumber(){
        if ((birthNumber.charAt(0)==dateBirth.charAt(8))&&(birthNumber.charAt(1)==dateBirth.charAt(9))){
            if (((birthNumber.charAt(2)==dateBirth.charAt(3))||(birthNumber.charAt(2)==dateBirth.charAt(3)+5))&&(birthNumber.charAt(3)==dateBirth.charAt(4))){
                if ((birthNumber.charAt(4)==dateBirth.charAt(0))&&(birthNumber.charAt(5)==dateBirth.charAt(1))){
                    return true;
                }else {
                    return false;
                }

            }else{
                return false;
            }
        }else{
            return false;
        }
    }
}
