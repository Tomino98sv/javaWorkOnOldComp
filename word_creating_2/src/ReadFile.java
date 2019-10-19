import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    int count = 0;
    File file = new File("C:\\Users\\Tomas\\Downloads\\subor.txt");
    BufferedReader br;
    List<String> list = new ArrayList<String>();


    public void readingStart(){
        {
            try {
                br = new BufferedReader(new FileReader(file));

                String st;
                while ((st = br.readLine()) != null){
                    count++;
                    list.add(st);
                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public List<String> getList(){
        return list;
    }
}
