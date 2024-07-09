import java.util.ArrayList;

public class RegraNegocioFuncionario {

 private ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

    public void cadastrarFuncionario (String nome, String cpf, String rg, String telefone, Empresa empresa) {
        Funcionario funcionario = new Funcionario(nome, cpf, rg, telefone, empresa);
        funcionarios.add(funcionario);
        System.out.println("Funcionário cadastrado com sucesso!");
    }

    public void listarFuncionarios() {
        for (Funcionario funcionario : funcionarios) {
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("CPF: " + funcionario.getCpf());
            System.out.println("RG: " + funcionario.getRg());
            System.out.println("Telefone: " + funcionario.getTelefone());
            System.out.println("Empresa: " + funcionario.getEmpresa());
            System.out.println("--------------------");
        }
    }

    
}

    

