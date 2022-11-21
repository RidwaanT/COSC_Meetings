import java.sql.Time;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
public class Calendar {

    HashMap<Date, SortedSet> day = new HashMap<Date, SortedSet>();

    public Calendar() {

    }

    public void addMeeting(Date date){
        if (day.containsKey(date)){
            day.get(date);
        }

    }



}
