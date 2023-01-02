package io.gk.game.motion;

/**
 * 
 * @author gentjan kolicaj
 *
 */
public interface Function<I,O> {

    O calculate(I input);

    O calculate2(I input);

    void prepareFunction(Object... objects);
	
}
