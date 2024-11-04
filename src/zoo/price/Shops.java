package zoo.price;

public final class Shops {
    
    private String list;
    protected int numShops;

    public void Names(String list){

        this.list = list;
    }

    public String getList(String list){

        return this.list;
    }

    public void ShopCount(int numShops){

        this.numShops = numShops;
    }

    public void ShopCount(double numShops){

        this.numShops = (int) numShops;
    }
}
