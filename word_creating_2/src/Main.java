import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ReadFile readFile = new ReadFile();
        readFile.readingStart();
        List<String> listFromFile = readFile.getList();

        Words words = new Words();
        words.createWords();
        List<String> listCreated = words.getList();

        words.isEquals(listCreated,listFromFile);

    }

}
