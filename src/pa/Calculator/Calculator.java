package pa.Calculator;

public class Calculator implements Adder, Subtractor, Multiplicator, Divider {

    public long add(long... operands){
        long retSum = 0;

        for(long value : operands){
            retSum += value;
        }

        return retSum;
    }

    public long subtract(long... operands){

        return 0;
    }

    public long multiply(long... operands){

        return 0;
    }

    public long divide(long... operands){

        return 0;
    }
}
