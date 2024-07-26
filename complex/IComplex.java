package complex;

public interface IComplex<T extends Number> {
    T getReal();

    T getImaginary();

    IComplex<T> add(IComplex<T> complex);

    IComplex<T> substract(IComplex<T> complex);

    IComplex<T> product(IComplex<T> complex);

    IComplex<T> divide(IComplex<T> complex);
}
