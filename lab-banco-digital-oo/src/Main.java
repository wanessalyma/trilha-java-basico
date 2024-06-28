
public class Main {
    public static void main(String[] args) {
        Banco bancos = new Banco("Banco do Brasil");

        Cliente eliana = new Cliente("Eliana");
        ContaCorrente ccEliana = new ContaCorrente(eliana);
        Poupanca poupancaEliana = new Poupanca(eliana);

        bancos.adicionarContaCC(ccEliana);
        bancos.adicionarContaP(poupancaEliana);

        Cliente mateus = new Cliente("Mateus");
        ContaCorrente ccMateus = new ContaCorrente(mateus);
        Poupanca poupancaMateus = new Poupanca(mateus);

        bancos.adicionarContaCC(ccMateus);
        bancos.adicionarContaP(poupancaMateus);
  
        Cliente estefane = new Cliente("Estefane");
        ContaCorrente ccEstefane = new ContaCorrente(estefane);
        Poupanca poupancaEstefane = new Poupanca(estefane);

        bancos.adicionarContaCC(ccEstefane);
        bancos.adicionarContaP(poupancaEstefane);


		ccEliana.depositar(100);
		ccEliana.transferir(100, poupancaEliana);

		ccMateus.depositar(150);
		poupancaMateus.depositar(200);
        ccMateus.sacar(50);

        ccEstefane.depositar(100);
        ccEstefane.depositar(30);
        ccEstefane.sacar(25);
        ccEstefane.transferir(100, poupancaEstefane);

        bancos.clientesCadastrados();

        bancos.contasCadastradas();

        bancos.imprimirExtrato(5);
    }
    
}
