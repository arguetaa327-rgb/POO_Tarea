package Encapsulacion;

public class Cuenta {

    private String titular;
    private double saldo;

    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
        }
    }

    public void retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
        } else {
            System.out.println("No hay suficiente saldo");
        }
    }

    public void verSaldo() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: Q" + saldo);
    }
}