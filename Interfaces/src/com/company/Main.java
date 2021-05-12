package com.company;

public class Main {

    public static void main(String[] args) {
	ITelephone valentinsPhone;
	valentinsPhone= new DeskPhone(23456);
	valentinsPhone.powerOn();
	valentinsPhone.callPhone(23456);
	valentinsPhone.answer();

	valentinsPhone = new MobilePhone(23456);
	valentinsPhone.powerOn();
	valentinsPhone.callPhone(23456);
	valentinsPhone.answer();
    }
}
