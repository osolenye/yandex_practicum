package sprint6.date_time;

import java.time.Instant;

public class UnixTime {
    public static void main(String[] args) {
        // time is stored via miliseconds from 1 january 1970 year - unix type of storing time
        // GMT - time based on London's GreenWich district
        // UTC - time based on Atomic Watches and has it's bias based on where you are
        // UTCO = time using UTC without bias(+0 UTC)

        // Instant - standart librarie's class for storing UNIX time and it's storing nanosecond
        // format is YYYY-MM-DD T HOUR:Minute:Second.Millisecond

        // method to get UTCO time
        Instant date = Instant.now();
        System.out.println(date);
        System.out.println(Instant.now());

        // get how many milliseconds have passed:
        System.out.println(Instant.now().toEpochMilli());

        // ofEpoch/Second/Milli is used to know how much time passed from the timestamp to the Unix Epoch
        Instant firstSpaceTravel = Instant.ofEpochSecond(-381872838);
        System.out.println(firstSpaceTravel);

        Instant firstSpaceTravelMilliSeconds = Instant.ofEpochMilli(-381872838000L);
        System.out.println(firstSpaceTravelMilliSeconds);

        // upper and lower limits of dates that can be stored in Instant instance
        System.out.println(Instant.MAX);
        System.out.println(Instant.MIN);

        // instance's date can't be reassigned, but there are methods to change it's value
        // plusSeconds, minusSeconds and milli and nano
        System.out.println(Instant.now());
        System.out.println(Instant.now().plusSeconds(19823982));

        // compare dates
        System.out.println(Instant.now().isAfter(Instant.now().plusSeconds(10)));
        System.out.println(Instant.now().isBefore(Instant.now().plusSeconds(10)));
        System.out.println(Instant.now().equals(Instant.now().plusSeconds(10)));
    }
}
