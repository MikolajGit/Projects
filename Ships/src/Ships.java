import java.util.Scanner;

public class Ships {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        Playar playar1 = new Playar();
        Playar playar2 = new Playar();

        PlayerFields fieldsPlayer1 = new PlayerFields();
        PlayerFields fieldsPlayer2 = new PlayerFields();

        System.out.print("Give the name of the first player: ");
        playar1.setName(data.next());
        System.out.print("Give the name of the second player: ");
        playar2.setName(data.next());

        System.out.println("Let's get started!");
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

        System.out.println(fieldsPlayer1.getShip1());
        System.out.println(fieldsPlayer1.getShip2());
        System.out.println(fieldsPlayer1.getShip3());
        System.out.println(fieldsPlayer1.getShip4());
        System.out.println(fieldsPlayer1.getShip5());


    }
}
