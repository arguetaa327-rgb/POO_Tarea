package Encapsulacion;

public class Main {

    public static void main(String[] args) {

        Persona p1 = new Persona("Alondra", "Argueta", 20);
        Persona p2 = new Persona("Jose", "Lopez", 22);
        Persona p3 = new Persona("Maria", "Perez", 19);

        p1.mostrarDatos();
        p2.mostrarDatos();
        p3.mostrarDatos();

        Rectangulo r1 = new Rectangulo(5, 4);
        Rectangulo r2 = new Rectangulo(6, 3);

        System.out.println("Area R1: " + r1.calcularArea());
        System.out.println("Area R2: " + r2.calcularArea());

        if (r1.calcularArea() > r2.calcularArea()) {
            System.out.println("El primero es mayor");
        } else {
            System.out.println("El segundo es mayor");
        }

        Producto pr1 = new Producto("001", "Mouse", 80);
        Producto pr2 = new Producto("002", "Teclado", 150);

        pr1.aplicarDescuento(10);
        pr2.aplicarDescuento(20);

        pr1.mostrarInfo();
        pr2.mostrarInfo();

        Cuenta cuenta = new Cuenta("Alondra", 500);

        cuenta.depositar(200);
        cuenta.retirar(100);
        cuenta.retirar(700);

        cuenta.verSaldo();

        Libro l1 = new Libro("Java Basico", "Jose", 200);
        Libro l2 = new Libro("Programacion", "Maria", 400);
        Libro l3 = new Libro("POO", "Carlos", 350);

        l1.mostrarLibro();
        l2.mostrarLibro();
        l3.mostrarLibro();

        Calculadora calc = new Calculadora();

        System.out.println("Suma: " + calc.sumar(10, 5));
        System.out.println("Division: " + calc.dividir(10, 0));

        Fecha f1 = new Fecha(10, 5, 2025);
        Fecha f2 = new Fecha(35, 10, 2024);
        Fecha f3 = new Fecha(20, 15, 2023);

        f1.mostrarFecha();
        f2.mostrarFecha();
        f3.mostrarFecha();
    }
}
