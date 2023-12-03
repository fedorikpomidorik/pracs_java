package practical_works.prac_20.num_1_2;

public class Classs<T, V, K> {
    private final T t;
    private final V v;
    private final K k;

    public Classs(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }

    public void displayTypes() {
        System.out.println("Type of T: " + t.getClass().getName());
        System.out.println("Type of V: " + v.getClass().getName());
        System.out.println("Type of K: " + k.getClass().getName());
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "t=" + t +
                ", v=" + v +
                ", k=" + k +
                '}';
    }
}