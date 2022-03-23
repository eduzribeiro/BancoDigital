public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente, Cliente cpf) {
        super(cliente, cpf);
    }


    @Override
    public void imprimirExtrato() {
        System.out.println("------EXTRATO CONTA POUPANÇA------");
        super.imprimirInfosComuns();
    }

}
