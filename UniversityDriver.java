import java.util.Scanner;

public class UniversityDriver {
    public static void main(String[] args) {
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        while(flag){
            System.out.println("Enter: Hire, Admit, Find Student, Find Faculty, List Students, List Faculty, Quit");
                String input = sc.nextLine();
                switch(input.toLowerCase()){
                    case "hire":
                        System.out.println("Test1");
                        break;
                    case "admit":
                        break;
                    case "find student":
                        break;
                    case "find faculty":
                        break;
                    case "list students":
                        break;
                    case "list faculty":
                        break;
                    case "quit":
                        flag = false;
                        break;
                    default:
                        System.out.println("Invalid Option");
                        break;
                }
        }
    }
}
