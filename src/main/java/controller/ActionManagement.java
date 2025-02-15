package controller;

import model.CrudCat;
import okhttp3.*;

import java.io.IOException;

/**
 * Singleton Obj
 */

public class ActionManagement implements CrudCat {

    private OkHttpClient client;
    private Response response;

    private final String publicIp="0.0.0.0";

    private final String endpoint = "http://"+publicIp+"/message";

    static ActionManagement instance;

    private ActionManagement() {

    }

    static ActionManagement getInstance() {
        if (instance == null) {
            instance = new ActionManagement();
        }
        return instance;
    }

    @Override
    public void sendMessage(String message) throws IOException {

        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType, "{\n  \"text\": \"hello!\"\n}");
        Request request = new Request.Builder()
                .url("http://localhost/message")
                .post(body)
                .addHeader("Content-Type", "application/json")
                .build();

        response = client.newCall(request).execute();
    }

    @Override
    public String getResponse() {
        return "";
    }

}
