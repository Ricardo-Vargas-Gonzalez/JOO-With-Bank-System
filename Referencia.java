/**
 * el lenguaje de Java funciona a base de Referencias
 */
public class Referencia {

    // En este caso en particular, se apuntoa por ambos objetos, primera y segunda cuenta al mismo espacio de memoria, por lo que se haga en este espacio va a afectar a ambos.
    public static void main(String[] args) {
        Cuenta primerCuenta = new Cuenta();
        primerCuenta.saldo = 200;
        Cuenta segundaCuenta = primerCuenta;
        segundaCuenta.saldo  = 100;System.out.println("saldo primera" + "Cuenta: " + primerCuenta.saldo);

        System.out.println("saldo primera" + "Cuenta: " + segundaCuenta.saldo);

        segundaCuenta.saldo += 400;
        System.out.println("saldo primera" + "Cuenta: " + primerCuenta.saldo);

        System.out.println(primerCuenta);
        System.out.println(segundaCuenta);

    }
}