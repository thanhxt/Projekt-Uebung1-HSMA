package pr2.pu1;

public class KomplexeZahl {

    private double im;
    private double re;

    private static double imm;
    private static double ree;

    public KomplexeZahl(double re, double im){
        this.im = im;
        this.re = re;
    }

    /**
     * String methos
     * @returns real and imaginary number
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

    public double getRe() {
        return re;
    }

    public double getIm(){
        return im;
    }

    /**
     * not finished
     * @param addend
     * @return
     */
    public static KomplexeZahl adds(KomplexeZahl addend){
       KomplexeZahl add = new KomplexeZahl(
               ree += addend.re,
               imm += addend.im
       );
       return add;
    }

    public static double getImm(){
        return imm;
    }
    public static double getRee(){
        return ree;
    }

}
