public class CompareFields extends PlayerFields {
    public void compareFields(String position){
        if (position.equals(getShip1())||position.equals(getShip2())||position.equals(getShip3())||position.equals(getShip4())||position.equals(getShip5())){
            System.out.println("Hit!");
        }
        else
            System.out.println("Fail :(");
    }
}
