package pr2.pu1;

public class ReelleZahl extends KomplexeZahl {
    public ReelleZahl(double re, double im) {
        super(re, 0.0);
    }

    /**
     * String method
     * @return only the real number
     */
    public String toString() {
        return  "Reeler Teil: " + getRe();
    }
    
}
