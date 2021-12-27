public class Test {
    public static void main(String[]args) throws KontoAusnahme{


            Konto kon = new Konto(4711, 100);
            kon.zahleAus(500);
            kon.zahleEin(10);
            kon.info();



    }
}
