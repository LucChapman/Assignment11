package zoo.events;

interface Other {
    
    String holidayName();
    int date();
    double time();
    String invitations();
}

class otherBirthdays implements Other{
    
    private String holidayName;
    private int date;
    private double time;
    private String invitations;

    public otherBirthdays(String holidayName, int date, double time, String invitations) {
        this.holidayName = holidayName;
        this.date = date;
        this.time = time;
        this.invitations = invitations;

    }

    public String holidayName() {
        return holidayName;
    }

    public int date() {
        return date;
    }

    public double time() {
        return time;
    }

    public String invitations() {
        return invitations;
    }
}

class otherHolidays implements Other{
    
    private String holidayName;
    private int date;
    private double time;
    private String invitations;

    public otherHolidays(String holidayName, int date, double time, String invitations) {
        this.holidayName = holidayName;
        this.date = date;
        this.time = time;
        this.invitations = invitations;

    }

    public String holidayName() {
        return holidayName;
    }

    public int date() {
        return date;
    }

    public double time() {
        return time;
    }

    public String invitations() {
        return invitations;
    }
}

class extraDays implements Other{
    
    private String holidayName;
    private int date;
    private double time;
    private String invitations;

    public extraDays(String holidayName, int date, double time, String invitations) {
        this.holidayName = holidayName;
        this.date = date;
        this.time = time;
        this.invitations = invitations;

    }

    public String holidayName() {
        return holidayName;
    }

    public int date() {
        return date;
    }

    public double time() {
        return time;
    }

    public String invitations() {
        return invitations;
    }
}
