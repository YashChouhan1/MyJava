package OOPs;

public class BasicObjectnClass {
    public static void main(String[] args) {
        Student john = new Student(12,986565446, "melbourne");
        Student smith = new Student(15, 975346566,"sydney");

        System.out.println("john : "+john.rno+" "+john.phoneNum+" "+john.address);
        System.out.println("smith : "+smith.rno+" "+smith.phoneNum+" "+smith.address);
    }
//    static class Student {
//        int rno ;
//        String name;
//        float marks;
//        Student(){
//            this.marks = 89.87f;
//        }
//    }
    static class Student{
        int rno;
        long phoneNum;
        String address;

    public Student(int rno , long phoneNum , String address ) {
        this.rno = rno;
        this.phoneNum = phoneNum;
        this.address = address;
    }
}
}
