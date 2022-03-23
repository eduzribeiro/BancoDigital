public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente, Cliente cpf) {
        super(cliente, cpf);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("------EXTRATO CONTA CORRENTE------");
        super.imprimirInfosComuns();
    }

}
