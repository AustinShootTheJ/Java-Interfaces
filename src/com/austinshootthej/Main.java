package com.austinshootthej;

public class Main {

    public static void main(String[] args) {

    ITelephone ajsPhone = new DeskPhone(123456);
    ajsPhone.powerOn();
    ajsPhone.callPhone(123456);
    ajsPhone.answer();

    ajsPhone = new MobilePhone(234567);
    ajsPhone.powerOn();
    ajsPhone.callPhone(234567);
    ajsPhone.answer();




    }
}
