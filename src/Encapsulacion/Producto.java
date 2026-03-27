package Encapsulacion;

public class Producto {

    private String codigo;
    private String nombre;
    private double precio;

    public Producto(String codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public void aplicarDescuento(double porcentaje) {
        double descuento = precio * porcentaje / 100;
        precio -= descuento;
    }

    public void mostrarInfo() {
        System.out.println("Producto: " + nombre);
        System.out.println("Codigo: " + codigo);
        System.out.println("Precio actual: Q" + precio);
        System.out.println("----------------------------");
    }
}