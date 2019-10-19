import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Word word;
        Scanner input = new Scanner(System.in);

        word = new Word(input.next());
        word.generate();
    }
}
