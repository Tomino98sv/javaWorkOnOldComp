import javax.xml.crypto.Data;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

//final constanta
//public class Database {
//    private final String username="tomas";
//    private final String password="1234";
//    private final String url="jdbc:mysql://localhost:3306/db1";
//
//    private Connection getConnection(){
//        Connection connection;
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            System.out.println("Driver loaded");
//            connection = DriverManager.getConnection(url, username, password);
//            return connection;
//        } catch (ClassNotFoundException e){
//            e.printStackTrace();
//        } catch (SQLException e){
//            e.printStackTrace();
//        }
//        return null;
//    }
//
//    public void insertNewPerson(Person person){
//        Connection conn=getConnection();
//        try {
//            PreparedStatement stmt=conn.prepareStatement("INSERT INTO person(FirstName,LastName,dnar,rc) values(?,?,?,?)");
//            stmt.setString(1,person.getFname());
//            stmt.setString(2,person.getLname());
//            stmt.setDate(3, new Date(person.getDob().getTime()));
//            stmt.setString(4,person.getPin());
//            int result = stmt.executeUpdate();
//            //execute() staci na len na update
//            conn.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//
//}
public class Database{

    private String user;
    private String pass;
    private String url;
    private final String driver="com.mysql.jdbc.Driver";

    //jdbc umoznuje nadviazat spojenie s databazou
    public Database(String user, String pass, String url){
        this.user=user;
        this.pass=pass;
        this.url=url;
    }

    public Database(String user, String pass){
        this.user = user;
        this.pass=pass;
        this.url="jdbc:mysql://localhost:3306/dbusers";
    }

    private Connection getConnection(){
        try {
            //Class.forName instancia classy a ten string su iba packages co si si pridaval do libarys
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(url,user,pass);
            if (user.equals("root")){
                System.out.println("connected as ADMIN");
            }
            System.out.println("driver is running");
            return conn;
        }catch (SQLException | ClassNotFoundException e){
            System.out.println("DRIVER IS NOT RUNNING");
            e.printStackTrace();
        }
        return null;
    }

    public void insertNewUser(Person osoba){
        Connection conn = getConnection();
        try {
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO person (FirstName,LastName,dnar,rc) values (?,?,?,?)");
            stmt.setString(1,osoba.getFname());
            stmt.setString(2,osoba.getLname());
            stmt.setDate(3,new Date(osoba.getDob().getTime()));
            stmt.setString(4,osoba.getPin());
            stmt.executeUpdate();
            conn.close();
            System.out.println("succesfully finished");
        }catch (SQLException e) {
            System.out.println("INSERT IS NOT SUCCESFULLY FINISHED");
            e.printStackTrace();
        }
    }


    public void deleteAllUserRecord(){
        Connection conn = getConnection();
        try {
            PreparedStatement statement = conn.prepareStatement("DELETE from person");
            statement.executeUpdate();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Person getPersonByName(String name){
        Connection conn = getConnection();
        Person osobka=null;
        try {
            PreparedStatement statement = conn.prepareStatement("Select * from person where person.FirstName like ?");
            statement.setString(1,name);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                String FirstName = rs.getString("FirstName");
                String LastName = rs.getString("LastName");
                Date dnar = rs.getDate("dnar");
                String rc = rs.getString("rc");
                osobka=new Person(FirstName,LastName,rc,dnar);
            }
            //execute vrati result set (objekt triedy result set)
            conn.close();
        }   catch (SQLException e){
            e.printStackTrace();
        }

        return osobka;
    }

    public Person getPersonByBN(String bn){
        Connection conn = getConnection();
        Person osobka=null;
        try {
            PreparedStatement statement = conn.prepareStatement("Select * from person where person.rc like ?");
            statement.setString(1,bn);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                String FirstName = rs.getString("FirstName");
                String LastName = rs.getString("LastName");
                Date dnar = rs.getDate("dnar");
                String rc = rs.getString("rc");
                osobka=new Person(FirstName,LastName,rc,dnar);
            }
            //execute vrati result set (objekt triedy result set)
            conn.close();
        }   catch (SQLException e){
            e.printStackTrace();
        }

        return osobka;
    }

    public int getCountWoman(){
        int count=0;
        Connection conn = getConnection();
        try {
            PreparedStatement statement = conn.prepareStatement("select count(*) as pocet from person where rc like '__5%' or rc like '__6%'");
            ResultSet rs = statement.executeQuery();
            while(rs.next()){
                System.out.println(rs.getInt("pocet"));
            }

            conn.close();
            //execute vrati result set (objekt triedy result set)
//            conn.close();
        }   catch (SQLException e){
            e.printStackTrace();
        }

        return count;
    }

    public List<Person> getAllMens(){
        Connection conn = getConnection();
        List<Person> persons = new ArrayList<>();
        String querry = "Select * from person where rc like '__0%' or rc like '__1%'";
        try {
            PreparedStatement statement = conn.prepareStatement(querry);
            ResultSet resultset = statement.executeQuery();
            while (resultset.next()){
                String FirstName= resultset.getString("FirstName");
                String LastName =resultset.getString("LastName");
                Date dnar= resultset.getDate("dnar");
                String rc=resultset.getString("rc");

                Person osoba = new Person(FirstName,LastName,rc,dnar);
                persons.add(osoba);
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return persons;
    }

    public List<Person> getAllAdults(LocalDate datum){

        Connection conn = getConnection();
        List<Person> persons = new ArrayList<>();
        try {
            PreparedStatement statement = conn.prepareStatement("Select * from person where dnar < (? - interval 18 year)");
            statement.setString(1,datum.toString());
            ResultSet resultset = statement.executeQuery();
            while (resultset.next()){
                String FirstName= resultset.getString("FirstName");
                String LastName =resultset.getString("LastName");
                Date dnar= resultset.getDate("dnar");
                String rc=resultset.getString("rc");

                Person osoba = new Person(FirstName,LastName,rc,dnar);
                persons.add(osoba);
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return persons;
    }

    public HashSet<String> getFirstName(){
        Connection conn = getConnection();
        HashSet<String> persons = new HashSet<String>();
        try {
            PreparedStatement statement = conn.prepareStatement("Select * from person");
            ResultSet resultset = statement.executeQuery();
            while (resultset.next()){
                String FirstName= resultset.getString("FirstName");

                persons.add(FirstName);
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return persons;
    }

    public List<Person> getAllUsers(){

        Connection conn = getConnection();
        List<Person> persons = new ArrayList<>();
        try {
            PreparedStatement statement = conn.prepareStatement("Select * from person");
            ResultSet resultset = statement.executeQuery();
            while (resultset.next()){
                String FirstName= resultset.getString("FirstName");
                String LastName =resultset.getString("LastName");
                Date dnar= resultset.getDate("dnar");
                String rc=resultset.getString("rc");

                Person osoba = new Person(FirstName,LastName,rc,dnar);
                persons.add(osoba);
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return persons;
    }

}