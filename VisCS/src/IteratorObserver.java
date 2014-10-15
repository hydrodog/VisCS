/*
 * interface for all implementors of looking at a position in an array
 * @author Dov Kruger
 */
public interface IteratorObserver {
	// move the iterator by a relative amount
	public void move(int delta);
	
	public void inc(); // special case move(+1)
	public void dec(); // special case move(-1)

	// stop looking at the current location and jump to new index pos
	public void set(int pos);
}
