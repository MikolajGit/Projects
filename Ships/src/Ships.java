import java.util.Scanner;

public class Ships {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        Playar playar1 = new Playar();
        Playar playar2 = new Playar();

        System.out.print("Give the name of the first player: ");
        playar1.setName(data.next());
        System.out.print("Give the name of the second player: ");
        playar2.setName(data.next());

        System.out.println(playar1.getName());
        System.out.println(playar2.getName());
        
    }
}
