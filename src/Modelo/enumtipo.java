package Modelo;


/**
 *
 * @author abiga
 */
   public enum enumtipo {
    Plataformas("P"),
    Cajas("C"),
    Preferencial("A");

    private final String codigo;

    private enumtipo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }
}

