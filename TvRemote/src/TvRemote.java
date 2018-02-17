import java.util.Scanner;

public class TvRemote {
    public static void main(String[]args)
    {
        Scanner data = new Scanner(System.in);
        Menu option = new Menu();

        String chose;

        System.out.println("Witaj w TvRemote!");
        System.out.print("Wpisz polecenie: ");
        chose = data.next();

        while (true)
        {
            if (chose.equals("on"))
            {
                option.setOn();
                System.out.println("Tv is on");
                while (true)
                {
                    System.out.print("Wpisz polecenie: ");
                    chose = data.next();
                    if (chose.equals("off"))
                    {
                        System.out.println("Tv is off");
                        System.exit(0);
                    }
                    else if (chose.equals("ch+"))
                    {
                        option.channelUP();
                        option.showChannel();
                    }
                    else if (chose.equals("ch-"))
                    {
                        option.channelDOWN();
                        option.showChannel();
                    }
                    else if (chose.equals("1"))
                    {
                        option.channel_1();
                    }
                    else if (chose.equals("2"))
                    {
                        option.channel_2();
                    }
                    else if (chose.equals("3"))
                    {
                        option.channel_3();
                    }
                    else if (chose.equals("4"))
                    {
                        option.channel_4();
                    }
                    else if (chose.equals("5"))
                    {
                        option.channel_5();
                    }
                    else if (chose.equals("6"))
                    {
                        option.channel_6();
                    }
                    else if (chose.equals("7"))
                    {
                        option.channel_7();
                    }
                    else if (chose.equals("8"))
                    {
                        option.channel_8();
                    }
                    else if (chose.equals("9"))
                    {
                        option.channel_9();
                    }
                    else if (chose.equals("+"))
                    {
                        option.volumeUP();
                    }
                    else if (chose.equals("-"))
                    {
                        option.volumeDOWN();
                    }
                    else if (chose.equals("help"))
                    {
                        option.help();
                    }
                    else
                        {
                            System.out.println("Zle polecenie!");
                        }
                }
            }
            else
                {
                    System.out.println("Tv is off");
                    System.out.println("Aby wlaczyc wybierz - on");
                    chose = data.next();
                }
        }
    }
}
