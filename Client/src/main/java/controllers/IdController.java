package controllers;

import java.util.ArrayList;

import models.Id;

final public class IdController {
    Id myId;
    private static IdController INSTANCE = new IdController();

    private IdController(){
    }

    public ArrayList<Id> getIds() {
        return null;
    }

    public Id postId(Id id) {
        return null;
    }

    public Id putId(Id id) {
        return null;
    }

    public static IdController getInstance(){ return INSTANCE;}


 
}