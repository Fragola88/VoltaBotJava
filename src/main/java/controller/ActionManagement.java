package controller;

/**
 * Singleton Obj
 */

public class ActionManagement {

    static ActionManagement instance;

    private  ActionManagement() {

    }

    static ActionManagement getInstance() {
        if (instance == null) {
            instance = new ActionManagement();
        }
        return instance;
    }

    /*
    edited by matteo x2
     */

    //TODO()
}
