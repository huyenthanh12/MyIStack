import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class StackEmptyExceptionTest {

    @Test
    public void test_stackEmptyString() {

        List<Integer> stackNumber = new ArrayList<>();
        StackEmptyException<String> getMessage = new StackEmptyException<>();

        assertEquals(getMessage.stackEmptyString(stackNumber), "Stack is empty now");
    }
    
}