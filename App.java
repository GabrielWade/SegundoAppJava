import java.util.ArrayList;

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

        // Recepicionista recepicionista1 = new Recepicionista("Maria", "24981339021", "16836337765");

        // recepicionista1.atenderOTelefone();
        // recepicionista1.falarIngles();

        // Camareira camareira1 = new Camareira("Joana", "24981339021", "16836337765");
        // camareira1.arrumarACama();
        // camareira1.limparQuarto();

        // // Deu uma dor de barriga na Joana
        // Gerente gerente1 = new Gerente("Luiz", "24981339021", "16836337765");

        // gerente1.atenderOTelefone();
        // gerente1.falarIngles();
        // gerente1.arrumarACama();
        // gerente1.limparQuarto();

        // Quarto quarto1 = new Quarto();
        // quarto1.setNumero("206A");   
        // quarto1.setTipo(EnumTipo.BASICO);
        // quarto1.setValor(100.00);

        // Quarto quarto2 = new Quarto();
        // quarto2.setNumero("306A");   
        // quarto2.setTipo(EnumTipo.MASTER);
        // quarto2.setValor(200.00);

        // System.out.println("Quarto 2: " + quarto2.getTipo());
        // System.out.println("Quarto 2: " + quarto2.getValor());

        Cliente cliente1 = new Cliente("Gabriel", "24981339021", "16836337765", 17);
        Cliente cliente2 = new Cliente("Luiz", "24981339999", "16836337799", 21);
        Cliente cliente3 = new Cliente("Joana", "24981338888", "16836337788", 40);

        ArrayList<Cliente> clientes = new ArrayList<Cliente>();

        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);

        // Retorna a quantitade de iten na stream
        clientes.stream().count();
        clientes.size();

        clientes.stream().limit(2).forEach(c -> System.out.println(c.getNome()));
        clientes.stream().skip(2).forEach(c -> System.out.println(c.getNome()));;

        //var resultado3 = clientes.stream().sorted();
        // var resultado4 = clientes.stream().sorted(comparing(Cliente::getIdade));

        clientes.stream().filter(c -> c.getIdade() > 20).forEach(c -> System.out.println(c.getNome()));
        clientes.stream().filter(c -> c.getNome().contains("Gabriel")).forEach(c -> System.out.println(c.getNome()));
        clientes.stream().filter(c -> c.getNome().startsWith("J")).forEach(c -> System.out.println(c.getNome()));
    }
}
