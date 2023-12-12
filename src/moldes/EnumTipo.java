package moldes;

public enum EnumTipo {
    
    BASICO("Básico"), MASTER("Master"), LUXO("Luxo");

    private String valor;

    private EnumTipo(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

}
