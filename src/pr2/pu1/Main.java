package pr2.pu1;

public class Main {

    /**
     * static doubles for our static methods
     */
    private static double im,re;

    public static void main(String[] args) {
	// write your code here

        KomplexeZahl x = new KomplexeZahl(2.5,4.5);
        KomplexeZahl y = new KomplexeZahl(3,4);

        System.out.println("x = " + x.toString());

        /**
         * Addition of x and y
         */
        System.out.println(x.add(y).toString());
        /**
         * Multiplication of x and y
         */
        System.out.println(x.prod(y).toString());

        ReelleZahl z = new ReelleZahl(2, 3);
        /**
         * Prints only the Real part
         */
        System.out.println(z.toString());

        /**
         * Exception handling
         * if im > 10 throws Exception
         */
        KomplexeZahlKlein1 f = new KomplexeZahlKlein1(3,11);

        /**
         * Exception handling
         * if im > 10 throws self invented Exception
         */
        KomplexeZahlKlein2 g = new KomplexeZahlKlein2(3,10);
        System.out.println();

        /**
         * static addition
         */
        re = 2.5;
        im = 4.5;
        System.out.println(adds(y).toString() +"\n");


        /**
         * static multiplication
         */

        re = 2.5;
        im = 4.5;
        System.out.println(prod(y).toString());
    }




    /**
     * this parameter ersetzen, bzw alternative suchen
     * da statische methoden nur statische variablen zugreifen können.
     * @param addend
     * @return
     */

    /*
    public static KomplexeZahl add(KomplexeZahl addend){

        KomplexeZahl sum = new KomplexeZahl(
            im +
        );
        return sum;
    }*/

    /**
     * Same as KomplexeZahl.add but static
     * @param addend
     * @return
     */
    public static KomplexeZahl adds(KomplexeZahl addend){
        KomplexeZahl add = new KomplexeZahl(
                re + addend.getRe(),
                im + addend.getIm()
        );
        return add;
    }

    /**
     * same as KomplexeZahl.prod but static
     * @param multi
     * @return
     */
    public static KomplexeZahl prod(KomplexeZahl multi){
        KomplexeZahl mult = new KomplexeZahl(
                (re * multi.getRe()) - (im * multi.getIm()),
                (re * multi.getIm()) + (im * multi.getRe())
        );
        return mult;
    }
}
