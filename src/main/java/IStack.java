import java.util.ArrayList;
import java.util.List;

public class IStack<T> {

    private List<T> stackNumber = new ArrayList<>();
    private StackEmptyException errorMessage = new StackEmptyException<>();

    public void push(T x) {
        stackNumber.add(x);
    }

    public T pop() {
        
        if (isEmpty()) {
            return (T) errorMessage.stackEmptyString(stackNumber);
        }
        int topIndex = stackNumber.size() - 1;

        T result = stackNumber.get(topIndex);
        stackNumber.remove(result);

        return result;
    }

    public boolean isEmpty() {
        return stackNumber.isEmpty();
    }

    public boolean clear() {
        return stackNumber.removeAll(stackNumber);
    }

    public boolean contain(T x) {
        return stackNumber.contains(x);
    }

    public T peek() {
        int topIndex = stackNumber.size() - 1;
        return isEmpty()? null : stackNumber.get(topIndex);
    }
}