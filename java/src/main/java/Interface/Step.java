package Interface;

public interface Step<T, U> {
    public T pipe(T value, U... args) throws ClassNotFoundException;

    public Integer increment(Integer value);
}
