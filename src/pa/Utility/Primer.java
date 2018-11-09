package pa.Utility;

public class Primer {

    public void primeIt(double op1, double op2) {
        double result = 0;
        boolean isAPrime = true;
        for (int i = 2; i <= op1/2;i++){
            result=op1%1;
            if (result == 0){
                isAPrime = false;
                break;
            }
        }
        if (isAPrime)
            System.out.println(op1 + " é um numero primo.");
        else
            System.out.println(op1 + " não é um numero primo.");
        /////////////////////////////////
        primeIt2(op2);
    }

    public void primeIt2(double op2){
        double result = 0;
        boolean isAPrime = true;
        for (int i = 2; i <= op2/2;i++){
            result=op2%1;
            if (result == 0){
                isAPrime = false;
                break;
            }
        }
        if (isAPrime)
            System.out.println(op2 + " é um numero primo.");
        else
            System.out.println(op2 + " não é um numero primo.");
    }
}
