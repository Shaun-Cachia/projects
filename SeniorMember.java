public class SeniorMember extends Member {
    public SeniorMember (int id, String name, String surname, int number) {
        super(id,name,surname,number);
    }
    public String toString () {
        return "Senior Member --- ID : "+id+", Name : "+name+", Surname : "+surname+", Number : "+number;
    }
}