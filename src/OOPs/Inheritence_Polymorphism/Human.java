package OOPs.Inheritence_Polymorphism;

 public class Human {
    int height ;
    int weight ;

    Human(){
        this.height = 180;
        this.weight = 70;
    }
}
 class Indian extends Human{
     String colour ;
     Indian(){
         super();
         this.colour = " dark cream";
     }
}

 class Punjabi extends Indian{
     String Mustaches;

     Punjabi(){
         super();
         this.Mustaches = "long & black";
     }
 }