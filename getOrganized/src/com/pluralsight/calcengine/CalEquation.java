package com.pluralsight.calcengine;

public class CalEquation {

    public double val1;
    public double val2;
    public double result;
    public char opCode;         //fields of each things needed to perform operation

    public double execute(){      //executable method for execute the operation
        switch (opCode){
            case 'a':
                result = val1 + val2;
            break;
            case 's':
                result = val1 - val2;
            break;
            case 'm':
                result = val1 * val2;
            break;

            default:
                result = val1 / val2;

        }

        return result;
    }

}
