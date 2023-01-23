package OOPs;

public class Static {
    public static void main(String[] args) {
        Fruit mango = new Fruit();
        Fruit orange = new Fruit();

        System.out.println(mango.population);
        System.out.println(orange.population);
    }
    public static class Fruit {
        static int population ;
        Fruit(){
            population += 1;
        }
    }

}
