package sk.itsovy.projectexeption;

public class Example {
    public void arrayTestException() throws ArithmeticException, ArrayIndexOutOfBoundsException{
        int[] arr = {5,18,95};
        try {
            double v;
            int x = -56;
            if (x<=0) throw new ArithmeticException("Log cannot pass a negative number");
            v = Math.log10(x);
            for(int i = 0; i<=3; i++){
                System.out.println(arr[i] + " ");
            }
        } catch (ArithmeticException ww){
            System.out.println(ww.toString());
            System.out.println("aritm.ex");
        }catch (ArrayIndexOutOfBoundsException e)
        {
//            e.printStackTrace(); //predtym takto sme to pisali, ale teraz cez sout lepsie vidime
            System.out.println(e.toString());
        }
        finally {
            System.out.println("muselo sa vykonat");
        }

        System.out.println("hello");


    }
}