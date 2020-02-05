import java.util.Arrays;

public class Test {


    public static void main(String[] args) {
        University uni = new University("Elvis", "UwU");
        System.out.println(Arrays.toString(uni.people));
        System.out.println(Arrays.toString(uni.getStudents()));
    }
}
