package com.func;

/**
 * Represents a function
 * 
 * @author Shimi
 *
 */
// TODO: introduce generics
public interface F {
	/**
	 * Represents a function invocation.
	 * 
	 * @param arg the input for the function
	 * @return the result of the function
	 */
	Object apply(Object arg);
}
