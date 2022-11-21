import java.sql.Time;
import java.util.Date;

public class Meeting {

    Date date;
    Time time;
    String name;
    Contact contact;

    public Meeting (Date date, Time time, String name){
        this.date = date;
        this.time = time;
        this.name = name;
    }

    public Meeting (Date date, Time time, String name, Contact contact){
        this.date = date;
        this.time = time;
        this.name = name;
        this.contact = contact;

    }

    public Date getDate() {
        return date;
    }

    public Time getTime() {
        return time;
    }

    public String getName() {
        return name;
    }

    public Contact getContact() {
        return contact;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }
}
