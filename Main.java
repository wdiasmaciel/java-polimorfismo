import veiculo.Veiculo;
import cadastro.Cadastro;

public class Main {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo("1");
        Veiculo veiculo2 = new Veiculo("2");
        Veiculo veiculo3 = new Veiculo("3");
        Veiculo veiculo4 = new Veiculo("4");
        Veiculo veiculo5 = new Veiculo("5");
        Cadastro cadastro = new Cadastro(5);
        cadastro.adiciona(veiculo1);
        cadastro.adiciona(veiculo2);
        cadastro.adiciona(veiculo3);
        cadastro.adiciona(veiculo4);
        cadastro.adiciona(veiculo5);
        cadastro.adiciona(veiculo5);
        System.out.println(cadastro);
    }
}