package CoreJava.Lesson27;

public class Test4 {
    public static void main(String[] args) {
        int [] arr = {1,3,4,5,6,7,8,9};
        System.out.println("arr[11]");

        try{
            System.out.println(arr[11]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("We catch: " + e);
        }
        finally {
            System.out.println("_");
        }

    }
}
