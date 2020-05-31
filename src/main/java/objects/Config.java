package objects;

import okhttp3.*;

import java.io.IOException;


public class Config extends Data {
    OkHttpClient client = new OkHttpClient();
    public static final MediaType JSON = MediaType.get("application/json; charset=utf-8");

    public String post(String url, String json) throws IOException {
        RequestBody body = RequestBody.create(json, JSON);
        Request request = new Request.Builder()
                .url(url)
                .addHeader("Content-Type", "application/json")
                .post(body)
                .build();
        try (Response response = client.newCall(request).execute()) {
            if (response.code() != 200) {
                throw new AssertionError("CODE ERROR:" + response.code());
            }
            return response.body().string();
        }
    }
}