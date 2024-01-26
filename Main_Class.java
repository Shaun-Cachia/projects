import java.util.*;

public class Main_Class {
    static ArrayList<Member>m = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    
    private static void addSeniorMember() {
        int id;
        String name;
        String surname;
        int number;
        boolean unique;

        System.out.println("\f");
        System.out.println("Enter Id of Senior Member : ");
        do {
            unique = true;
            id = sc.nextInt();
            for (int i = 0; i < m.size(); i ++) {
                if (id == m.get(i).getId()) {
                    unique  = false;
                    System.out.println("Id already exists! \nRe-Input Id : ");
                    break;
                }
            }

        }while(!unique);
        
        System.out.println("Enter name of Senior Member : ");
        name = sc.next();
        System.out.println("Enter surname of Senior Member : ");
        surname = sc.next();
        System.out.println("Enter number of Senior Member : ");
        number = sc.nextInt();

        m.add(new SeniorMember(id, name, surname, number));
    }
    private static void addJuniorMember() {
        int id;
        String name;
        String surname;
        int number;
        boolean unique;

        System.out.println("\f");
        System.out.println("Enter Id of Junior Member : ");
        do {
            unique = true;
            id = sc.nextInt();
            for (int i = 0; i < m.size(); i ++) {
                if (id == m.get(i).getId()) {
                    unique  = false;
                    System.out.println("Id already exists! \nRe-Input Id : ");
                    break;
                }
            }

        }while(!unique);
        
        System.out.println("Enter name of Junior Member : ");
        name = sc.next();
        System.out.println("Enter surname of Junior Member : ");
        surname = sc.next();
        System.out.println("Enter number of Junior Member : ");
        number = sc.nextInt();

        m.add(new JuniorMember(id, name, surname, number));
    }
    public static void displaySenior() {
        for (Member a : m) {
            if (a instanceof SeniorMember) {
                System.out.println(a);
            }
        }
    }
    public static void displayJunior () {
        for (Member a : m) {
            if (a instanceof JuniorMember) {
                System.out.println(a);
            }
        }
    }
    public static void editJunior () {
        boolean exit = false;
        int choice;
        String tempName;
        String tempSurname;
        int tempNumber;
        int id;
        int pos = 0;
        boolean found;

        displayJunior();
        System.out.println("Enter ID of Junior to change : ");
        do {
            found = false;
            id = sc.nextInt();
            for (int i = 0; i < m.size();i++) {
                if (id == m.get(i).getId()) {
                    found = true;
                    System.out.println("ID found!");
                    pos = i;
                    break;
                }
            }
            if (found == false) {
                System.out.println("ID not found! \nRe-Input ID : ");
            }
        }while(!found);        
        do {
              System.out.println("\f");
              System.out.println("1. Change Name");
              System.out.println("2. Change Surname");
              System.out.println("3. Change Number");
              System.out.println("4. Exit");
              choice = sc.nextInt();
              switch (choice) {
                case 1 :
                System.out.println("\f Enter new name : ");
                tempName = sc.next();
                m.get(pos).setName(tempName);
                break;
                case 2 :
                System.out.println("\f Enter new Surname :");
                tempSurname = sc.next();
                m.get(pos).setSurname(tempSurname);
                break;
                case 3 :
                System.out.println("\f Enter new number : ");
                tempNumber = sc.nextInt();
                m.get(pos).setNumber(tempNumber);
                break;
                case 4 :
                exit = true;
                break;
                default :
                System.out.println("Invalid Entry");
              }
        }while (!exit);
    }
    public static void editSenior () {
        boolean exit = false;
        int choice;
        String tempName;
        String tempSurname;
        int tempNumber;
        int id;
        int pos = 0;
        boolean found;

        displaySenior();
        System.out.println("Enter ID of senior to change : ");
        do {
            found = false;
            id = sc.nextInt();
            for (int i = 0; i < m.size();i++) {
                if (id == m.get(i).getId()) {
                    found = true;
                    System.out.println("ID found!");
                    pos = i;
                    break;
                }
            }
            if (found == false) {
                System.out.println("ID not found! \nRe-Input ID : ");
            }
        }while(!found);        
        do {
              System.out.println("\f");
              System.out.println("1. Change Name");
              System.out.println("2. Change Surname");
              System.out.println("3. Change Number");
              System.out.println("4. Exit");
              choice = sc.nextInt();
              switch (choice) {
                case 1 :
                System.out.println("\f Enter new name : ");
                tempName = sc.next();
                m.get(pos).setName(tempName);
                break;
                case 2 :
                System.out.println("\f Enter new Surname :");
                tempSurname = sc.next();
                m.get(pos).setSurname(tempSurname);
                break;
                case 3 :
                System.out.println("\f Enter new number : ");
                tempNumber = sc.nextInt();
                m.get(pos).setNumber(tempNumber);
                break;
                case 4 :
                exit = true;
                break;
                default :
                System.out.println("Invalid Entry");
              }
        }while (!exit);
    }
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
                addSeniorMember();
                break;
                case 2 :
                addJuniorMember();
                break;
                case 3 :
                displaySenior();
                break;
                case 4 :
                displayJunior();
                break;
                case 5 :
                editSenior();
                break;
                case 6 :
                editJunior();
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