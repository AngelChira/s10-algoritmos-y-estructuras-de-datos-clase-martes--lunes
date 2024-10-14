package s10algoritmosclasemarteslunes;

public class NodoCircular {
    private NodoCircular sgte;
    private int dato;

    public NodoCircular() {
    }

    public NodoCircular(NodoCircular sgte, int dato) {
        this.sgte = sgte;
        this.dato = dato;
    }

    public NodoCircular getSgte() {
        return sgte;
    }

    public void setSgte(NodoCircular sgte) {
        this.sgte = sgte;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }
    
}
