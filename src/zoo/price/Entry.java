package zoo.price;

public class Entry {
    
    static int entryCost;
    static int dayPass;
    protected int cost;

    public void defineCost(int cost){

        enterCost();
        dayCost();
        System.out.println(cost);
    }

    private static void enterCost(){

        System.out.println(entryCost);
    }

    private static void dayCost(){

        System.out.println(dayPass);
    }


}
