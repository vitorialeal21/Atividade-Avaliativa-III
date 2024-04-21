import javax.swing.JOptionPane;
import java.util.HashMap;

public class People {
    private String nome;
    private String cargo;
    private String habilidades;
    private int idade;
    private String sexo;
    private String endereco;
    private String cidade;
    private String estado;

    // HashMaps para armazenar contagem de informações
    private static HashMap<String, Integer> porCidade = new HashMap<>();
    private static HashMap<String, Integer> porCargo = new HashMap<>();
    private static HashMap<String, Integer> porSexo = new HashMap<>();
    private static HashMap<String, Integer> porEstado = new HashMap<>();

    // Construtor para definir o nome, cargo, habilidades, idade, sexo, endereço, cidade e estado de Ana
    public People(String nome, String cargo, String habilidades, int idade, String sexo, String endereco, String cidade, String estado) {
        this.nome = nome;
        this.cargo = cargo;
        this.habilidades = habilidades;
        this.idade = idade;
        this.sexo = sexo;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;

        // Atualiza os HashMaps com as informações de Ana
        atualizarRelatorio(porCidade, cidade);
        atualizarRelatorio(porCargo, cargo);
        atualizarRelatorio(porSexo, sexo);
        atualizarRelatorio(porEstado, estado);
    }

    // Método privado para atualizar os HashMaps com as informações de Ana
    private void atualizarRelatorio(HashMap<String, Integer> relatorio, String info) {
        relatorio.put(info, relatorio.getOrDefault(info, 0) + 1);
    }

    // Método estático para imprimir o relatório por cidade
    public static void relatorioPorCidade() {
        System.out.println("Relatório por Cidade:");
        for (String cidade : porCidade.keySet()) {
            System.out.println(cidade + ": " + porCidade.get(cidade));
        }
    }

    // Método estático para imprimir o relatório por cargo
    public static void relatorioPorCargo() {
        System.out.println("Relatório por Cargo:");
        for (String cargo : porCargo.keySet()) {
            System.out.println(cargo + ": " + porCargo.get(cargo));
        }
    }

    // Método estático para imprimir o relatório por sexo
    public static void relatorioPorSexo() {
        System.out.println("Relatório por Sexo:");
        for (String sexo : porSexo.keySet()) {
            System.out.println(sexo + ": " + porSexo.get(sexo));
        }
    }

    // Método estático para imprimir o relatório por estado
    public static void relatorioPorEstado() {
        System.out.println("Relatório por Estado:");
        for (String estado : porEstado.keySet()) {
            System.out.println(estado + ": " + porEstado.get(estado));
        }
    }

    // Método main para teste
    public static void main(String[] args) {
        // Criando instâncias de People para Ana
        People ana1 = new People("Ana", "Gerente de Projetos", "Liderança, Gestão de Equipe, Planejamento Estratégico", 35, "Feminino", "Rua Principal, 123", "São Paulo", "São Paulo");
        People ana2 = new People("Ana", "Gerente de Projetos", "Liderança, Gestão de Equipe, Planejamento Estratégico", 35, "Feminino", "Rua Principal, 123", "São Paulo", "São Paulo");
        People ana3 = new People("Ana", "Gerente de Projetos", "Liderança, Gestão de Equipe, Planejamento Estratégico", 35, "Feminino", "Rua Principal, 123", "São Paulo", "São Paulo");
        People ana4 = new People("Ana", "Analista de Dados", "Análise de Dados, Estatística", 30, "Feminino", "Rua Principal, 123", "São Paulo", "São Paulo");
        People ana5 = new People("Ana", "Desenvolvedora de Software", "Java, Python, JavaScript", 28, "Feminino", "Rua Principal, 123", "Campinas", "São Paulo");

        // Imprimindo relatórios
        relatorioPorCidade();
        System.out.println();
        relatorioPorCargo();
        System.out.println();
        relatorioPorSexo();
        System.out.println();
        relatorioPorEstado();
    }
}