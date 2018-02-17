public class ShipFields {
    String ships [][] = new String[5][5];
    public void setShips(int x, int y) {
        this.ships[x][y] = "x";
    }

    public String getShips(int x, int y) {
            return ships[x][y];
    }
}
