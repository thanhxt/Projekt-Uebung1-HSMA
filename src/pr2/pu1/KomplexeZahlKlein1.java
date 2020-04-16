package pr2.pu1;

public class KomplexeZahlKlein1 extends KomplexeZahl{

    public KomplexeZahlKlein1(double re, double im) {
        super(re, im);
        if(im > 10){
            throw new IndexOutOfBoundsException("Imaginärer Teil ist zu Groß! Reeler Teil: "+ re);
        }
    }
}
