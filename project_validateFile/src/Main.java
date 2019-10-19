import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        SimpleDateFormat dateFormatA = new SimpleDateFormat("dd.MM.yyyy");
        Database database=new Database("root","","jdbc:mysql://localhost:3306/dbusers");
        //database.deleteAllUserRecord();
        database=new Database("Sigmund_Freud","0101","jdbc:mysql://localhost:3306/dbusers");
        Date date1 = null;


        String name="";
        String bn="";
        String date="";
        boolean dateB=false;
        boolean bnB=false;
        boolean surename=false;

        PrintWriter writingFile = new PrintWriter("C:\\Users\\Tomas\\IdeaProjects\\project_validateFile\\src\\text\\write.txt");
        File file = new File("C:\\Users\\Tomas\\IdeaProjects\\project_validateFile\\src\\text\\file.txt");
                try {

                    String firstName="";
                    String lastName="";

                    Scanner input = new Scanner(file);
                    while (input.hasNextLine()) {

                        if (input.hasNext()){
                            String temp = input.next();
                            if (temp.charAt(0)>='A' && temp.charAt(0)<='Z'){
                                if (surename==false){
                                    surename=true;
                                    name+=temp;
                                    firstName=temp;
                                }else{
                                     name+=" "+temp;
                                    lastName=temp;
                                }
                         }else if(temp.charAt(0)>='0' && temp.charAt(0)<='9'){
                             if (bnB==false){
                                 bn+=temp;
                                 bnB=true;
                             }
                             if(dateB==false) {
                                 date += input.next();
                                 dateB = true;

                                 Validation validation = new Validation(name,bn,date);
                                 if ((validation.validateDateBirth()&&validation.validateName())&&validation.validateBrithNumber()){
                                     writingFile.write(name);
                                     writingFile.write(" "+bn);
                                     writingFile.write(" "+date);
                                     writingFile.write('\n');
                                     System.out.println("zapisujem "+name);

                                     try {
                                         date1 = dateFormatA.parse(date);
                                     }catch (ParseException e){
                                         e.printStackTrace();
                                     }

                                     Person osoba = new Person(firstName,lastName,bn,date1);
                                     database.insertNewUser(osoba);


                                 }else{
                                 }
                                 name="";
                                 bn="";
                                 date="";
                                 dateB=false;
                                 bnB=false;
                                 surename=false;
                             }
                        }
                        }
                    }
                    input.close();
                    writingFile.close();
                }
                catch (FileNotFoundException e) {
                    e.printStackTrace();
                }

                Person marian = database.getPersonByName("Filip");
                System.out.println(marian.getFname()+" "+marian.getLname()+" "+marian.getDob()+" "+marian.getPin());

                marian = database.getPersonByBN("841018/5454");
                System.out.println(marian.getFname()+" "+marian.getLname()+" "+marian.getDob()+" "+marian.getPin());

                List<Person> persons= database.getAllMens();
                for (int a=0;a<persons.size();a++){
                    System.out.println(persons.get(a).getFname()+"\t"+persons.get(a).getLname()+"\t"+persons.get(a).getDob()+"\t"+persons.get(a).getPin());

                }

                LocalDate localDate = LocalDate.now();
                List<Person> adolts = database.getAllAdults(localDate);

        System.out.println("adolts");
                for (int a=0; a<adolts.size();a++){
                    System.out.println(adolts.get(a).getFname()+"\t"+adolts.get(a).getLname()+"\t"+adolts.get(a).getDob()+"\t"+adolts.get(a).getPin());
                }

        HashSet<String> krstne = database.getFirstName();
        for (String k: krstne){
            System.out.println(k);
        }


        System.out.println("ALL USERS");
        List<Person> allPersons= database.getAllUsers();
        for (Person p: allPersons){
            System.out.println(p.getFname()+" "+p.getLname()+" "+p.getDob()+" "+p.getPin());
        }

        XML xml = new XML();
        try {
            xml.createXML();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }
        ;


    }
}
