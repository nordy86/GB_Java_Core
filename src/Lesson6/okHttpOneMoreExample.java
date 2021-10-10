package Lesson6;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class okHttpOneMoreExample {
    public static void main(String[] args) throws IOException {
        OkHttpClient Client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://geekbrains.ru")
                .build();
        Response response = Client.newCall(request).execute();
        String body = response.body().string();

        System.out.println(response.code());
        }
}

