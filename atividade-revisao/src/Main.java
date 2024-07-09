public class Main {
    public static void main(String[] args) {

    RegraNegocioEmpresa e1= new RegraNegocioEmpresa();
    e1.cadastrarEmpresa("VITARELLA"," 465464654","4563-288");
    e1.cadastrarEmpresa("PARACHOQUE"," 4654646458","4893-288");




    RegraNegocioFuncionario f1 = new RegraNegocioFuncionario();
    f1.cadastrarFuncionario ("VINICIUS","4646464646","45465", "4215-5632", e1.listarEmpresas().get(0));
    f1.cadastrarFuncionario ("JOAO","4646464646","45465","4587-6251", e1.listarEmpresas().get(1));


RegraNegocioFuncionario listarF = new RegraNegocioFuncionario();
listarF.listarFuncionarios();


RegraNegocioEmpresa listarE = new RegraNegocioEmpresa():

}
}


