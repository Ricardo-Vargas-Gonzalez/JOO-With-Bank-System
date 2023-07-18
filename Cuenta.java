/* Puse en notas los private a fin de que funcionen la mayor cantidad de archivos, 
ya que el private fue creado para los constructores y encapsulamientos, pero quería dejar rastro de esto para futuras ideas */
class Cuenta {
    /*private*/  double saldo;
    /*private*/  int agencia;
    /*private*/  int numero;
    /*private*/  Cliente titular;

    /* static nos señala que la variable no será alterada por la instancia sino unicamente por la clase que la esté usando */
    private static int total = 0;

    /* Este es un constructor porque a traves de este metodo al definir el objeto, ya lo podemos manipular desde su concepción, e inicializar los atributos
     * este es el poder del constructor, nos fuerza a dar información para que nuestra regla de negocio funcione
     */
    public Cuenta(int agencia) {
        int total = 0;
        if (agencia <= 0) {
            System.out.println("No se permite 0");
            this.agencia = 1;
        } else {
            this.agencia = agencia;
        }
        total++;
        System.out.println("Se van creando: " + total + " cuentas");
    }

    // Void solo ejecuta el codigo, pero es un metodo que no devuelve nada.
    void depositar(double valor) {

        // El uso de this hace mejoras en la interpretación y lectutra del codigo, this es una referencia
        // Este metodo no Retorna valor
        this.saldo += valor;
    }
    // Este metodo si retorna valor
    public boolean retirar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
            return false;
    }
    public boolean transferir(double valor, Cuenta cuenta) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            cuenta.depositar(valor);
            return true;
        } 
            return false;
    }
    /* Cuando se busca obtener un metodo, o un valor de 
    una variable privada, se comienza con el mmetodo get
      esto es por convención */
    public double getSaldo( ) {
        return this.saldo;
    }

    /* Por otro lado, mientras el metodo get es para 
    obtener, el metodo set, es para asignar */

    public int getAgencia() {
        return this.agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }

    public static int getTotal() {
        return Cuenta.total;
    }

    public int getNumero() {
        return numero;
    }

}