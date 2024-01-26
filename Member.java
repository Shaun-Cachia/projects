public class Member {
    protected int id;
    protected String name;
    protected String surname;
    protected int number;

    /**
     * @param id
     * @param name
     * @param surname
     * @param number
     */
    public Member (int id, String name, String surname, int number) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.number = number;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public int getNumber() {
        return number;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name= name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public String toString() {
        return "ID : "+id+", Name : "+name+", Surname : "+surname+", Number : "+number;
    }
}