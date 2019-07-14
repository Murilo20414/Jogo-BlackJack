package Pilha;

import Pilha.TAD_Pilha;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author 
 */
public class Pilha<E> implements TAD_Pilha<E> {

    private int topo;
    public int size;
    private ArrayList<E> cartasPlayer;

    public Pilha() {
        this.topo = -1;
        this.size = 0;
        cartasPlayer = new ArrayList<>();
    }
    
    @Override
    public boolean isEmpty() {
        return (topo == -1);
    }

    @Override
    public boolean isFull() {
        return false;
    }
    
    @Override
    public E push(E obj) {
        if (obj != null) {
        	cartasPlayer.add(++topo, obj);
        	size++;
            return obj;
        } else {
            return null;
        }
    }

    @Override
    public E pop() {
        if (!isEmpty()) {
        	return cartasPlayer.remove(topo--);
        } else {
            return null;
        }
    }

    @Override
    public E top() {
        if (!isEmpty()) {
        	size--;
        	return cartasPlayer.get(topo);
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        if (!isEmpty()) {
            String msg = "";
            for (int i = 0; i <= topo; i++) {
                msg += "  " + cartasPlayer.get(i).toString();
                if (i != topo) {
                    msg += ", ";
                }
            }
            return ("[" + msg + "]");
        } else {
            return "Pilha vazia";
        }
    }

}
