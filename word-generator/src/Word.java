import java.util.Arrays;

public class Word {

    String word;

    public Word(String word){
        this.word=word;
    }

    public void generate(){
        for (int a=0;a<word.length();a++){
            System.out.println(" ");
            String tempword = word;
            for (int b=0;b<word.length()-1;b++){
                switchChars(a,b+1);
                if(!word.equalsIgnoreCase(tempword)){
                    System.out.println(getWord());
                }
                word=tempword;
            }
        }
    }

    public void switchChars(int indexF, int indexS){
        char[] chars = word.toCharArray();
        char temp = chars[indexF];
        chars[indexF]=chars[indexS];
        chars[indexS]=temp;
        word="";
        for (int a=0;a<chars.length;a++){
            word+=chars[a];
        }
    }

    public String getWord(){
        return this.word;
    }
}
