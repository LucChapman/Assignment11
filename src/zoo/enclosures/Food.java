package zoo.enclosures;

public class Food {
 
    public boolean isCarnivore;
    private int amountRequired;

    public Food(boolean isCarnivore){

        this.isCarnivore = isCarnivore;
    }

    public Food(int amountRequired){
        
        this.amountRequired = amountRequired;
    }

    protected int getRequired(){

        return amountRequired;
    }

    public void setCarnivore(boolean isCarnivore){
        
        this.isCarnivore = isCarnivore;
    }

    public class Meat extends Food{

        public Meat(boolean isCarnivore){
            super(isCarnivore);
        }

        protected Meat(int amountRequired){

            super(amountRequired);
        }
    }

    public class Greens extends Food{

        public Greens(boolean isCarnivore){
            super(isCarnivore);
        }

        protected Greens(int amountRequired){

            super(amountRequired);
        }
    }
}
