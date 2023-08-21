package Modelo;

/**
 *
 * @author abiga
 */
public class AdministracionTickets {
    private String tickets;
    private String numero;
    private String tipo;

    public AdministracionTickets(String tickets, String numero, String tipo) {
        this.tickets = tickets;
        this.numero = numero;
        this.tipo = tipo;  
    }

    public AdministracionTickets(String numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
    }
    
    public String getTickets() {
        return tickets;
    }

    public String getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTickets(String tickets) {
        this.tickets = tickets;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
