package Lesson6;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.http.HttpRequest;

public class TestUrl {
    public static void main(String[] args) throws Exception {
        URL testURL = new URL("https://github.com/nordy86/GB_Java_Core/pull/5");

        InputStream inputStream = testURL.openStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

        String line;
        while ((line = bufferedReader.readLine()) !=null){
            System.out.println(line);
        }
        bufferedReader.close();
    }
}
