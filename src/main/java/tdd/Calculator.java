package tdd;

public class Calculator {
public int add(int a,int b){
return a + b;
}
public int subtract(int a,int b){return a - b;}
public int multiply(int a, int b){return a * b;}
public int divide(int a, int b){return a / b;}

    public int add(String numbers){
    int sum = 0;

    for (String num : numbers.split(",")){
        sum += Integer.parseInt(num);
    }
    return sum;
    }
    public int add(int[] arrayNumbers){
        int sum = 0;

        for (int num : arrayNumbers){
            sum += num;
        }
        return sum;
    }
}