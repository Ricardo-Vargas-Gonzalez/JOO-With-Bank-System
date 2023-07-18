public class CrearCuenta {
    public static void main(String[] args) {
        // New no es un valor exclusivo de la variable, es unicamente ocupada para ese espacio de memoria designado, cada que se usa new, es un nuevo espacio, que, sin importar que tengan el mismo nombre, no se afectarán entre si a menos que se designe así de algun modo.
        Cuenta primeraCuenta = new Cuenta();
        primeraCuenta.saldo = 1000;

        System.out.println(primeraCuenta.saldo);
        
        Cuenta segundaCuenta = new Cuenta();
        segundaCuenta.saldo = 500;
        System.out.println(segundaCuenta.saldo);

        System.out.println(primeraCuenta);
        System.out.println(segundaCuenta);
        // En estas lineas de código, nos arrojara dos codigos alfanumericos diferenctes, ya que, como mencione en la nota incial, estas se encuentran en instancias diferentes a pesar de que se puedan referenciar como se hace a continuación.
        if (primeraCuenta == segundaCuenta) {
            System.out.println("Son el mismo objeto");
        } else {
            System.out.println("Son diferentes");
        }
        
    }
}