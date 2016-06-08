package main.groovy.test

/**
 * Created by klevshin on 6/8/2016.
 */

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
class OperatingStructure {

    private int result;
    private String operation;

    public OperatingStructure() {}

    public void setResult(int r) {
        result = r;
    }

    public int getResult() {
        return result;
    }

    public void setOperation(String op) {
        operation = op;
    }

    public String getOperation() {
        return operation;
    }

}
