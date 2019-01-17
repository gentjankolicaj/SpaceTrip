package org.app.motion;

/**
 * 
 * @author gentjan kolicaj
 *
 */
public interface Function<I,O> {

	
	public abstract O calculate(I input);
	
	public abstract O calculate2(I input);
	
	public abstract void prepareFunction(Object...objects);
	
}
