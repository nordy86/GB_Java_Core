package lesson1;

import lesson1.Competitors.*;
import lesson1.obstacles.*;

public class MainClass {
    public static void main(String[] args) {

        Competitor[] competitors = {new Human("Mike"), new Cat("Catsan"), new Dog("Barker")};
        Obstacle[] obstacles = {new Cross(500), new Wall(1), new Water(3)};

        Team team = new Team("DreamTeam", competitors);

        System.out.println("Создаем команду");
        System.out.println(team.getTeamName());

        System.out.println("Приветствуем участников");
        team.showResults();


        Course course = new Course(obstacles);

        System.out.println("Команда выходит на полосу  ");
        course.doIt(team);

        System.out.println("Показываем результат");
        team.showResults();

        System.out.println("Финиш!");
        team.showMembersFinishedCourse();
    }
}

