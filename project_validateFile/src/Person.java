import java.util.Date;

public class Person {
    private String fname;
    private String lname;
    private String pin; //rodne cislo
    private Date dob;

    public Person(String fname, String lname, String pin, Date dob) {
        this.fname = fname;
        this.lname = lname;
        this.pin = pin;
        this.dob = dob;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getPin() {
        return pin;
    }

    public Date getDob() {
        return dob;
    }
}
