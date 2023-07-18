public class Referencia2 {
    public static void main(String[] args) {
        Cliente diego = new Cliente();
        diego.nombre = "Diego";
        diego.documento = "6789910";
        diego.telefono = "5567459889";

        Cuenta cuentaDeDiego = new Cuenta();
        cuentaDeDiego.agencia = 1;
        cuentaDeDiego.titular = diego;

        System.out.println(cuentaDeDiego.titular.documento);
        System.out.println(cuentaDeDiego.titular);
    }
}
