public class Main {

    public static void main(String[] args) {

        Banco abc = new Banco();
        abc.setNomeBanco("Banco ABC");
        abc.setCnpj("123.456.789/0001-12");


        Cliente eduardo = new Cliente();
        eduardo.setNome("Eduardo");
        eduardo.setCpf("001.002.003-123");
        abc.addCliente(eduardo,eduardo);

        Conta cc = new ContaCorrente(eduardo, eduardo);
        Conta poupanca = new ContaPoupanca(eduardo, eduardo);

        Cliente jose = new Cliente();
        jose.setNome("José");
        jose.setCpf("111.222.333-123");
        abc.addCliente(jose,jose);

        Conta cc2 = new ContaCorrente(jose, jose);
        Conta poupanca2 = new ContaPoupanca(jose, jose);


        cc.depositar(1000);
        cc.transferir(200,poupanca);
        cc.transferir(100,poupanca2);
        cc2.depositar(1500);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        cc2.imprimirExtrato();
        poupanca2.imprimirExtrato();

        abc.imprimirInfosBanco();

    }

}
