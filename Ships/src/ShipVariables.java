import java.util.Scanner;

public class ShipVariables extends ShipFields {
    private int varX;
    private int varY;

    Scanner data = new Scanner(System.in);

    public void setVarX(String varX){
        varX = data.next();
        while (true) {
            if (varX.equals("a")) {
                this.varX = 0;
                break;
            } else if (varX.equals("b")) {
                this.varX = 1;
                break;
            } else if (varX.equals("c")) {
                this.varX = 2;
                break;
            } else if (varX.equals("d")) {
                this.varX = 3;
                break;
            } else if (varX.equals("e")) {
                this.varX = 4;
                break;
            } else {
                System.out.println("Error");
                System.out.print("Enter the data again: ");
                varX = data.next();
            }
        }
    }
    public int getVarX(){
        return varX;
    }
}
