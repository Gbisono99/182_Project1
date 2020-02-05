public class Person {
    String firstName;
    String lastName;
    int monthBirth;
    int dayBirth;
    int yearBirth;
    public Person(String firstName, String lastName, int monthBirth, int dayBirth, int yearBirth){
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthBirth = monthBirth;
        this.dayBirth = dayBirth;
        this.yearBirth = yearBirth;
    }
    public Person(){
    }
    public static Person[] condense(Person[] arr){
        int counter = 0;
        for (Person o : arr) {
            if (o != null) {
                counter++;
            }
        }
        Person[] arrayCondensed = new Person[counter];
        for(int i = 0; i < arrayCondensed.length; i++){
            arrayCondensed[i] = arr[i];
        }
        return arrayCondensed;
    }

}
