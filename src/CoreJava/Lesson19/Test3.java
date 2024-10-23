package CoreJava.Lesson19;

public class Test3 {
    public static void main(String[] args) {
        int[] array = {4,2,5,7,1,87,1,4,6,2,15,7,};

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for(int a:array){
            System.out.print(a + " ");
        }
    }

}
