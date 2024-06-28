public class Poupanca extends Conta{

    public Poupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
	public void extrato() {
		System.out.println("=== Conta Poupança ===");
		super.extrato();
	}

    @Override
	public void imprimirExtratoCliente() {
		System.out.println("=== Extrato Poupança ===");
		super.imprimirExtratoCliente();
	}
    
}
