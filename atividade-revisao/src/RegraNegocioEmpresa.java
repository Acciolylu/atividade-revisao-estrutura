import java.util.ArrayList;
import java.util.List;

public class RegraNegocioEmpresa {

    private ArrayList<Empresa> empresas= new ArrayList<Empresa>();


    public void cadastrarEmpresa(String nome, String cnpj, String telefone) {
        Empresa empresa = new Empresa(nome, cnpj, telefone);
        empresas.add(empresa);

    }

    public List<Empresa> listarEmpresas() {
        return empresas;
    }

        
    
}
