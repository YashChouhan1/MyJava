package OOPs.Inheritence_Polymorphism;

// Program Showing CONSTRUCTOR OVERLOADING
public class Prac_Constructor1 {
    public static void main(String[] args) {
        Student obj1 = new Student();
        Student obj2 = new Student(35 , 'B');
        Student obj3 = new Student(obj1);
        System.out.println("with no parameter in cons. - " + obj1.std_id);
        System.out.println("with parameter in cons. - "+ obj2.std_id);
        System.out.println("with parameter of another obj in cons. - "+ obj3.std_id);

    }
    static class Student {
        int std_id;
        char grades;

        Student(){
            this.std_id = 65;
            this.grades = 'B';
        }
        Student(int id , char rank){
            this.std_id = id;
            this.grades = rank;
        }
        Student(Student obj1){
            this.std_id = obj1.std_id;
            this.grades = obj1.grades;
        }
    }
}
