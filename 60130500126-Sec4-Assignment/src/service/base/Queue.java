package service.base;

/**
 *
 * @author Nuntuch Thongyoo
 * @param <Obj>
 */
public interface Queue<ObjG> {

    public boolean isEmpty();

    public ObjG getFront();

    public ObjG dequeue();

    public void enqueue(ObjG obj);//เพิ่มท้าย

    public void clear();

    public int size();
}
