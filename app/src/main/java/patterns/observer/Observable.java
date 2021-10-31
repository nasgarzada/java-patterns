package patterns.observer;

public interface Observable<T> {
    void observe(T observedObject);
}
