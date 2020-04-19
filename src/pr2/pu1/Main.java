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
        KomplexeZahlKlein1 f = new KomplexeZahlKlein1(3,10);

        /**
         * Exception handling
         * if im > 10 throws self invented Exception
         */
        KomplexeZahlKlein2 g = new KomplexeZahlKlein2(3,10);
        System.out.println();

        /**
         * static addition
         */
        KomplexeZahl.setRee(2.5);
        KomplexeZahl.setImm(4.5);

        System.out.println(KomplexeZahl.adds(y).toString()+"\n");



        /**
         * static multiplication
         */

        KomplexeZahl.setRee(2.5);
        KomplexeZahl.setImm(4.5);

        System.out.println(KomplexeZahl.prods(y).toString());

        x.main();
    }



}
