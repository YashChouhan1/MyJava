package JavaConcepts.Generics;

public class NumberPrinter {
    Integer numberToPrint;
    NumberPrinter(Integer number){
        this.numberToPrint = number;
    }
    void print(){
        System.out.println(numberToPrint);
    }
}
class main1 {
    public static void main(String[] args) {
        NumberPrinter obj = new NumberPrinter(200);
        obj.print();

    }
}
