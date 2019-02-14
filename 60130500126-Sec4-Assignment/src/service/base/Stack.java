package service.base;

/**
 *
 * @author Nuntuch Thongyoo
 */
public interface Stack<ObjG> {

    public int search(ObjG obj);

    public int size();

    public void push(ObjG obj);//เพิ่มค่าใส่เข้าไปด้านท้าย

    public ObjG pop();//ลบตัวบนสุด

    public ObjG peek();//ดูค่าตัวบนสุด()

    public boolean isEmpty();

}
