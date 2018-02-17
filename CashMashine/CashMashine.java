
//one-nazwa karty

import java.util.Scanner;

public class CashMashine {
    public static void main(String[]args)
    {
        Scanner enterData = new Scanner(System.in);
        String cardName;
        String menu;
        int amount;

        Card one = new Card();

        one.setCard(1250);

        System.out.println(">>Nazwa karty - one<<");

        System.out.print("Wloz karte: ");
        cardName = enterData.next();

        for (int varOperation1 = 0;;varOperation1++) {
            if (cardName.equals("one"))
            {
                System.out.println("Nazwa prawdidlowa.");
                for (int varOperation2 = 0;;varOperation2++)
                {
                System.out.println("MENU:\n1 - Wplac Pieniadze.\n2 - Wyplac Pieniadze.\n3 - Stan Konta.\nkoniec - koniec");
                menu = enterData.next();
                if (menu.equals("1")) {
                    try
                    {
                        System.out.print("Stan konta wynosi: ");
                        one.getCard();
                        System.out.print("Podaj kwote wplaty: ");
                        amount = enterData.nextInt();

                        for (int varOperation6 = 0; ; varOperation6++) {
                            try
                            {
                            if (amount >= 0) {
                                one.setCard(amount);
                                System.out.print("Stan konta wynosi: ");
                                one.getCard();
                                System.out.println("Jesli chcesz wrocic do MENU wybierz - wstecz\nNatomiast jesli chcesz zakonczyc wybierz - koniec");
                                menu = enterData.next();
                                for (int varOperation3 = 0; ; varOperation3++) {
                                    if (menu.equals("wstecz"))
                                        break;
                                    else if (menu.equals("koniec"))
                                        System.exit(0);
                                    else {
                                        System.out.print("Blad! Wpisz polecenie jeszcze raz!: ");
                                        menu = enterData.next();
                                    }
                                    break;
                                }
                                break;
                            } else if (amount < 0) {
                                System.out.print("Blad! kwota nie moze być ujemna!\nWpisz kwote jeszcze raz lub zakoncz wybierajac -koniec: ");
                                amount = enterData.nextInt();
                            }
                        }catch(Exception error)
                            {
                                    System.out.println("Blad! Podaj polecenie jeszcze raz: ");
                                    break;
                            }
                        }
                }
                catch(Exception error)
                {
                    System.out.println("Blad! Wybierz polecenie jeszcze raz: ");
                    menu = enterData.next();
                }
                }
                else if (menu.equals("2"))
                {
                    try
                    {
                        System.out.print("Stan konta wynosi: ");
                        one.getCard();
                        System.out.print("Podaj kwotę wyplaty: ");
                        amount = enterData.nextInt();
                        System.out.println(amount);

                        for (int varOperation6 = 0; ; varOperation6++) {
                            try
                            {
                                if (amount >= 0) {
                                    one.cashOut(amount);
                                    System.out.print("Stan konta wynosi: ");
                                    one.getCard();
                                    System.out.println("Jesli chcesz wrocic do MENU wybierz - wstecz\nNatomiast jesli chcesz zakonczyc wybierz - koniec");
                                    menu = enterData.next();
                                    for (int varOperation3 = 0; ; varOperation3++) {
                                        if (menu.equals("wstecz"))
                                            break;
                                        else if (menu.equals("koniec"))
                                            System.exit(0);
                                        else {
                                            System.out.print("Blad! Wpisz polecenie jeszcze raz!: ");
                                            menu = enterData.next();
                                        }
                                        break;
                                    }
                                    break;
                                } else if (amount < 0) {
                                    System.out.print("Blad! kwota nie moze byc ujemna!\nWpisz kwote jeszcze raz lub zakoncz wybierajac -koniec: ");
                                    amount = enterData.nextInt();
                                }
                            }catch(Exception error)
                            {
                                System.out.println("Blad! Podaj polecenie jeszcze raz: ");
                                break;
                            }
                        }
                    }
                    catch(Exception error)
                    {
                        System.out.println("Blad! Wybierz polecenie jeszcze raz: ");
                        menu = enterData.next();
                    }
                }
                else if (menu.equals("3"))
                {
                    System.out.print("Stan konta wynosi: ");
                    one.getCard();
                    System.out.println("Jesli chcesz wrocic do MENU wybierz - wstecz\nNatomiast jesli chcesz zakonczyć wybierz - koniec");
                    menu = enterData.next();
                    for (int varOperation5 = 0;;varOperation5++){
                    if (menu.equals("wstecz"))
                        break;
                    else if (menu.equals("koniec"))
                        System.exit(0);
                        else
                            {
                        System.out.print("Blad! Wpisz polecenie jeszcze raz!: ");
                            menu = enterData.next();
                            }
                    }
                }
                else if (menu.equals("koniec"))
                {
                    System.exit(0);
                }
                else
                    {
                        System.out.println("Zle polecenie!!!\nPodaj polecenie jeszcze raz: ");
                    }
            }
            }
            else if (cardName.equals("koniec"))
                break;
            else
                {
                System.out.print("Nieprawdidlowa nazwa!!!\nPodaj nazwe jeszcze raz:");
                cardName = enterData.next();
                }
        }
    }
}
