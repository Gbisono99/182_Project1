public class University implements School{
    String universityName;
    String motto;
    Person[] people;
    String[] majors;
    String [] courses;

    /*public Person[] load(Person[] arr){
        Person[] total = new Person[30];
        for(int i = 0; i < arr.length; i++){
            total[i] = arr[i];
        }
        return total;
    }*/ //TODO No clue on why I made this method


    @Override
    public Student findStudent(String fn, String ln) { //TODO Search through array to find Student object
        for(int i = 0; i < people.length; i++){

        }
        return null;
    }

    @Override
    public Faculty findFaculty(String fn, String ln) { //TODO Search through array to find Faculty object
        return null;
    }

    @Override
    public Faculty hire(Person p) { //TODO Add a new Faculty object to Person[]
        return null;
    }

    @Override
    public Student admit(Person p) { //TODO Add a new Student object to Person[]
        return null;
    }

    @Override
    public Person[] getAllPersons() {
        return people;
    }

    @Override
    public String[] getAllMajors() {
        return majors;
    }

    @Override
    public String[] getAllCourses() {
        return courses;
    }

   @Override
    public Person[] getStudents() { //TODO Return only Student object
        Person[] students = new Person[30];
        int counter = 0;
        for(int i = 0; i < people.length; i++){
            if(people[i].getClass() == (Student.class)){
                students[counter] = people[i];
                counter++;
            }
        }
        return (Person[]) Person.condense(students);
    }

    @Override
    public Person[] getFaculty(){ //TODO Return only Faculty object
        Person[] faculty = new Person[30];
        int counter = 0;
        for(int i = 0; i < people.length; i++){
            if(faculty[i].getClass() == (Faculty.class)){
                faculty[counter] = people[i];
                counter++;
            }
        }
        return (Person[]) Person.condense(faculty);
    }

    public University(String universityName, String motto){
        this.universityName = universityName;
        this.motto = motto;
        this.majors = new String[]{"Hardware Architecture", "Information Analytics", "Quantum Computing", "Undecided" };
        this.courses = new String[]{"Computers", "Advance Physics", "Quantum Entanglement", "Parallel Programming", "Advance Algorithms",
                "FPGA Programming", "Hardware Design", "Embedded Systems", "Signal Processing", "Artificial Intelligence", "Bayesian Logic", "Probability"};
        people = new Person[30];

        Person s1 = new Student("Billy","Baston",7,12,1990, "Information Analytics");
        Person s2 = new Student("Carol","Danvers",4,9,1992,"Quantum Computing");
        Person s3 = new Student("Clark","Kent",5,5,1994,"Hardware Architecture");
        Person s4 = new Student("Kara","Zorel",4,13,1989, "Hardware Architecture");
        Person s5 = new Student("Peter", "Parker",6,25,1997,"Quantum Computing");
        Person s6 = new Student("Tony", "Stark",2,2,2004,"Hardware Architecture");
        Person s7 = new Student("Stephen","Strange",12,15,1976,"Quantum Computing");
        Person s8 = new Student("Bruce","Banner",9,9,2000,"Undecided");
        String[] set_courses;
        set_courses = new String[]{"Bayesian Logic", "Artificial Intelligence","Hardware Design"};
        Person f1 = new Faculty("Bruce", "Wayne",9,27,1995,set_courses);
        set_courses = new String[]{"Hardware Design" , "FPGA Programming", "Embedded Systems"};
        Person f2 = new Faculty("Diana","Prince",11,5,2006,set_courses);
        set_courses = new String[]{"Probability","Signal Processing","Advance Algorithms"};
        Person f3 = new Faculty("Barbara","Gordon", 5,23,1980,set_courses);
        set_courses = new String[]{"Signal Processing" , "Embedded Systems", "Parallel Programming"};
        Person f4 = new Faculty("Charles","Xavier",11,5,1966,set_courses);


        people[0] = s1; people[1] = s2; people[2] = s3; people[3] = s4; people[4] = s5; people[5] = s6; people[6] =  s7; people[7] = s8;
        people[8] = f1; people[9] = f2; people[3] = f3; people[4] = f4;
        people = (Person[]) Person.condense(people);


    }
}
