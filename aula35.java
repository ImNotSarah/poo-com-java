public class aula35 {

}
    
class Jogador {//Modelo utilizar Upper Camel Case

    //Atributos (utilizam Lower Camel Case)
    String kart;
    String pneu;
    String planador;

    //Métodos (ações)
    void acelerar(){
        System.out.println("Acelerar: " + pneu );
    }

}

class Aula {
    public static void main(String[] args) {

        //Criar Instancia de um Objeto
        Jogador sarah = new Jogador();
        sarah.kart = "Normal";
        sarah.pneu = "cross";
        sarah.planador = "paraquedas";

        sarah.acelerar();

        /* Pista */
        Jogador computador = new Jogador();
        computador.pneu = "Avançado";

        computador.acelerar();

    }
}

