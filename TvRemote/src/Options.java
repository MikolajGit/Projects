import java.util.Scanner;
public class Options {

    Scanner data = new Scanner(System.in);

    private boolean onOff;
    private int volume;
    private int channel;

    public Options()
    {
        this.channel = 1;
    }
    public void setOn()
    {
        this.onOff = true;
    }
    public void setOff()
    {
        this.onOff = false;
    }
    public void channel_1()
    {
        this.channel=1;
        System.out.println("Program 1");
    }
    public void channel_2()
    {
        this.channel=2;
        System.out.println("Program 2");
    }
    public void channel_3()
    {
        this.channel=3;
        System.out.println("Program 3");
    }
    public void channel_4()
    {
        this.channel=4;
        System.out.println("Program 4");
    }
    public void channel_5()
    {
        this.channel=5;
        System.out.println("Program 5");
    }
    public void channel_6()
    {
        this.channel=6;
        System.out.println("Program 6");
    }
    public void channel_7()
    {
        this.channel=7;
        System.out.println("Program 7");
    }
    public void channel_8()
    {
        this.channel=8;
        System.out.println("Program 8");
    }
    public void channel_9()
    {
        this.channel=9;
        System.out.println("Program 9");
    }
    public void volumeUP()
    {
        if (volume<15)
        {
            this.volume=volume+1;
            System.out.println("Glosnosc: " + volume);
        }
        else if (volume==15)
            System.out.println("Osiagnieto wartosc maksymalna!");
    }
    public void volumeDOWN()
    {
        if (volume>0)
        {
            this.volume=volume-1;
            System.out.println("Glosnosc: " + volume);
        }
        else if (volume==0)
            System.out.println("Osiagnieto wartosc minimalna!");
    }
    public void channelUP()
    {
        if (channel<9)
        {
            this.channel=channel+1;
        }
        else if (channel==9)
            {
                this.channel=1;
            }
    }
    public void channelDOWN()
    {
        if (channel>1)
        {
            this.channel=channel-1;
        }
        else if (channel==1)
        {
            this.channel=9;
        }
    }
    public void showChannel()
    {
        if (getChannel()==1)
        {
            channel_1();
        }
        else if (getChannel()==2)
        {
            channel_2();
        }
        else if (getChannel()==3)
        {
            channel_3();
        }
        else if (getChannel()==4)
        {
            channel_4();
        }
        else if (getChannel()==5)
        {
            channel_5();
        }
        else if (getChannel()==6)
        {
            channel_6();
        }
        else if (getChannel()==7)
        {
            channel_7();
        }
        else if (getChannel()==8)
        {
            channel_8();
        }
        else if (getChannel()==9)
        {
            channel_9();
        }
    }
    public boolean getOnOff()
    {
        if (onOff)
        {
            return onOff;
        }
        else
            return onOff;
    }
    public int getVolume() {
        return volume;
    }

    public int getChannel() {
        return channel;
    }
}
