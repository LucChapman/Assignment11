package zoo.info;

public abstract class ExtraInfo {
    
    protected abstract String SubZoo();

    protected abstract String OtherLocale();

    private int zooAreaCode;

    public void Code(int zooAreaCode){

        this.zooAreaCode = zooAreaCode;
    }

    public int returnCode(int zooAreaCode){

        return this.zooAreaCode;
    }
}
