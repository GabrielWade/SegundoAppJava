package moldes;

import interfaces.IRecepicionista;

public class Recepicionista extends Pessoa implements IRecepicionista {

    public Recepicionista(String nome, String telefone, String cpf) {
        super(nome, telefone, cpf);
    }

    @Override
    public void atenderOTelefone() {
        System.out.println("Atendendo o telefone");
        System.out.println();
    }

    @Override
    public void falarIngles() {
        System.out.println("Falando inglês");
        System.out.println();
    }
    
}
