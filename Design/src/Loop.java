import java.util.Scanner;
public class Loop {
    public static void main(String[] args) {
        //Pattern 1
        //  * * * * *
        //  * * * * *
        //  * * * * *
        //  * * * * *

    /*    for (int i = 1; i<=4; i++) {
            for (int j = 1; j<=5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("----------------------------------------");
    }
}*/


//Pattern 2
        //   *
        //   * *
        //   * * *
        //   * * * *

        //1st row->1 star -> 3 spaces
        //2nd row ->2 star -> 2 spaces  and so on


     /*   for (int i = 1; i<=4; i++) {
            for (int j = 1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------");
    }
} */


        //Pattern 3
        //            *
        //          * *
        //        * * *
        //      * * * *
        //    * * * * *


        //1st row has 3 spaces followed by 1 * ,
        // 2nd row has 2 spaces followed by 2 *
        //n lines ;spaces = n - line Number  ; *=line Number


     /*   for (int i=1; i<=4; i++)
        {
            //spaces , row number i, total spaces for ith row = 4-i

            for ( int j=1; j<=4-i; j++)
            {
                System.out.print("  "); //2space
            }
            for ( int j=1; j<=i; j++)//i time;
            {
                System.out.print(" *");// space follow by *
            }
                System.out.println();
        }
        System.out.println("---------------------------------");
    }
} */

        //Dynamic method
/*      System.out.print("Enter n:");
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j<=n-i; j++)
            {
                System.out.print("  ");
            }
            for (int j = 1; j<=i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println("-------------------------------");
    }
}*/


        //Pattern 4
        //    1
        //    1 2
        //    1 2 3
        //    1 2 3 4
        //    1 2 3 4 5
        //    1 2 3 4 5 6

  /*      for (int i=1; i<=6; i++) //total number of rows
           {
             //i=2
            for (int j=1; j<=i; j++)//j= 1 2
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------");
    }
}*/


        //Pattern 5
        //       1 2 3 4 5 6
        //       1 2 3 4 5
        //       1 2 3 4
        //       1 2 3
        //       1 2
        //       1


        // line 1   1 to 5   n-0
        //i=0  5-0 = 5    1 2 3 4 5
        //i=1  5-1 = 4    1 2 3 4

 /*       for (int i = 0; i<=6; i++) //0 <6  , 0 1 2 3 4 5
        {
            for (int j = 1; j <=6-i; j++) //6-1= 5   1 2 3 4 5
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------");
    }
}*/


        //Pattern 6 - Floyd's Triangle
//        1
//        2 3
//        4 5 6
//        7 8 9 10
//        11 12 13 14 15
//        16 17 18 19 20 21

 /*       int value=1;
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print( value++ +" " );
                //value = value + 1; //value++;
            }
            System.out.println();
        }
    }
}*/


        //Pattern 7 - Butterfly pattern

//        *                          *
//        * *                      * *
//        * * *                  * * *
//        * * * *              * * * *
//        * * * * *          * * * * *
//        * * * * * *      * * * * * *
//        * * * * * * *  * * * * * * *
//        * * * * * *      * * * * * *
//        * * * * *          * * * * *
//        * * * *              * * * *
//        * * *                  * * *
//        * *                      * *
//        *                          *


/*       Scanner sc = new Scanner(System.in);
         int n;
         n = sc.nextInt();

         // This is upper half of pattern:
        //divided into 3 parts , part1 is * on LHS  part2 is space and part3 is * on RHS
        //for n=5 , we have total 2n columns.
        //for i=1 part1 has i * , followed by part 2 = 2n - 2i spaces and part 3 has i *


        //for upper half of the pattern:
         for (int i = 1; i <n; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("* ");
            }
            int  space = 2*n-(2*i);
            for(int k=1; k<=space; k++)
            {
                System.out.print("  ");// 2 space
            }
            for(int j=1; j<=i; j++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }

        //for lower half of pattern
        for(int i=0; i<n; i++)
        {
//           i=0     1st -- 5  5             n-i 5-0=5
//           i=1    2nd line -- 4 space 4   n-i 5-1=4
            for(int j=1; j<=n-i; j++)
            {
                System.out.print("* ");
            }
            int space= 2*n-(2*(n-i));//n=5 col=10
            //2*5=10 -2(5-0)
            //10- 10
            for(int k=1; k<=space;k++)
            {
                System.out.print("  ");
            }
            for(int j=1; j<=n-i; j++)
            {
                 System.out.print(" *");
            }
            System.out.println();
        }

    }
}*/

//Pattern 8  - Palindromic Pattern
//* n=5 cols= 2*n-1
//               1
//             2 1 2
//           3 2 1 2 3
//         4 3 2 1 2 3 4
//       5 4 3 2 1 2 3 4 5
//     6 5 4 3 2 1 2 3 4 5 6


        //for n rows, cols : 2*n-1
        //spaces = 2*n-1 - 1 , 2*n-1 - 3, 2*n-1 -5 ..increment of 2

/*      int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int k = 1;//numbers in every row, 1 3 5 7 9...
            //k+=2; //k=k+2;
        for (int i=1; i<=n; i++)
        {
            int space = (2*n-1)-k;
            for (int j=1; j<=space/2; j++)
            {
                System.out.print("  ");
            }
            for (int l=i; l>=1; l--)
            {
                System.out.print(l+" ");
            }
            for( int l=2;l<=i;l++)
            {
                System.out.print(l+" ");
            }
            System.out.println();
            k+=2;
        }
    }
}*/


        //Pattern 9
//        4 4 4 4 3 3 3 3 2 2 2 2 1 1 1 1
//        4 4 4 3 3 3 2 2 2 1 1 1
//        4 4 3 3 2 2 1 1
//        4 3 2 1


/*      int k;
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i=n; i>0; i--)// row number in reverse   // n time  n=4 4 3 2 1
        {
            for (int j=n; j>0; j--)// what number to print in ith row  // n n-1 n-2 n-3 ...1
            {
                for (k =0;k<i; k++)//how many time to print a number ---> i time
                {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}*/


        //While Loop
/*      int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int i=1;
        while (i<=n)
        {
            System.out.print( i+" ");
            i++;
        }

    }
}*/


/*      System.out.println("Enter the value of total test case ");
        Scanner sc=new Scanner(System.in);
        int t =sc.nextInt();
        while (t > 0) {
            System.out.println("Enter a first value");
            int a =sc.nextInt();
            System.out.println("Enter a second value");
            int b =sc.nextInt();
            int sum = a + b;
            System.out.println( "The sum is :" +sum);
            t--;
        }
    }
}*/


        //do while loop
/*      System.out.println( "Enter the value");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int i;
        i=0;
       do
       {
           System.out.print(i+" ");
           i++;
       }
         while(i<=n);
    }
}*/


//    //Why use do-while?
//        A do-while loop is used where your loop should execute at least one time.
//        For example, let’s say you want to take an integer input from the user until the user has entered a positive number.
//        In this case, we will use a do-while as we have to run the loop at-least once.
//        The loop takes an initial input, and it will continue running until the user enters a positive number.
//

/*        Scanner sc = new Scanner(System.in);
        int i;
        do {
            System.out.println("Enter  a positive number");
            i= sc.nextInt();
        } while(i>0);
    }
}*/
        // question:
        // removing all vowel (a e i o u)

/*        Scanner s = new Scanner(System.in);
        String l = s.nextLine();
        for (int i = 0; i < l.length(); i++) {
         //   char c=l.charAt(i);
         //   if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
            if (l.charAt(i) == 'a' || l.charAt(i) == 'e' || l.charAt(i) == 'i' || l.charAt(i) == 'o' || l.charAt(i) == 'u')
            {
                continue ;
            }
            System.out.print(l.charAt(i));
        }
    }
}*/

//       question:
//       Take an integer as input and print it.

/*        Scanner s = new Scanner(System.in);
        int variable = s.nextInt();
        System.out.print(variable);
    }
}*/


        // switch case
        //switch(true) or switch(a>b) both are not allowed

/*       Scanner sc = new Scanner(System.in);
        String month = "Jan";
        switch (month)
        {
            case "Jan":
                System.out.println("January");
                break;
            case "Feb":
                System.out.println("February");
                break;
            default:
                System.out.println("Invalid Name");
                break;
        }
    }
}*/

/*       int day = 2; //char, byte, short int, int,enum,string
        switch (day) {  //if -else if --else
            case 1:  //if( day==1)
                System.out.println("Monday");
                break;
            case 2://else if (day==2)
                System.out.println("Tuesday");
                //break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println(" Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid data");
                break;
        }
    }
}*/


//char x="a"
//        Switch(x){
//            case 'a':
//                System.out.println("case1");
//                break;
//        }


        //question:
        //Given the number of the month, your task to calculate the number of days present in the particular month.
        //* consider non-leap year.
        // Months Name

/*        int  M =0;
        switch (M)
        {
            case 1:

            case 3:

            case 5:

            case 7:

            case 8:

            case 10:

            case 12:
                System.out.print(31);
                break;

            case 4:

            case 6:

            case 9:

            case 11:
                System.out.print(30);
                break;

            case 2:
               // if (((year % 4 ==0 && !(year % 100 ==0)) || (year % 400 == 0))
                System.out.print(28);
                break;


            default:
                System.out.print(0);
                break;

        }
    }
}*/

        // OR

//        int M=13;
//        switch (M) {
//            case 2:
//                System.out.print(28);
//                break;
//
//            case 4:
//
//            case 6:
//
//            case 9:
//
//            case 11:
//                System.out.print(30);
//                break;
//
//            default:
//                System.out.print(31);
//
//
//        }
//    }
//}


        //question
        // using if else condition to solved to question

/*        Scanner sc= new Scanner(System.in);
        int M= sc.nextInt();
        if (M == 4 || M == 6 || M == 9 || M == 11)
        {
            System.out.println(30);
        }
          else if  (M == 2) {
            System.out.println(28);
        }
          else {
            System.out.println(31);
        }
    }
}*/


        //question:
        // Write a program to check whether a number is even or odd using switch case

/*      Scanner sc = new Scanner(System.in);
        System.out.print("Enter as value: ");
        int N = sc.nextInt();
        String R = N%2==0 ? "Even" : "odd";  // ternary operator
        System.out.print(R);
    }
}*/

        // OR (using switch case)

/*       Scanner sc= new Scanner(System.in);
       System.out.println("Enter a value: ");
       int N= sc.nextInt();
        switch (N%2)
        {
            case 0:
                System.out.println("even");
                break;
            case 1:
                System.out.println("odd");
                break;
            default:
                System.out.println("Invalid number");
                break;
        }
    }
}*/


        //question:
        /*Given  a positive integer number N. your task is to generate all the positive binary number of N digits.
        These binary number should be in ascending order */

/*        System.out.println("Enter a value");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //left shift << a<<b. a*2^b
        //i=2^n-1 to i<2^n
        // i=1<<(n-1) to  i<(less)  1<<n (left shift)
        //i=1<<(n-1) --> 1*2^n-1 --> 2^n-1
        // 1<<n --> 1*2^n
        //for(i=2^n-1; i<2^n; i++)
        for (int i = (1 << (n - 1)); i < (1 << n); i++) {
            System.out.println(Integer.toBinaryString(i));
        }
    }
}*/


        //question: or counting 
        /* Give two string A and B which are binary representation of integer the task is to possible value of X
         that satisfies the condition A OR X = B length of both A and B is same .
         The first line contains the string A.
         The next line contains the string B.
         |A|=|B|
         1<=|A|<=30
         */

/*      Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        int x = conversion(a, b);
        System.out.println(x);
        // A | X = B   or A and B are of equal length
    }
    static int conversion( String a, String b)
    {
//        int a = Integer.parseInt("123");//default as "123" in decimal Number
//        a=123
//
//        String s = "101"-- BinaryNumber. -> decimal Number 5
//        int b=Integer.parseInt(s,2);
//        b=5
//
//        read octal number  67.--decimal Number
//        String s= "67";
//        int b = Integer.parseInt(s,8);


        int c = Integer.parseInt(b,2);//101 - c=5
        int d = Integer.parseInt(a,2);//110 - d=6
        // A |X = B. X = 1 to B
        // 5 | 6 =7   //1 to 7 tk loop
        //101
        //110
        //111

        int count =0;
        for(int i=1; i<=c; i++) // x: 1 to B   or   // 1 to Math.max(A,B)
        {
            if((d|i)==c)
            {
                count= count +1;
            }
        }
        return count;
    }
}*/


//    question:
/*      Given a natural number N. your task is to print all the digits of
        the number in english words. the word have to separate by space and
        in lowercase english latter */

//
//        static void Print_Digits( int N)
//        {
//            String s = String.valueOf(N);
//            System.out.print(s);
//            for (int i = 0; i < s.length(); i++)
//            {
//                char ch = s.charAt(i);
//                if (ch == ('0'))
//                    System.out.print("zero");
//                else if (ch == ('1'))
//                    //    (ch.equals("1")) when char are compere to string then apply this methods
//                    System.out.print("one");
//                else if (ch == ('2'))
//                    System.out.print("two");
//                else if (ch == ('3'))
//                    System.out.print("three");
//                else if (ch == ('4'))
//                    System.out.print("four");
//                else if (ch == ('5'))
//                    System.out.print("five");
//                else if (ch == ('6'))
//                    System.out.print("six");
//                else if (ch == ('7'))
//                    System.out.print("seven");
//                else if (ch == ('8'))
//                    System.out.print("eight");
//                else if (ch == ('9'))
//                    System.out.print("nine");
//
//
//            }
//        }
//    }
//}











