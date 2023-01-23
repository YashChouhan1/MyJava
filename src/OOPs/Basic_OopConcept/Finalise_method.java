package OOPs.Basic_OopConcept;

public class Finalise_method {
    public static void main(String[] args) {
        Finalise_method obj = new Finalise_method();
        obj.finalize();
        obj = null;
        System.gc();
        System.out.println("Inside the main() method");
    }
    protected void finalize()
    {
        System.out.println("Object is destroyed by the Garbage Collector");
    }
}
