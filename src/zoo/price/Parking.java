package zoo.price;

public final class Parking {
    
    protected String parkingArea;
    public int parkingCost;
    private int avgPrice = 10;

    public void Area(String parkingArea){

        this.parkingArea = parkingArea;
    }

    public void Cost(int parkingCost){

        this.parkingCost = parkingCost;
    }

    public void Cost(double parkingCost){

        this.parkingCost = (int) parkingCost;
    }

    public void Average(){

        System.out.println(avgPrice);
    }
}
