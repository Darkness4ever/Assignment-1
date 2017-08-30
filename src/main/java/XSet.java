import java.util.*;

/**
 * Created by mahapata on 8/30/2017.
 */
public class XSet<E> extends AbstractSet<E> implements Set<E> {

    private transient HashMap<E, Object> map;

    private static final Object PRESENT=new Object();

    public XSet(){
        map=new HashMap();
    }

    public XSet(int initialCapacity,float loadFactor){
        map=new HashMap(initialCapacity,loadFactor);
    }

    public XSet(int initialCapacity){
        map=new HashMap(initialCapacity);
    }

    XSet(int initialCapacity,float loadFactor,boolean dummy){
        map=new LinkedHashMap(initialCapacity,loadFactor);
    }

    public int size() {
        return map.size();
    }

    public boolean isEmpty() {
        return map.isEmpty();
    }

    public boolean contains(Object o) {
        return map.containsKey(o);
    }

    public Iterator<E> iterator() {
        return map.keySet().iterator();
    }

    public Object[] toArray() {
        return new Object[0];
    }

    public <T> T[] toArray(T[] a) {
        return null;
    }

    public boolean add(E e) {
        return map.put(e,PRESENT)==null;
    }

    public boolean remove(Object o) {
        return map.remove(o)==PRESENT;
    }

    public boolean containsAll(Collection<?> c) {
        return false;
    }

    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    public boolean retainAll(Collection<?> c) {
        return false;
    }

    public boolean removeAll(Collection<?> c) {
        return false;
    }

    public void clear() {
        map.clear();
    }
}
