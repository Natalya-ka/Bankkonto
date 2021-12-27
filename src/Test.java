public class Test {
    public static void main(String[]args) throws KontoAusnahme{


            Konto kon = new Konto(4711, 600);
            kon.zahleAus(1000);
            kon.zahleEin(200);
            kon.info();



    }
}
