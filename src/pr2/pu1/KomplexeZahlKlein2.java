package pr2.pu1;


/**
 * inner class that extends the RuntimeException class
 * creating a new personal defined Exception
 */
class KKKException extends RuntimeException {
    public KKKException(String msg){
        super(msg);
    }
}

public class KomplexeZahlKlein2 extends ReelleZahl {

    /**
     * Same as KomplexeZahlKlein1 but with a twist by using our own Exception
     */
    public KomplexeZahlKlein2(double re, double im) {
        super(re, im);
        if(im > 10){
            throw new KKKException("Imaginärer Teil ist zu Groß! Reeler Teil: "+ re);
        }
    }


}
