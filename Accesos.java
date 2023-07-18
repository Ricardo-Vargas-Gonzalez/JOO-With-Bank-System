/* PUBLIC es un modificador de acceso, lo que hace 
que los metodos sean visibles desde cualquier 
parte del código
PRIVATE, por otro lado, hace que se esconda
una parte del código.
*/ 
public class Accesos {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();
        cuenta.setAgencia(-22);
        cuenta.depositar(400);
        cuenta.retirar(300);

        System.out.println(cuenta.getSaldo());
        System.out.println(cuenta.getAgencia());
    }
}
