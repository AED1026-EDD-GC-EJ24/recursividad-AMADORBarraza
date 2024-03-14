package miPrincipal;
public interface Identificable<T> extends Comparable{
    public abstract T getId();
    public abstract void setId(T x);
}
