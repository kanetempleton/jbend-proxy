package com.ticket;
import com.db.crud.*;

public class TicketManager2 extends CRUDHandler implements Runnable {

    private boolean running;

    //title,custName,custEmail,custPhone,info,due,status
    public TicketManager2() {
        super("tickets","id");
        setSaveFields(new String[]{"title","customerName","customerPhone","customerEmail","info","status","dueDate"});
        running=false;
    }

    public void start() {
        running=true;
        System.out.println("Ticket Manager is running!");
        while (running) {

        }
        System.out.println("Ticket Manager has been stopped.");
    }

    public void stop() {
        running = false;
    }
    public boolean running(){return running;}

}