package com;

public class BasicWebsite extends NetApplication {

    public BasicWebsite() {
        super("mySite");
    }

    public void runApplication() {
       // System.out.println("Appleecashun is runnin!");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}