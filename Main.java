import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Valerii Andriushchenko";
        student1.Rok = 1000;
        Student student2 = new Student();
        student2.name = "Bohdan Savchenko";
        student2.Rok = 1999;
        System.out.println("Student 1 imie: " + student1.name);
        System.out.println("Student 2 imie: " + student2.name);
        System.out.println("Student 1 Rok: " + student1.Rok);
        System.out.println("Student 2 Rok: " + student2.Rok);
        printStaticHello();
        SecretStudent secretStudent = new SecretStudent();
        System.out.println("Imie Sekretnego studena: " + secretStudent.OtkrycImie());
        Scanner button = new Scanner(System.in);
        String n = button.nextLine();
        secretStudent.Podajimie(n);
        System.out.println("Imie Sekretnego studena: " + secretStudent.OtkrycImie());
    }
    public static void printStaticHello() {
        System.out.println("hello");
    }
    public void printHello() {
        System.out.println("hello");
    }
}
