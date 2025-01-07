import java.util.*;
public class function {
//    public static void printMyName(String name){
//        System.out.println(name);
//        return;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String name = sc.next();
//
//        printMyName(name);
//    }
//}

//   public static int CalculateSum( int a, int b)
//   {
//       int sum= a+b;
//       return sum;
//   }
//   public static void main(String args[]){
//       Scanner sc =new Scanner(System.in);
//       int a = sc.nextInt();
//       int b =  sc.nextInt();
//       int sum = CalculateSum(a,b);
//       System.out.println("Sum of 2 number is :" + sum);
//   }
//}

//    public static int calculateProduct(int a, int b)
//    {
//        //int product = a*b;
//       // return product;
//        return a*b; /// we write both method
//    }
//
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//       // int product = calculateProduct(a,b);
//        System.out.println("Sum of 2 product :" + calculateProduct(a,b));
//
//
//    }
//}


    public static void printFactorial(int n) {
        int factorial = 1;
        if (n<=0)
        {
            System.out.print("Invalid Number");
            return;
        }
        //
        for (int i = n; i >= 1; i--)
            factorial = factorial * i;
        System.out.print(factorial);
        return;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printFactorial(n);

    }
}


