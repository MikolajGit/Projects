public class Card {
    private int card;
    public Card()
    {
        this.card=0;
    }
    public void setCard(int operationIn)
    {
        this.card=card+operationIn;
    }
    public void cashOut(int operationOut)
    {
        if (operationOut<=card)
        this.card=card-operationOut;
        else
            System.out.println("Blad! Nie mozna wyplacic wiecej niz wynosi stan Twojego konta!");
    }
    public void getCard() {
        System.out.println(card);
    }
}
