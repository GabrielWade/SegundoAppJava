package moldes;

import interfaces.ICamareira;
import interfaces.IRecepicionista;

public class Gerente extends Pessoa implements ICamareira, IRecepicionista{

    public Gerente(String nome, String telefone, String cpf) {
        super(nome, telefone, cpf);
    }

    @Override
    public void atenderOTelefone() {
        System.out.println("Atendendo o telefone mais ou menos");
        System.out.println();
    }

    @Override
    public void falarIngles() {
        System.out.println("Falando inglês muito bem");
        System.out.println();
    }

    @Override
    public void arrumarACama() {
        System.out.println("Arrumando a cama muito mal");
        System.out.println();
    }

    @Override
    public void limparQuarto() {
        System.out.println("Limpando o quarto mais ou menos");
        System.out.println();
    }
        
}
