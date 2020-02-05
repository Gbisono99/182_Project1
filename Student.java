public class Student extends Person {
    String major;

    public Student(String firstName, String lastName, int monthBirth, int dayBirth, int yearBirth, String major){
        super(firstName, lastName, monthBirth, dayBirth, yearBirth);
        this.major = major;
    }
    @Override
    public String toString(){
        return this.firstName +" "+  this.lastName +" "+ this.monthBirth +" "+ this.dayBirth +" "+ this.yearBirth +" "+ this.major;
    }
}
