public class Student    {

    public String name;

    public Student(String name){
        this.name=name;
    }
    public void listen() {
        System.out.println(name + "is listening");
    }
    public void takeNotes(){
        System.out.println( name + " is taking Notes");
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
