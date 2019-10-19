import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordsTest {

    @BeforeEach
    void setUp(){

    }

    @Test
    void isEquals() {

        List<String> listCreated;
        List<String> listReadet;

        ReadFile readFile = new ReadFile();
        readFile.readingStart();
        listReadet = readFile.getList();

        Words words = new Words();
        words.createWords();
        listCreated = words.getList();

        assertTrue(words.isEquals(listCreated,listReadet));
    }
}