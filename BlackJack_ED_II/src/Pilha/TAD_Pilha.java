package Pilha;

/**
 *
 * @author
 */
public interface TAD_Pilha<E> {

    public E push(E obj);

    public E pop();

    public boolean isEmpty();

    public boolean isFull();

    public E top();

    @Override
    public String toString();
}
