package Fila;

/**
 *
 * @author Murilo
 */
public interface TAD_Queue<E> {
    public boolean isEmpty();
    public E enqueue(E x);
    public E dequeue();
    public E peek();
    @Override
    public String toString();
}
