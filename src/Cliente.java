
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private List<Conta> contas;

    public Cliente(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarConta(Conta conta) {
        this.contas.add(conta);
    }
    public List<Conta> getContas() {
        return contas;
    }
    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }
    //Com essa implementação, cada cliente pode imprimir um extrato unificado de todas as contas
    public void imprimirExtratoUnificado() {
        System.out.println(String.format("=== Extrato Geral do Cliente: %s ===", this.getNome()));
        for (Conta conta : contas) {
            conta.imprimirExtrato();
            System.out.println();
        }
    }
}

