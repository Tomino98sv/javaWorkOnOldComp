import java.util.ArrayList;
import java.util.List;

public class Words {

    List<String> list = new ArrayList<String>();


    public void createWords(){
        char[] pole = new char[4];
        int count = 0;

        for (int a=65;a<=90;a++){
            for (int j=65;j<=90;j++){
                for (int k=65;k<=90;k++){
                    int sum = a+j+k;
                    int rest = 300-sum;
                    if (rest>='A' && rest<='Z'){
                        count++;
                        int l = rest;
                        pole[0]=(char)a;
                        pole[1]=(char)j;
                        pole[2]=(char)k;
                        pole[3]=(char)l;
                        list.add(String.valueOf(pole));
                    }
                }
            }
        }
    }

    public List<String> getList(){
        return list;
    }

    public boolean isEquals(List<String> listOne, List<String> listTwo){

        if (listOne.size() != listTwo.size()){
            return false;
        }  else{
            for (int a=0;a<listOne.size();a++){
                System.out.println(listOne.get(a)+" == "+listTwo.get(a));
                for (int i=0; i<4;i++){
                    if(listOne.get(a).charAt(i)==listTwo.get(a).charAt(i)){
                        System.out.println("TRUE");
                    }else{
                        return false;
                    }
                }
            }
        }

        return true;
    }

}
