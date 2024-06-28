public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
	public void extrato() {
		System.out.println("=== Conta Corrente ===");
		super.extrato();
	}

    public void imprimirExtratoCliente() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirExtratoCliente();;
	}

    
}
