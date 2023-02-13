package fr.iut.but1.qdev;

import java.util.ArrayList;

public class BoundedQueue {
    private int capacity = 0;
    private ArrayList<Integer> fifo = new ArrayList<Integer>();


    public BoundedQueue(int capacity){
        this.capacity = capacity;
    }

    /**
     * Retourne la capacité de la queue, c-à-d le nombre maximum d'éléments
     * qu'elle peut contenir.
     *
     * @return la capacité de la queue.
     */
    public int capacity(){
        //TODO
        return 0;
    }

    /**
     * Retourne vrai ssi la queue est vide, c-à-d que sa taille est nulle.
     *
     * @return vrai ssi la queue est vide.
     */
    public boolean isEmpty() {
        //TODO
        return true;
    }

    /**
     * Retourne vrai ssi la queue est pleine, c-à-d que sa taille est égale à sa
     * capacité.
     *
     * @return vrai ssi la queue est pleine.
     */
    public boolean isFull() {
        //TODO
        return true;
    }

    /**
     * Retourne la taille de la queue, c-à-d le nombre d'éléments qu'elle
     * contient.
     *
     * @return la taille de la queue.
     */
    public int size() {
        //TODO
        return 0;
    }

    /**
     * Ajoute l'élément donné en fin de queue.
     *
     * @param elem
     *            l'élément à ajouter.
     * @throws java.lang.IllegalStateException
     *             si la queue est pleine.
     */
    public void push(int elem) {
       
    }

    /**
     * Supprime et retourne l'élément en début de la queue.
     *
     * @return l'élément en début de queue.
     * @throws java.lang.IllegalStateException
     *             si la queue est vide.
     */
    public int pop() {
        //TODO
        return 0;
    }

}
