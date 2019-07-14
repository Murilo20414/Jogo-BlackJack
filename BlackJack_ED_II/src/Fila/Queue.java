package Fila;

/**
 *
 * @author Murilo
 */
public class Queue<E> implements TAD_Queue<E> {

    private Node head = null, tail = null;
    public int total;

    public Queue() {
        head = null;
        tail = null;
        total = 0;
    }

    @Override
    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public E peek() {
        if (head == null) {
            return null;
        } else {
            return (E) head.getValue();
        }
    }

    @Override
    public E enqueue(E x) {
        if (x == null) {
            return null;
        }
        try {
            Node novo = new Node();
            novo.setValue(x);
            novo.setNext(null);
            if (tail == null) {
                head = novo;
                tail = novo;
            } else {
                tail.setNext(novo);
                tail = novo;
            }
            total++;
            return x;
        } catch (Exception ex) {
            return null;
        }
    }

    @Override
    public E dequeue() {
        if (head == null) {
            return null;
        }
        Object value = head.getValue();
        head = head.getNext();
        if (head == null) {
            tail = null;
        }
        total--;
        return (E) value;
    }

    @Override
    public String toString() {
        if (!isEmpty()) {
            String saida = "";
            Node aux = head;
            while (aux != null) {
                saida += aux.getValue().toString();
                aux = aux.getNext();
                if (aux != null) {
                    saida += ", ";
                }
            }
        return ("[" + saida + "]");
        }
        else return "f: []";
    }
}
