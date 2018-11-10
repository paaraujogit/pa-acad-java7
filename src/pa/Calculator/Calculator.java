package pa.Calculator;

public class Calculator implements Adder, Subtractor, Multiplicator, Divider {

    public long add(long... operands){
        long retSum = 0;

        for(long value : operands){
            retSum += value;
        }
        //TODO: add overflow exception
        return retSum;
    }

    public long subtract(long... operands){
        long retSubtract = operands[0];

        for(int i = 1; i < operands.length; ++i){
            retSubtract -= operands[i];
        }
        //TODO: add overflow exception
        return retSubtract;
    }

    public long multiply(long... operands){
        long retMultiply = operands[0];

        for(int i = 1; i < operands.length; ++i){
            retMultiply *= operands[i];
        }
        //TODO: add overflow exception
        return retMultiply;
    }

    public long divide(long... operands){
        long retDivide = operands[0];

        for(int i = 1; i < operands.length; ++i){
            retDivide /= operands[i];
        }

        //TODO: add divide by zero exception
        return retDivide;
    }
}
