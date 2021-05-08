package com.qrmenu.qrmenuapp.utils.qrmenuexceptions;

public class ObjectDoesExists extends Exists{

    public ObjectDoesExists() {
        super("Object Does Exist");
    }

    public ObjectDoesExists(Object object) {
        super(object.toString() + "Does already exist.");
    }

    public ObjectDoesExists(String message) {
        super(message);
    }
}
