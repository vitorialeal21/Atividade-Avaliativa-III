import javax.swing.JOptionPane;

public class People {
    private String nome;
    private String cargo;
    private String habilidades;
    private int idade;
    private String sexo;
    private String endereco;
    private String cidade;
    private String estado;
    
    // Construtor para definir o nome, cargo, habilidades, idade, sexo, endereço, cidade e estado de Ana
    public People() {
        this.nome = "Ana";
        this.cargo = "Gerente de Projetos";
        this.habilidades = "Liderança, Gestão de Equipe, Planejamento Estratégico";
        this.idade = 35; // Idade padrão de Ana
        this.sexo = "Feminino"; // Sexo padrão de Ana
        this.endereco = "Rua Principal, 123"; // Endereço padrão de Ana
        this.cidade = "São Paulo"; // Cidade padrão de Ana
        this.estado = "São Paulo"; // Estado padrão de Ana
    }
    
    // Método para coletar informações da pessoa
    public void coletarInformacoes() {
        this.estado = JOptionPane.showInputDialog(null, "Digite o estado de Ana:", "São Paulo");
        String idadeStr = JOptionPane.showInputDialog(null, "Digite a idade de Ana:");
        this.idade = Integer.parseInt(idadeStr);
        this.sexo = JOptionPane.showInputDialog(null, "Digite o sexo de Ana:");
        this.endereco = JOptionPane.showInputDialog(null, "Digite o endereço de Ana:");
        this.cidade = JOptionPane.showInputDialog(null, "Digite a cidade de Ana:");
    }
    
    // Método para exibir as informações da pessoa
    public void exibirInformacoes() {
        JOptionPane.showMessageDialog(null, "Nome: " + nome +
                                            "\nCargo: " + cargo +
                                            "\nHabilidades: " + habilidades +
                                            "\nIdade: " + idade +
                                            "\nSexo: " + sexo +
                                            "\nEndereço: " + endereco +
                                            "\nCidade: " + cidade +
                                            "\nEstado: " + estado);
    }
    
    // Método main para teste
    public static void main(String[] args) {
        People ana = new People();
        ana.coletarInformacoes();
        ana.exibirInformacoes();
    }
}