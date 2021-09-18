package Lesson3;
import java.util.ArrayList;
import java.util.Arrays;

public class MainClass {

    public static void main(String[] args) {

        String[] stringArr = {"Apple", "Orange", "Box", "Java", "Fruits"};

        System.out.println(Arrays.toString(stringArr));
        swapArray(stringArr,1, 3);
        System.out.println(Arrays.toString(stringArr));



        Box<Apple> boxOfApples = new Box<>();
        Box<Apple> newBoxOfApples = new Box<>();
        Box<Orange> boxOfOranges = new Box<>();
        Box<Orange> newBoxOfOranges = new Box<>();

        for (int i = 0; i < 20; i++) {
            boxOfApples.addFruit(new Apple());
            boxOfOranges.addFruit(new Orange());
        }

        System.out.println("Вес коробки с яблоками: " + boxOfApples.getWeight());
        System.out.println("Вес коробки с апеллсинами: " + boxOfOranges.getWeight());
        System.out.println("Сравниваем коробки с апельсинами: " + boxOfOranges.compare(boxOfOranges));
        System.out.println("Сравниваем коробку с апельсинами и яблоками: " + boxOfOranges.compare(boxOfApples));
        boxOfApples.changeBox(newBoxOfApples);
        System.out.println("Вес коробки, с которой пересыпали яблоки: " + boxOfApples.getWeight());
        System.out.println("Вес коробки, в которую пересыпали яблоки: " + newBoxOfApples.getWeight());
        boxOfOranges.changeBox(newBoxOfOranges);
        System.out.println("Вес коробки, с которой пересыпали апельсины: " + boxOfOranges.getWeight());
        System.out.println("Вес коробки, в которую пересыпали апельсины: " + newBoxOfOranges.getWeight());
    }

    private static <T> void swapArray(T[] array, int firstIndex, int secondIndex){
        T temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }




}


