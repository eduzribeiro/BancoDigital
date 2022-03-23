import java.util.ArrayList;

public class Banco {

    private String nomeBanco;
    private String cnpj;
    private ArrayList<String> contas = new ArrayList(); //Banco deve possuir uma lista de contas
    private Cliente nomeCliente;
    private Cliente cpfCliente;
    private int i=1;
    private int j;

    public String getNomeBanco() {

        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {

        this.nomeBanco = nomeBanco;
    }

    public String getCnpj() {

        return cnpj;
    }

    public void setCnpj(String cnpj) {

        this.cnpj = cnpj;
    }

    public ArrayList getContas() {
        return contas;
    }

    public void setContas(ArrayList contas) {
        this.contas = contas;
    }

    protected void addCliente(Cliente nomeCliente, Cliente cpfCliente){

        this.nomeCliente=nomeCliente;
        this.cpfCliente=cpfCliente;
        contas.add(this.nomeCliente.getNome());
        contas.add(this.cpfCliente.getCpf());

    }

    protected void imprimirInfosBanco(){

        System.out.println("------INFORMAÇÕES BANCO------");
        System.out.println(String.format("Banco: %s", this.nomeBanco));
        System.out.println(String.format("CNPJ: %s", this.cnpj));

        System.out.println("------LISTA DE CLIENTES------");

        for(String nome : this.contas){

            if((i % 2)!=0) {

                System.out.println(String.format("Titular: %s", nome, "\n"));

            }

            if((i % 2)==0) {

                System.out.println(String.format("CPF: %s", nome));
            }

            i++;

        }

    }


}
