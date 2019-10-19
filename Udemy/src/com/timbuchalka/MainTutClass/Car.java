package com.timbuchalka.MainTutClass;

public class Car {

    private int wheels;
    private int doors;
    private String model;
    private String engine;
    private String  colour;

    public void setModel(String modelCurrent){
        String validModel = modelCurrent.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("commodore")){
            this.model = modelCurrent.toLowerCase();
        }else{
            this.model = "Unknown";
        }
    }

    public String getModel(){
        return this.model;
    }

}
