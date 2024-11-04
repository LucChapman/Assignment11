package zoo.enclosures;

public abstract class MaintainCost {
    
    private int foodExpenses;
    protected int cleaning;
    
    protected abstract int AnimalCost();

    protected abstract int FoodCost();

    public abstract int GeneralCost();

    public int FoodCost(int foodExpenses){

        return this.foodExpenses = foodExpenses;
    }

    public int getFoodCost(int foodExpenses){

        return this.foodExpenses;
    }

    public int Cleaning(int cleaning){

        return this.cleaning = cleaning;
    }
}
