package com;

import com.server.*;
import com.server.entity.ServerConnection;
import com.server.protocol.*;
import com.server.web.*;
import com.tickets.*;

import com.db.crud.*;
import java.lang.reflect.Field;


public class Main {

    public static Launcher launcher;

    public static void main(String[] args) {
        BasicWebsite mysite = new BasicWebsite();
        launcher = new Launcher(mysite);
        launcher.startThreads();
    }


}