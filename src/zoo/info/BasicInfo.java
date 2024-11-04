package zoo.info;

public class BasicInfo {
    
    public String name;
    protected String location;

    private void Location(String location){

        this.location = location;
    }

    public void Name(String name){

        this.name = name;
    }

    public String Name(int name){

        Location(location);
        return this.name = "null";
    }
}
