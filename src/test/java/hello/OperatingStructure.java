package hello;

/**
 * Created by klevshin on 5/11/2016.
 */
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OperatingStructure {
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

