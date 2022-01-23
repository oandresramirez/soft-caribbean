package com.caribbean.tree;


public class Nodo {
 private int info;
    Nodo izq, der, raiz;
    
    public void insertar (int info2)
    {
        Nodo nuevo = new Nodo ();
        nuevo.info = info2; 
        nuevo.izq = null;
        nuevo.der = null;
        System.out.println("Prueba node ------> "+nuevo.info);
        if (raiz == null)
            raiz = nuevo;
        else
        {
            Nodo anterior = null, reco;
            reco = raiz;
            while (reco != null)
            {
                anterior = reco;
                if (info < reco.info)
                    reco = reco.izq;
                else
                    reco = reco.der;
            }
            if (info < anterior.info)
                anterior.izq = nuevo;
            else
                anterior.der = nuevo;
        }
    }
}
