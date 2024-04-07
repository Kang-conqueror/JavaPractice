import java.time.LocalDate;

public class WeatherOfDay {

    public LocalDate day = LocalDate.of(2024, 4, 7);

    public String info;

    public int maxTemp;
    public int minTemp;
    public String windDirection;
    public int windForce;


    public void printValue(){

        System.out.println(day);
        System.out.println(info);
        System.out.println(maxTemp);
        System.out.println(minTemp);
        System.out.println(windDirection);
        System.out.println(windForce);

    }







}
