import java.time.LocalTime;
import java.time.*;
import java.time.temporal.*;

public class AirTrip {
    private LocalTime realFlightTime;
    private LocalTime flightTime;
    private static String flightNumber;
    private static String destination;

    public AirTrip(String destination, String flightNumber, LocalTime flightTime, LocalTime realFlightTime) {
        this.destination =destination;
        this.flightNumber=flightNumber;
        this.flightTime=flightTime;
        this.realFlightTime=realFlightTime;
    }

    public void flightStatus(){
        LocalTime currentTime= LocalTime.now();

        if(flightTime.isBefore(realFlightTime)){
            Long delay = flightTime.until(realFlightTime, ChronoUnit.MINUTES);
            int delayHour = (int) (delay/60);
            int delayMinute = (int) (delay%60);
            System.out.println("Flight number "+flightNumber+" to "+ destination +" has "+delayHour+":"+delayMinute+ " delay");
        }
        else if(realFlightTime.equals(flightTime)){
            System.out.println("Flight number "+flightNumber+" to "+ destination +" is ontime");
        }
        else if(realFlightTime.equals(currentTime)){
            System.out.println("Flight number "+flightNumber+" to "+ destination +" is taking passengers");
        }
        else if(realFlightTime.isBefore(currentTime)){
            System.out.println("Flight number "+flightNumber+" to "+ destination +" has taken off");
        }

    }
    public static void main(String[] args) {
        AirTrip firstFlight = new AirTrip("Tehran","1", LocalTime.of(7,8), LocalTime.of(9,10));
        firstFlight.flightStatus();
    }
}

