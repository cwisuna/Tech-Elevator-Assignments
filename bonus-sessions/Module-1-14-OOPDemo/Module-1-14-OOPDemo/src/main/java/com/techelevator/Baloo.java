package com.techelevator;

public class Baloo implements Bear {

    private String name;
    private int height;
    private int weight;
    private String furColor;
    private String catchphrase;


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }


    public void setWeight(int weight) {
        this.weight = weight;
    }


    public String getFurColor() {
        return furColor;
    }


    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }


    public String getCatchphrase() {
        return catchphrase;
    }


    public void setCatchphrase(String catchphrase) {
        this.catchphrase = catchphrase;
    }


    public String sings(){
        return "La la la la";
    }


    public String dances(){
        return "dance dance dance";
    }





}
