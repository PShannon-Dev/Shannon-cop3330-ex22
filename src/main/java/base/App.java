package base;

import java.util.Scanner;

public class App {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        //instances
        App myApp = new App();
        Comparer myComparer = new Comparer();

        //input
        myApp.input(myComparer);

        //output
        myApp.output(myComparer);
    }
    public void input(Comparer instance)
    {
        //input numbers 1-3
        System.out.print("Enter the first number: ");
        instance.setNum1(in.nextInt());
        System.out.print("Enter the second number: ");
        instance.setNum2(in.nextInt());
        System.out.print("Enter the third number: ");
        instance.setNum3(in.nextInt());
    }

    public void output(Comparer instance)
    {
        instance.can_continue();
        System.out.println("The largest number is " + instance.largest());
    }
}
