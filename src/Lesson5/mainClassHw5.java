package Lesson5;

import java.util.Arrays;

public class mainClassHw5 {
    public static void main(String[] args) {
        AppData appData = new AppData();
        appData.load("hw5.csv");

        System.out.println(Arrays.toString(appData.getHeader()));
        System.out.println(Arrays.deepToString(appData.getData()));

        appData.save("hw5_saved.csv");
    }
}
