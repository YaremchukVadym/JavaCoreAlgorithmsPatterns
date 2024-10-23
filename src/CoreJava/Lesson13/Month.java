package CoreJava.Lesson13;

public class Month {
    public static void main(String[] args) {
        Month.mouthOfNumber(4);
    }
    static void mouthOfNumber(int number) {
        switch (number) {
            case 1:
                System.out.println("January 1-31");
                break;
            case 2:
                System.out.println("February 1-28");
                break;
            case 3:
                System.out.println("March 1-29");
                break;
            case 4:
                System.out.println("April 1-28");
                break;
            case 5:
                System.out.println("May 1-29");
                break;
            case 6:
                System.out.println("June 1-28");
                break;
            case 7:
                System.out.println("July 1-29");
                break;
            case 8:
                System.out.println("August 1-28");
                break;
            case 9:
                System.out.println("September 1-29");
                break;
            case 10:
                System.out.println("October 1-28");
                break;
            case 11:
                System.out.println("November 1-28");
                break;
            case 12:
                System.out.println("December 1-28");
                break;


        }
    }
}
