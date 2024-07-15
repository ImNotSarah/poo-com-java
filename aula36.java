public class aula36 {
    
}

class Funcionario {

    // Atributo
    double salario = 0;

    //Método void (vazio -> Método sem retorno)
    // Método com retorno
    // Método com parâmetro
    double calcularSalarioComDesconto( double bonus ){

        /*
        1000 até 2000 (8%)
        2000 até 3000 (9%)
        ...
        * */
        double totalComDesconto = salario - 20 + bonus;

        return totalComDesconto;
        //System.out.println("Total com desconto: " + totalComDesconto);

    }

}

class CarrinhoCompras {

    double calcularValorFrete( String cep ){

        //Calculo do frete
        return 20;

    }

}

class Scratch {
    public static void main(String[] args) {

        CarrinhoCompras carrinho = new CarrinhoCompras();
        double valorFrete = carrinho.calcularValorFrete( "05021-520" );

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
