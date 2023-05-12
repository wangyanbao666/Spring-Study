package BeanInstantiation;

public class StarFactory {
    public static Star getStar(){
        System.out.println("creating star");
        return new Star();
    }
}
