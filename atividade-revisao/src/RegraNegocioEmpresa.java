import java.util.ArrayList;

public class RegraNegocioEmpresa {

    private ArrayList<Empresa> empresas= new ArrayList<Empresa>();


    public void cadastrarEmpresa(String nome, String cnpj, String telefone) {
        Empresa empresa = new Empresa(nome, cnpj, telefone);
        empresas.add(empresa);
        System.out.println("Empresa cadastrada com sucesso!");
    }

    public ArrayList<Empresa> listarEmpresas() {
        for (Empresa empresa : empresas) {
            System.out.println("Nome: " + empresa.getNome());
            System.out.println("CNPJ: " + empresa.getCnpj());
            System.out.println("Telefone: " + empresa.getTelefone());
            System.out.println("--------------------");
        }

        return this.empresas;
    
}
}
