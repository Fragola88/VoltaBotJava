package model;

import okhttp3.*;

import java.io.IOException;

/**
 * Singleton Obj
 */

public class ServerPanel implements CrudCat {

    private OkHttpClient client;
    private Response response;

    private final String publicIp="0.0.0.0";

    private final String endpoint = "http://"+publicIp+"/message";

    public static ServerPanel instance;

    private ServerPanel() {

    }

    static ServerPanel getInstance() {
        if (instance == null) {
            instance = new ServerPanel();
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

        this.response = this.client.newCall(request).execute();
    }

    @Override
    public String getResponse() {
        return "";
    }

}
