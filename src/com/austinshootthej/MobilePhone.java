package com.austinshootthej;

public class MobilePhone implements ITelephone{
    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;


    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        this.isOn = true;
        System.out.println("Mobile Phone powered up.");

    }

    @Override
    public void dial(int phoneNumber) {
        if(isOn) {
            System.out.println("Now ringing " + phoneNumber + " on deskphone");
        }else{
            System.out.println("Phone is off");
        }

    }

    @Override
    public void answer() {
       if(isOn) {
           if (isRinging) {
               System.out.println("answering the mobile phone");
               isRinging = false;
           }
       }else{
           System.out.println("Phone is powered off.");
       }

    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber && isOn){
            isRinging = true;
            System.out.println("Melody ring");

        }else{
            isRinging = false;
            System.out.println("Phone is off or a different number");
        }

        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
