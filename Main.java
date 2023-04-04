public class Main {

    public static void main(String[] args) {
        Professor prof = new Professor("Karademir ");
        Student student1 = new Student("Erto ");
        Student student2 = new Student("Mbappe ");

        prof.teach();
        student1.listen();
        student1.takeNotes();
        student2.listen();
        student2.takeNotes();
    }
}

    