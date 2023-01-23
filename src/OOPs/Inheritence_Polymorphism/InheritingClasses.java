package OOPs.Inheritence_Polymorphism;

public class InheritingClasses {
    public static void main(String[] args) {
        Human human1 = new Human();
        Indian ind = new Indian();
        Punjabi pun = new Punjabi();
        System.out.println(ind.weight);
        System.out.println(pun.Mustaches);
        System.out.println(pun.height);
    }
}
/* I this program , we learned about inheriting property of classes in java , we made 2 classes
   'Human' which have variable height and weight and the 'Indian' class have colour variable , we made
   program such that indian is a child class of human . so the child class can access all the variable of the
   parent class except private variables :)*/