package calculator;
import java.lang.Float;
import java.util.ArrayList;

public class Prog {
    private float currentvalue;
    private int index = 0;
    private static float memval;

    public Prog(){}

    public float evaluate (String expression){
        float num1;
        float num2;
        String op = "+,-,/,*";
        String operator;
        String[] exp = expression.split("");

        if (expression.charAt(0) == '+'){
            operator = exp[0];
            num2 = Float.parseFloat(exp[1]);

            currentvalue = memval+num2;
            index=index+1;
            return currentvalue;
        }


        else if (expression.charAt(0)=='-'){
            operator = exp[0];
            num2=Float.parseFloat(exp[1]);
            currentvalue=memval-num2;

            index=index+1;
            return currentvalue;
        }

        else if (expression.charAt(0)=='*'){
            operator = exp[0];
            num2=Float.parseFloat(exp[1]);
            currentvalue=memval*num2;

            index=index+1;
            return currentvalue;
        }


        else if (expression.charAt(0)=='/'){
            operator = exp[0];
            num2=Float.parseFloat(exp[1]);
            currentvalue=memval/num2;

            index=index+1;
            return currentvalue;
        }


        else  {
            num1 = Float.parseFloat(exp[0]);
            operator = exp[1];
            num2 = Float.parseFloat(exp[2]);

        }

        if (op.contains(operator)) {
            if (operator.equals("+")) {
                currentvalue = num1 + num2;
                return currentvalue;



            } else if (operator.equals("-")) {
                currentvalue = num1 - num2;
               return currentvalue;



            } else if (operator.equals("*")) {
                currentvalue = num1 * num2;
                return currentvalue;


            } else if (operator.equals("/")) {
                currentvalue = num1 / num2;
               return currentvalue;



            } else {
                return 0;
            }










    }


        if (expression.charAt(2)==0){
            return Float.MIN_VALUE;
        }
        else{return 0;}









    }}







        //x1 = input.nextDouble();
        //x2 = input.nextDouble(); // waits for next number




