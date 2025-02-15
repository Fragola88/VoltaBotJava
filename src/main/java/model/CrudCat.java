package model;

import java.io.IOException;

public interface CrudCat {

    void sendMessage(String message) throws Exception;


    String getResponse();


}
