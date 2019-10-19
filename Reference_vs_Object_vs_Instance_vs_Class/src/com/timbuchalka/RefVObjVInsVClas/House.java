package com.timbuchalka.RefVObjVInsVClas;

public class House {

    private String color;
    private String type;
    private int windows;
    private int doors;


    public House (String colorH,String typeH,int windowsH,int doorsH){
        this.color=colorH;
        this.type=typeH;
        this.windows=windowsH;
        this.doors=doorsH;
    }

    public String getColor(){
        return color;
    }
    public String getType(){
        return type;
    }
    public int getWindows(){
        return windows;
    }
    public int getDoors(){
        return doors;
    }

    public void setColor(String stColor){
        this.color=stColor;
    }
    public void setType(String stType){
        this.type=stType;
    }
    public void setWindows(int stWindows){
        this.windows=stWindows;
    }
    public void setDoors(int stDoors){
        this.doors=stDoors;
    }
}
