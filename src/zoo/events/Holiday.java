package zoo.events;

public class Holiday {
    
    public String holiday;
    static String halloween;
    static String christmas;
    static String easter;

    protected void defineHoliday(String holiday){

        this.holiday = holiday;
    }

    public static void displayOctober(){

        System.out.println(halloween);
    }

    public static void displayDecember(){

        System.out.println(christmas);
    }

    public String defineHoliday(int holiday){

        return this.holiday = "null";
    }

    public static void displaySpring(){

        System.out.println(easter);
    }

    class uniqueHoliday extends Holiday{

        protected void defineHoliday(String holiday){
            
            this.holiday = holiday;
        }

        public void superHoliday(String holiday){
            
            super.defineHoliday(holiday);
        }
    }
}
