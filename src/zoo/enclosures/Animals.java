package zoo.enclosures;

public class Animals {
    
    public String name;
    private int amount;
    public int size;

    public Animals(String name, int size){

        this.name = name;
        this.size = size;
    }

    public Animals(String name){

        this.name = name;
    }

    public void Remaining(int amount){
        
        this.amount = amount;
    }

    protected int getRemaining(){

        return amount;
    }

    public void Remaining(double amount){
        
        this.amount = (int) amount;
    }

    public class Fish extends Animals{

        public Fish(String name, int size){
            super(name, size);
        }

        protected int getRemaining(){

            return super.getRemaining();
        }
    }

    public class Rhinos extends Animals{

        public Rhinos(String name, int size){
            super(name, size);
        }

        protected int getRemaining(){

            return super.getRemaining();
        }
    }
}
