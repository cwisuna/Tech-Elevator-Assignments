package com.techelevator;

public class Television {
    //instance variables
    private boolean isOn;
    private int currentChannel = 3;
    private int currentVolume = 2;

    //getters
    public boolean isOn() {
        return isOn;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    //methods
    public void turnOff(){
        isOn = false;
    }
    public void turnOn(){
        isOn = true;
    }
    public void changeChannel(int newChannel){
        if(isOn && newChannel >3 && isOn && newChannel <18){
                this.currentChannel = newChannel;
        }
    }
    public void channelUp(){
        if(isOn){
            currentChannel ++;
        }if(currentChannel >18) {
            currentChannel = 3;
        }
    }
    public void channelDown(){
        if(isOn){
            currentChannel --;
        }if(currentChannel < 3){
            currentChannel = 18;
        }
    }
    public void raiseVolume(){
        if(isOn){
            currentVolume ++;
        }
    }
    public void lowerVolume(){
        if(isOn && currentVolume >0){
            currentVolume --;
        }
    }







}
