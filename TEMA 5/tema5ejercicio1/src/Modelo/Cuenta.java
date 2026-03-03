package Modelo;

public class Cuenta {
    private int id;
    private String iban;
    private double saldo;


    public Cuenta() {
    }

    public Cuenta(int id, double saldo) {
        this.id = id;
        this.saldo = saldo;
    }

    public Cuenta(int id, String iban, double saldo) {
        this.id = id;
        this.iban = iban;
        this.saldo = saldo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "C U E N T A " + "\n ID: " + id + "| IBAN: " + iban + "| SALDO: " + saldo;

    }

}
