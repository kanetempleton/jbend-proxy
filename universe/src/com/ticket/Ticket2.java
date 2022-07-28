package com.ticket;
import com.db.crud.*;

public class Ticket2 extends CRUDObject {

    private String title,custName,custEmail,custPhone,info,due,status;
    //private TicketProcessing manager;

    public Ticket2(CRUDHandler H, int id, String title, String customerName, String customerEmail, String customerPhone, String info, String due) {
        super(H,""+id);
        /*this.title = title;
        this.custName=customerName;
        this.custPhone=customerPhone;
        this.custEmail=customerEmail;
        this.info=info;
        this.due=due;
        this.status = "Awaiting diagnosis";*/
    }

}