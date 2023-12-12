package moldes;

import interfaces.ICamareira;

public class Camareira extends Pessoa implements ICamareira {

    public Camareira(String nome, String telefone, String cpf) {
        super(nome, telefone, cpf);
    }

    @Override
    public void arrumarACama() {
        System.out.println("Arrumando a cama");
        System.out.println();
    }

    @Override
    public void limparQuarto() {
        System.out.println("Limpando o quarto");
        System.out.println();
    }
    
}
