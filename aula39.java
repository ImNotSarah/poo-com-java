public class aula39 {
    
}
class Usuario {

    //Atributos
    String email;
    String senha;

    //Construtor
    Usuario(String email, String senha){
        System.out.println("construtor executado");
        this.email = email;
        this.senha = senha;
    }

    //Método
    void verificarUsuarioLogado(){

    }

}

class Teste {
    public static void main(String[] args) {

        Usuario usuario = new Usuario("sarah@gmail.com", "123454");

        System.out.println("email: " + usuario.email + " senha: " + usuario.senha);

        /*usuario.email = "sarah@gmail.com";
        usuario.senha = "123454";

        usuario.verificarUsuarioLogado();*/


        /*CarrinhoCompras carrinho = new CarrinhoCompras();
        double valorFrete = carrinho.calcularValorFrete( "05021-520" );*/

        //Tela de funcionário
       /* Funcionario sarah = new Funcionario();
        sarah.salario = 1000;// double bonus = 80
        double salarioTotal = sarah.calcularSalarioComDesconto( 80 );

        System.out.println("total salario: " + salarioTotal );*/

        /*//Criar Instancia de um Objeto
        Jogador sarah = new Jogador();
        sarah.kart = "Normal";
        sarah.pneu = "cross";
        sarah.planador = "paraquedas";

        sarah.acelerar();

        */
        /* Pista *//*
        Jogador computador = new Jogador();
        computador.pneu = "Avançado";

        computador.acelerar();

        String nome = "sarah";*/


    }
}
