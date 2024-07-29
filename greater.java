import java.util.Scanner;

/**
 * greater
 */
public class greater {

    public static void GreaterNo(int a, int b){

        if ( a > b){
            System.out.println("a is greater than b");
        } else if ( a < b ) {
            System.out.println("a is lower than b");
        } else {
            System.out.println("a is equal to b");
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a value = ");int a = sc.nextInt();
        
        System.out.print("Enter b value = ");int b = sc.nextInt();

        GreaterNo(a, b);
    }
}