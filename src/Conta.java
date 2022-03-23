public abstract class Conta implements InterfaceConta{

    protected int agencia;
    protected int numConta;
    protected double saldo;

    private static final int AGENCIA_PADRAO = 123;
    private static int SEQUENCIA = 1;

    protected Cliente cliente;
    protected Cliente cpf;


    public Conta(Cliente cliente,Cliente cpf) {
        this.agencia=Conta.AGENCIA_PADRAO;
        this.numConta=SEQUENCIA++;
        this.cliente=cliente;
        this.cpf=cpf;
    }



    @Override
    public void sacar(double valor) {

        this.saldo=saldo-valor;

    }

    @Override
    public void depositar(double valor) {

        this.saldo=saldo+valor;

    }

    @Override
    public void transferir(double valor, Conta contaDestino) {

        this.sacar(valor);
        contaDestino.depositar(valor);

    }

    protected void imprimirInfosComuns(){

        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("CPF: %s", this.cpf.getCpf()));
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Número: %d", this.numConta));
        System.out.println(String.format("Saldo: %.2f", this.saldo));

    }

    public int getAgencia() {

        return agencia;
    }

    public int getNumConta() {

        return numConta;
    }

    public double getSaldo() {

        return saldo;
    }
}
