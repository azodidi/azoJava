import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int age;
    private String address;

    public Student(String name,
                   int age,
                   String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static void main(String[] args) {
        ArrayList<Student> listEtudiant = new ArrayList<Student>();
        Student etudiant = new Student("Azodidi",59,"39 rue azolé 969693 Bobo");

        Student etudiant1 = new Student("Azopepe",9,"9 rue azola 121288 Lolo");

        Student etudiant2 = new Student("Azodede",25,"15 rue azolo 93221 popo");

        listEtudiant.add(etudiant);
        listEtudiant.add(etudiant1);
        listEtudiant.add(etudiant2);

       System.out.println(listEtudiant.toString());
    }

}
