public class JuniorMember extends Member {
    public JuniorMember (int id, String name, String surname, int number) {
        super(id, name, surname, number);
    }
    public String toString () {
        return "Junior Member --- ID : "+id+", Name : "+name+", Surname : "+surname+", Number : "+number;
    }
}
