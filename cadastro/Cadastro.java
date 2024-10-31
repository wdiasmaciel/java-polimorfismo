package cadastro;

import veiculo.Veiculo;

public class Cadastro {
    int cont = 0, quantidade;
    Veiculo[] veiculos;

    public Cadastro(int quantidade) {
        this.quantidade = quantidade;
        veiculos = new Veiculo[quantidade];
    }

    public void adiciona(Veiculo veiculo) {
        if (cont < quantidade)
            veiculos[cont++] = veiculo;
    }

    public String toString() {
        String mensagem = "Veiculos: \n";
        for (Veiculo veiculo : veiculos)
            mensagem += veiculo + "\n";
        return mensagem;
    }
}