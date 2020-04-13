package pr2.pu1;

public class Main {

    private static double im,re;

    public static void main(String[] args) {
	// write your code here

        KomplexeZahl x = new KomplexeZahl(2.5,4.5);
        KomplexeZahl y = new KomplexeZahl(3,4);

        System.out.println("x = " + x.toString());
        ;
        System.out.println(x.add(y).toString());
        System.out.println(x.prod(y).toString());

        System.out.println(KomplexeZahl.adds(x));

        ReelleZahl z = new ReelleZahl(2, 3);

        System.out.println(z.toString());

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
}
