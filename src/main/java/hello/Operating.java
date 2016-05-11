package hello;

/**
 * Created by klevshin on 4/25/2016.
 */
public class Operating {
    private int value1 = 10;
    private int value2 = 20;
    private int result;
    private String operation;

    public Operating(String op, int val1, int val2) {
        operation = op;
        value1 = val1;
        value2 = val2;
        if(op.equals("summing")) {
            result = value1 + value2;
        }

        else if(op.equals("subtracting")) {
            result = value2 - value1;
        }

    }

    public int getResult() {
        return result;
    }

    public String getOperation() {
        return operation;
    }

}



