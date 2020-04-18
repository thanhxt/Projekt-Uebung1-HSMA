package pr2.pu1;

public class KomplexeZahl {

    private double im;
    private double re;

    /**
     * constructor for our input
     * @param re = re
     * @param im = im
     */
    public KomplexeZahl(double re, double im){
        this.im = im;
        this.re = re;
    }

    /**
     * String methods
     * @return real and imaginary number
     */
    public String toString(){
        return getRe() + " + " + getIm() + 'i';
    }

    /**
     * addition of two complex numbers
     * @param addend (x2,y2)
     * @return sum
     */
    public KomplexeZahl add(KomplexeZahl addend){
        KomplexeZahl sum = new KomplexeZahl(
                this.re + addend.re,
                this.im + addend.im
        );
        return sum;
    }

    /**
     * @param this (x1,y1)
     * @param multi (x2,y2)
     * @return re(x1∗x2) − (y1∗y2) , im(x1∗y2) + (y1∗x2)
     */
    public KomplexeZahl prod(KomplexeZahl multi){
        KomplexeZahl mult = new KomplexeZahl(
                (this.re * multi.re) - (this.im * multi.im),
                (this.re * multi.im) + (this.im * multi.re)
        );
        return mult;
    }

    public void main(){
        KomplexeZahl x = new KomplexeZahl(2.5,4.5);
        System.out.print("x = " + x.toString());
    }

    /**
     * setter and getter Methods
     * @return re and im
     */

    public double getRe() {
        return re;
    }

    public double getIm(){
        return im;
    }

}
