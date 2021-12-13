package calculator;
import java.lang.Float;


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

                setMemoryValue(currentvalue);



            } else if (operator.equals("-")) {
                currentvalue = num1 - num2;

               setMemoryValue(currentvalue);



            } else if (operator.equals("*")) {
                currentvalue = num1 * num2;

                setMemoryValue(currentvalue);


            } else if (operator.equals("/")) {
                currentvalue = num1 / num2;

               setMemoryValue(currentvalue);



            } else {
                return 0;
            } return currentvalue;










    }


        if (expression.charAt(2)==0){
            return Float.MIN_VALUE;
        }
        else{return 0;}









    }

    public float getCurrentValue(){
        return currentvalue;
    }

    public float getMemoryValue(){
        return memval;
    }

    public void setMemoryValue(float memval){
        this.memval = memval;
    }

    public void clearMemory(){
        setMemoryValue(0);
    }





}







   


