package pr2.pu1;

public class KomplexeZahlKlein1 extends KomplexeZahl{

    /**
     * Constructor checks if re is greater than 10. if yes, it throws an exception
     * @param re
     * @param im
     */
    public KomplexeZahlKlein1(double re, double im) {
        super(re, im);
        if(im > 10){
            throw new IndexOutOfBoundsException("Imaginärer Teil ist zu Groß! Reeler Teil: "+ re);
        }
    }
}
