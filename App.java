import moldes.Camareira;
import moldes.Cliente;
import moldes.EnumTipo;
import moldes.Gerente;
import moldes.Quarto;
import moldes.Recepicionista;

public class App {
    public static void main(String[] args) {
        System.out.println("Hotel Java!");
        System.out.println();

        Cliente cliente1 = new Cliente("Gabriel", "24981339021", "16836337765");

        Recepicionista recepicionista1 = new Recepicionista("Maria", "24981339021", "16836337765");

        recepicionista1.atenderOTelefone();
        recepicionista1.falarIngles();

        Camareira camareira1 = new Camareira("Joana", "24981339021", "16836337765");
        camareira1.arrumarACama();
        camareira1.limparQuarto();

        // Deu uma dor de barriga na Joana
        Gerente gerente1 = new Gerente("Luiz", "24981339021", "16836337765");

        gerente1.atenderOTelefone();
        gerente1.falarIngles();
        gerente1.arrumarACama();
        gerente1.limparQuarto();

        Quarto quarto1 = new Quarto();
        quarto1.setNumero("206A");   
        quarto1.setTipo(EnumTipo.BASICO);
        quarto1.setValor(100.00);

        Quarto quarto2 = new Quarto();
        quarto2.setNumero("306A");   
        quarto2.setTipo(EnumTipo.MASTER);
        quarto2.setValor(200.00);

        System.out.println("Quarto 2: " + quarto2.getTipo());
        System.out.println("Quarto 2: " + quarto2.getValor());
    }
}
