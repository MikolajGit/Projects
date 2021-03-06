import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ships {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner data = new Scanner(System.in);

        String position;

        Playar playar1 = new Playar();
        Playar playar2 = new Playar();

        Score scorePlayer1 = new Score();
        Score scorePlayer2 = new Score();

        PlayerFields fieldsPlayer1 = new PlayerFields();
        PlayerFields fieldsPlayer2 = new PlayerFields();

        System.out.print("Give the name of the first player: ");
        playar1.setName(data.next());
        System.out.print("Give the name of the second player: ");
        playar2.setName(data.next());

        System.out.println();
        System.out.println("Let's get started!");

        System.out.println();
        System.out.println("Player: " + playar1.getName());
        System.out.print("Enter first field: ");
        fieldsPlayer1.setShip1(data.next());
        System.out.print("Enter second field: ");
        fieldsPlayer1.setShip2(data.next());
        System.out.print("Enter third field: ");
        fieldsPlayer1.setShip3(data.next());
        System.out.print("Enter fourth field: ");
        fieldsPlayer1.setShip4(data.next());
        System.out.print("Enter fifth field: ");
        fieldsPlayer1.setShip5(data.next());

        System.out.println();
        System.out.println("Player: " + playar2.getName());
        System.out.print("Enter first field: ");
        fieldsPlayer2.setShip1(data.next());
        System.out.print("Enter second field: ");
        fieldsPlayer2.setShip2(data.next());
        System.out.print("Enter third field: ");
        fieldsPlayer2.setShip3(data.next());
        System.out.print("Enter fourth field: ");
        fieldsPlayer2.setShip4(data.next());
        System.out.print("Enter fifth field: ");
        fieldsPlayer2.setShip5(data.next());

        while (true){
            System.out.println();
            System.out.println("Player: " + playar1.getName() + " (score: " + scorePlayer1.getScore() + ")");

            System.out.print("Enter position of the enemy ship's: ");
            position = data.next();

            if (position.equals(fieldsPlayer2.getShip1())){
                System.out.println("Hit!");
                fieldsPlayer2.setShip1(null);
                scorePlayer1.setScore();
            }else if (position.equals(fieldsPlayer2.getShip2())){
                System.out.println("Hit!");
                fieldsPlayer2.setShip2(null);
                scorePlayer1.setScore();
            }else if (position.equals(fieldsPlayer2.getShip3())){
                System.out.println("Hit!");
                fieldsPlayer2.setShip3(null);
                scorePlayer1.setScore();
            }else if (position.equals(fieldsPlayer2.getShip4())){
                System.out.println("Hit!");
                fieldsPlayer2.setShip4(null);
                scorePlayer1.setScore();
            }else if (position.equals(fieldsPlayer2.getShip5())){
                System.out.println("Hit!");
                fieldsPlayer2.setShip5(null);
                scorePlayer1.setScore();
            }else
                System.out.println("Fail :(");

            System.out.println();
            System.out.println("Player: " + playar2.getName() + " (score: " + scorePlayer2.getScore() + ")");

            System.out.print("Enter position of the enemy ship's: ");
            position = data.next();

            if (position.equals(fieldsPlayer1.getShip1())){
                System.out.println("Hit!");
                fieldsPlayer1.setShip1(null);
                scorePlayer2.setScore();
            }else if (position.equals(fieldsPlayer1.getShip2())){
                System.out.println("Hit!");
                fieldsPlayer1.setShip2(null);
                scorePlayer2.setScore();
            }else if (position.equals(fieldsPlayer1.getShip3())){
                System.out.println("Hit!");
                fieldsPlayer1.setShip3(null);
                scorePlayer2.setScore();
            }else if (position.equals(fieldsPlayer1.getShip4())){
                System.out.println("Hit!");
                fieldsPlayer1.setShip4(null);
                scorePlayer2.setScore();
            }else if (position.equals(fieldsPlayer1.getShip5())){
                System.out.println("Hit!");
                fieldsPlayer1.setShip5(null);
                scorePlayer2.setScore();
            }else
                System.out.println("Fail :(");

            if (scorePlayer1.getScore()==5||scorePlayer2.getScore()==5){
                System.out.println();
                System.out.println("The End");

                System.out.println();
                System.out.println("Scores:");
                System.out.println(playar1.getName() + " " + scorePlayer1.getScore());
                System.out.println(playar2.getName() + " " + scorePlayer2.getScore());



                break;
            }
        }

        File scoresSave = new File("scoreSave.txt");
        PrintWriter setScore = new PrintWriter(scoresSave);

        setScore.println("Scores:");
        setScore.println(playar1.getName() + ": " + scorePlayer1.getScore());
        setScore.println(playar2.getName() + ": " + scorePlayer2.getScore());
        setScore.close();

    }
}
