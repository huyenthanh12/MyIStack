import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class IStackTest {

    @Test
    public void test_push() {
       
        IStack<Integer> stackNumber = new IStack<>();
        IStack<String> stackString = new IStack<>();

       stackNumber.push(10);
       assertFalse(stackNumber.isEmpty());

       stackString.push("test push string");
       assertTrue(!stackString.isEmpty());
    }

    @Test
    public void test_pop() throws StackEmptyException {
        
        IStack<Integer> stackNumber = new IStack<>();

        Throwable exception = assertThrows(StackEmptyException.class, () -> stackNumber.pop());
        assertEquals("Stack is empty now", exception.getMessage());
            
        stackNumber.push(56);
        stackNumber.push(65);
        assertEquals(stackNumber.pop(), 65);
    }

    @Test
    public void test_isEmpty() throws StackEmptyException {

        IStack<Integer> stackNumber = new IStack<>();

        assertTrue(stackNumber.isEmpty());

        stackNumber.push(5);
        assertFalse(stackNumber.isEmpty());

        stackNumber.pop();
        assertTrue(stackNumber.isEmpty());
    }

    @Test
    public void test_clear() {
        
        IStack<Integer> stackNumber = new IStack<>();

        stackNumber.push(1);
        stackNumber.push(65);
        stackNumber.push(-6);
        stackNumber.clear();

        assertTrue(stackNumber.isEmpty());
    }

    @Test
    public void test_contain() {

        IStack<Integer> stackNumber = new IStack<>();
        
        stackNumber.push(1);
        stackNumber.push(65);
        stackNumber.push(-6);

        assertTrue(stackNumber.contain(65));
        assertFalse(stackNumber.contain(10));
    }

    @Test
    public void test_peek() {
      
        IStack<Integer> stackNumber = new IStack<>();

        assertNull(stackNumber.peek());

        stackNumber.push(1);
        stackNumber.push(65);
        stackNumber.push(-6);

        assertEquals(stackNumber.peek(), -6);
    }
}