package service.base;

/**
 *
 * @author Nuntuch Thongyoo
 */
public interface Stack<ObjG> {

    public int search(ObjG obj);

    public int size();

    public void push(ObjG obj);

    public ObjG pop();

    public ObjG peek();

    public boolean isEmpty();

}
