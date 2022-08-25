package trycatch;

public class Calculator {



     public  int addition (int num1 ,int num2){
         int result=0;
         try {
             result =num1/num2;

         }catch (ArithmeticException ar) {
             ar .getMessage();
         }

         System.out.println("Calculator");



        return result;

    }
    }