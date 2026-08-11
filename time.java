class time1{
    private int hour;       // 0 - 23
    private int minute;     // 0 - 59
    private int second;     // 0 - 59

    public void setTime(int hour, int minute, int second) {

        if (hour >= 0 && hour < 24)
            this.hour = hour;
        else
            this.hour = 0;

        if (minute >= 0 && minute < 60)
            this.minute = minute;
        else
            this.minute = 0;

        if (second >= 0 && second < 60)
            this.second = second;
        else
            this.second = 0;
    }

    public String toUniversalString() {
        return String.format( "%02d:%02d:%02d", hour, minute, second ); 

    }

    public String toString() {
          return String.format( "%d:%02d:%02d %s",( ( hour == 0 || hour == 12 ) ? 12 : hour % 12 ), minute, second, ( hour < 12 ? "AM" : "PM" ) ); 
    }
}
public class time {
    public static void main(String[] args) {
        time1 t=new time1();
        System.out.println("Universal time after set time: " + t.toUniversalString());
        System.out.println("Standard time after set time: " + t.toString());
        System.out.println();

        t.setTime(15, 30, 46);
        System.out.println("Universal time after set time: " + t.toUniversalString());
        System.out.println("Standard time after set time: " + t.toString());
        System.out.println();

        System.out.println("After attempting invalid settings: ");
        t.setTime(88, 88, 88);
        System.out.println("Universal time after set time: " + t.toUniversalString());
        System.out.println("Standard time after set time: " + t.toString());
        System.out.println();
    }
    
}
