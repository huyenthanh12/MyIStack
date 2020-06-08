package com.example.istack;

import java.util.List;

public class StackEmptyException<T> {

    public boolean isEmpty(List<T> stackNumber) {
        return stackNumber.isEmpty();
    }

	public String stackEmptyString(List<Integer> stackNumber) {
		if (stackNumber.isEmpty()) {
            return "Stack is empty now";
        }
        return "Stack has element";  
	}
    
}