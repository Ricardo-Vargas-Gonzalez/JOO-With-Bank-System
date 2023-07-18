public class Referencia3 {
    public static void main(String[] args) {
        Cuenta cuentaDeDiego = new Cuenta();
        cuentaDeDiego.titular = new Cliente();
        cuentaDeDiego.titular.nombre = "Diego";
        System.out.println(cuentaDeDiego.titular.nombre);
    }
}