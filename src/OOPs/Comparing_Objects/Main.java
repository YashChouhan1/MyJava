package OOPs.Comparing_Objects;

public class Main{
    public static void main(String[] args) {
        Student vaibhav = new Student(25, 99.90f);
        Student vishal = new Student(21, 93.98f);

        if (vaibhav.compareTo(vishal) < 0) {
            System.out.println(vaibhav.compareTo(vishal));
            System.out.println("Vishal has More Marks");
        }
        else
            System.out.println(vaibhav.compareTo(vishal));
            System.out.println("Vaibhav has more Marks");
    }
}
