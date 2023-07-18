public class Encapsulamiento {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();
        Cliente cliente = new Cliente();
        cliente.nombre = "Diego";
        cliente.documento = "asdfghjk";

        cuenta.setTitular(cliente);

        Cliente titular = cuenta.getTitular();

        System.out.println(cliente);
        System.out.println(cuenta.getTitular());
        System.out.println(titular);

    }
}
