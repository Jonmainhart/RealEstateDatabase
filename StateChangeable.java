/* StateChangeable.java
 * Jonathan Mainhart - CMIS 242
 * 09 October 2020
 *
 * Provides an abstract method to change the state of the Object which implements
 * the interface. The interface accepts any type of Enum. 
 *
 */
package mainhart;

/**
 *
 * @author jonmainhart
 * @param <T>
 */
public interface StateChangeable<T extends Enum<T>> {

    /**
     *
     * @param t
     */
    public abstract void changeState(T t);

}
