package base;

public class Comparer {
    public int num1;
    public int num2;
    public int num3;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }

    public void can_continue(){
        if((num1 == num2) && (num2 == num3))
            System.exit(0);
    }
    public int largest()
    {
        int largest = num1;

        if(num2 > num1 && num2 > num3)
            largest = num2;

        else if(num3 > num1 && num3 > num2)
            largest = num3;

        else
            ;

        return largest;
    }
}
