import java.util.ArrayList;
import java.util.List;

public class RegraNegocioFuncionario {

private ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

    public void cadastrarFuncionario (String nome, String cpf, String rg, String telefone, Empresa empresa) {
        Funcionario funcionario = new Funcionario(nome, cpf, rg, telefone, empresa);
        funcionarios.add(funcionario);

    }

    public List<Funcionario> listarFuncionarios() {
        return funcionarios;
    }

    
}

