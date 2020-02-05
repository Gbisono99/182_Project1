import java.util.Arrays;

public class Faculty extends Person {
    String[] courses;

    public Faculty(String firstName, String lastName, int monthBirth, int dayBirth, int yearBirth, String[] courses ){
        super(firstName, lastName, monthBirth, dayBirth, yearBirth);
        this.courses = courses;
    }
    public String toString(){
        return this.firstName +" "+ this.lastName +" "+ this.monthBirth +" "+ this.dayBirth +" "+ this.yearBirth +" "+ Arrays.toString(this.courses);
    }

}
