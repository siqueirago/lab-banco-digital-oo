
public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Banco Exemplo");

        Cliente cliente1 = new Cliente("João Silva");
        ContaCorrente contaCorrente1 = new ContaCorrente(cliente1);
        ContaPoupanca contaPoupanca1 = new ContaPoupanca(cliente1);

        cliente1.adicionarConta(contaCorrente1);
        cliente1.adicionarConta(contaPoupanca1);

        banco.adicionarCliente(cliente1);

        Cliente cliente2 = new Cliente("Maria Oliveira");
        ContaCorrente contaCorrente2 = new ContaCorrente(cliente2);
        ContaPoupanca contaPoupanca2 = new ContaPoupanca(cliente2);

        cliente2.adicionarConta(contaCorrente2);
        cliente2.adicionarConta(contaPoupanca2);

        banco.adicionarCliente(cliente2);

        // Realizando operações
        contaCorrente1.depositar(1000);
        contaCorrente1.transferir(300, contaPoupanca1);

        contaCorrente2.depositar(2000);
        contaCorrente2.transferir(500, contaPoupanca2);

        // Imprimindo extratos
        cliente1.imprimirExtratoUnificado();
        
    }
}
