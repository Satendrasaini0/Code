// files  -

public  class Question {

    // Question:1 Enter 3 number from the user & make a function to print their average ?

//    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        int average = (a+b+c)/3;
//        System.out.print(average);
//    }
//
//}

    // Question: 2 Write a function print the sum of all odd number from 1 to n

//    public static void printsum(int n){
//        int sum =0;
//        for(int i=1;i<=n;i++)
//        {
//            if (i%2!=0)
//            {
//               sum=sum +i;
//            }
//        }
//        System.out.println(sum);
//    }
//    public static void main (String args[])
//    {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//       printsum(n);
//    }
//}


    //Question: 3 Write a function which take in 2 number and returns the greater of those two

//    public static int greaternumber(int a, int b) {
//        if (a > b) {
//            return a;
//        } else {
//            return b;
//        }
//    }
//
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        System.out.println(greaternumber(a, b));
//
//    }
//}


    // Question: 4 Write a function that takes in the radius as input and return the circumference of a circle

//   public static  double  getcircle( double radius)
//   {
//    return 2*3.14*radius;
//   }
//   public static void main(String args[]){
//       Scanner sc= new Scanner(System.in);
//       double  r= sc.nextDouble();
//       System.out.println(getcircle(r));
//   }
//}


    // Question:5 Write a function that takes in age as input and return if that person is eligible to vote or not .A person of age >18 is eligible to vote

//  public static boolean vote(int age)
//  {
//   if(age >18){
//       return true ;
//   }
//   else {
//       return false;
//   }
//  }
//  public static void main( String args[]){
//      Scanner sc= new Scanner(System.in);
//      int age = sc.nextInt();
//      System.out.println(vote(age));
//  }
//}


    //Question:6 Write an infinite loop using do while condition.

//    public static void main(String args[]) {
//        do
//        {
//            System.out.print("This is infinite loop");
//
//        }
//        while (true);
//
//    }
//}


    //Question:7 Write a program to enter the number till the user want and at the end it should display the count of positive, negative and zero entered

//     public static void main(String args[]){
//      System.out.println("Press 1 to continue & 0 to stop");
//      Scanner  sc= new Scanner(System.in);
//      int positive=0;
//      int negative=0;
//      int zero=0;
//      int input=sc.nextInt();
//      while(input==1){
//          System.out.print("Enter your number:");
//          int number=sc.nextInt();
//          if(number>0){
//              positive++;
//          }
//          else if(number<0){
//              negative++;
//          }
//          else{
//              zero++;
//          }
//          System.out.println("Pres 1 to continue & 0 to stop");
//          input = sc.nextInt();
//
//         }
//          System.out.println("Positive:" +positive);
//          System.out.println("Negative:" + negative);
//          System.out.println("zero:" + zero);
//     }
//}

    //Question:8 Two number are entered by the user , x and n. write a function to find the value of one number raised to the power of another ..i.e.x^n.

//       public static void main(String args[]){
//       Scanner sc=new Scanner(System.in);
//       System.out.print("Enter a value of x:");
//       int x = sc.nextInt();
//       System.out.print("Enter a value of n");
//       int n = sc .nextInt();
//       int result=1;
//       for(int i=0; i<n; i++){
//           result=result*x;
//       }
//       System.out.println("Total value of the number:"+result);
//       }
//}

    //Question:9 Write a function that calculates the greatest common divisor of 2 number .

//     public static void main(String agrs[]){
//         Scanner sc = new Scanner (System.in);
//         System.out.print("Enter a number of n1:");
//         int n1= sc.nextInt();
//         System.out.print("Enter a number of n2: ");
//         int n2 = sc.nextInt();
//         while(n1!=n2){
//             if(n1>n2){
//                 n1=n1-n2;
//             }
//             else{
//                 n2=n2-n1;
//             }
//         }
//            System.out.println(n2);
//
//         }
//     }


    // Question:10 Write a print Fibonacci Series of n term where n is input by user: 0 1 1 2 3 5 8 13 21
    
//    public static void main(String agrs[]) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int a = 0;
//        int b = 1;
//        System.out.println(a+"");
//        if (n > 1)
//        {
//            for (int i=2; i<=n; i++)
//            {
//                System.out.println(b + "");
//                int temp = b;
//                b = a + b;
//                a = temp;
//            }
//            System.out.println();
//        }
//    }
//}

      //Question: given a temperature F in Farhrenheit, your task is to convert it into celsius using the following equation :
     // T(c) = (T(f)-32)*5/9
 //    static void farhrenheitToCelsius(int farhrenheit)
//    {
//         int celsius = (farhrenheit-32)*5/9;
//         System.out.println(celsius);
//    }
}

    // Question: Some Data type are given below :-
   //  Integer
   // Long
   // float
   // Double
   // char
  //  your task is to take input in the given format and print them in the same order.

//  class Main{
//     public static void main (String[] arg){
//       Scanner sc = new Scanner(System.in);
//       int a = sc.nextInt();
//       long b = sc.nextLong();
//       float c = sc.nextFloat();
//       double d = sc.nextDouble();
//       char e = sc.next().charAt(0);
//       System.out.println(a);
//       System.out.println(b);
//       System.out.printf("%.2f",c);
//       System.out.println();
//       System.out.printf("%.4f",d);
//       System.out.println();
//       System.out.println(e);
//     }
//}

//    // System.out.print("------typecasting-----");
//
//    class Main {
//    public static void main(String[] arg) {
//        Scanner sc = new Scanner(System.in);
//        int a = 12;
//        long longValue = a;
//        System.out.println("The value of long:" + longValue);
//
//        float f1 = 12.3f;
//        System.out.println(f1);
//        double doubleValue = f1;
//        System.out.println(doubleValue);
//
//        f1 = a;
//        System.out.println("The value of f1:" + f1);
//        //automatic conversion from lower ranger to higher range Data type;
//
//        a = (int)f1;
//        System.out.println("The value of int:" + a);
//        longValue = (long) doubleValue;
//        System.out.println(longValue);
//    }
//}

// Question: you must be familiar with various type of operators.
// one of the most commonly used operators in other language is increment and decrement operators given two number x and y.
// your task is to print the value of x decrement by 1 and value of y after increment it by 1
//class Main {
//    public static void main (String [] args){
//        Scanner  sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        int y = sc.nextInt();
//        x=x-1; // x--
//        y=y+1; // y++ // y=y+1
//        System.out.println(x+" "+y);
//    }
//}


    public static void main(String[] args) {
        int n = 4;
        int m = 5;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}




