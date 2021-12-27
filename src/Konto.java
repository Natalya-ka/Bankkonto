public class Konto {
    int kontonummer;//номер счета
    double saldo;//остаток средств


    public Konto(){}
    public Konto(int kontonummer) {
        this.kontonummer=kontonummer;
    }
    public Konto(int kontonummer, double saldo) throws KontoAusnahme {
        if (saldo<0)
            throw new KontoAusnahme("Negativer Saldo:"+saldo);
        this.kontonummer=kontonummer;
        this.saldo=saldo;
    }

    public int getKontonummer() {
        return kontonummer;
    }

    public void setKontonummer(int kontonummer) {
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double betrag)throws KontoAusnahme {
        if(betrag<0)
            throw new KontoAusnahme("Negativer Saldo:"+betrag);

            saldo = betrag;//денежная сумма
    }
    public void zahleEin(double betrag)throws KontoAusnahme {
        if(betrag<0)
            throw new KontoAusnahme("Negativer Betrag:"+betrag);

        saldo += betrag;
    }
    public void zahleAus(double betrag) throws KontoAusnahme {
        if(betrag<0)
            throw new KontoAusnahme("Negativer Betrag:"+betrag);
        if(saldo<betrag)
            throw new KontoAusnahme("Betrag mehr als Saldo:"+saldo);
        saldo -= betrag;
    }
    public void info() {
        System.out.println("Kontonummer: " + kontonummer + " Saldo: " + saldo);
    }
}