public class Test {
    public static void main(String[]args) throws KontoAusnahme{


            Konto kon = new Konto(4711, 10000);
            kon.zahleAus(1000);
            kon.zahleEin(104);
            kon.info();



    }
}
