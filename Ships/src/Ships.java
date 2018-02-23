import java.util.Scanner;

public class Ships {
    public static void main(String[] args) {
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

            if (position.equals(fieldsPlayer2.getShip1())||position.equals(fieldsPlayer2.getShip2())||position.equals(fieldsPlayer2.getShip3())||position.equals(fieldsPlayer2.getShip4())||position.equals(fieldsPlayer2.getShip5())){
                System.out.println("Hit!");
                scorePlayer1.setScore();
            }
            else
                System.out.println("Fail :(");

            System.out.println();
            System.out.println("Player: " + playar2.getName() + " (score: " + scorePlayer2.getScore() + ")");

            System.out.print("Enter position of the enemy ship's: ");
            position = data.next();

            if (position.equals(fieldsPlayer1.getShip1())||position.equals(fieldsPlayer1.getShip2())||position.equals(fieldsPlayer1.getShip3())||position.equals(fieldsPlayer1.getShip4())||position.equals(fieldsPlayer1.getShip5())){
                System.out.println("Hit!");
                scorePlayer2.setScore();
            }
            else
                System.out.println("Fail :(");

            if (scorePlayer1.getScore()==5||scorePlayer2.getScore()==5){
                System.out.println();
                System.out.println("The End");

                System.out.println();
                System.out.println("Scores:");
                System.out.println(playar1.getName() + " " + scorePlayer1.getScore());
                System.out.println(playar2.getName() + " " + scorePlayer2.getScore());

                System.exit(0);
            }
        }


    }
}
