import java.util.*;

public class Main_Class {
    static ArrayList<Member>m = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    

    
    public static void main(String args[]) {
        boolean exit = false;
        int choice;

        do {
            System.out.println("------Menu------");
            System.out.println("1. Add Senior Member");
            System.out.println("2. Add Junior Member");
            System.out.println("3. Display Senior Members");
            System.out.println("4. Display Junior Members");
            System.out.println("5. Edit Senior Member");
            System.out.println("6. Edit Junior Member");
            System.out.println("7. Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1 :
                break;
                case 2 :
                break;
                case 3 :
                break;
                case 4 :
                break;
                case 5 :
                break;
                case 6 :
                break;
                case 7 :
                exit = true;
                break;
                default :
                System.out.println("Invalid Entry");
                break;
            }
        }while(!exit);
    }
}