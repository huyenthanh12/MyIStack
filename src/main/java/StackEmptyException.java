public class StackEmptyException extends Exception {
    
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public StackEmptyException(String reason) {
        super(String.format("Stack is empty now", reason));
    }
}