package zoo.enclosures;

interface Popularity {
    
    int numVisits();
    int crowdSize();
    int crowdExcitement();
    int monetaryGain();

}

class Enclosures implements Popularity{
    
    private int numVisits;
    private int crowdSize;
    private int crowdExcitement;
    private int monetaryGain;

    public Enclosures(int numVisits, int crowdSize, int crowdExcitement, int monetaryGain) {
        this.numVisits = numVisits;
        this.crowdSize = crowdSize;
        this.crowdExcitement = crowdExcitement;
        this.monetaryGain = monetaryGain;

    }

    public int numVisits() {
        return numVisits;
    }

    public int crowdSize() {
        return crowdSize;
    }

    public int crowdExcitement() {
        return crowdExcitement;
    }

    public int monetaryGain() {
        return monetaryGain;
    }
}

class Shop implements Popularity{
    
    private int numVisits;
    private int crowdSize;
    private int crowdExcitement;
    private int monetaryGain;

    public Shop(int numVisits, int crowdSize, int crowdExcitement, int monetaryGain) {
        this.numVisits = numVisits;
        this.crowdSize = crowdSize;
        this.crowdExcitement = crowdExcitement;
        this.monetaryGain = monetaryGain;

    }

    public int numVisits() {
        return numVisits;
    }

    public int crowdSize() {
        return crowdSize;
    }

    public int crowdExcitement() {
        return crowdExcitement;
    }

    public int monetaryGain() {
        return monetaryGain;
    }
}
