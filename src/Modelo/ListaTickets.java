package Modelo;

/**
 *
 * @author abiga
 */
  import java.util.ArrayList;
  import java.util.List;

   public class ListaTickets {

    private List<String> tickets;

    public ListaTickets() {
        tickets = new ArrayList<>();
    }

    public void agregarTicket(String ticket) {
        tickets.add(ticket);
    }

    public void eliminarTicket(String ticket) {
        tickets.remove(ticket);
    }

    public List<String> buscarTicket(String tipo) {
        List<String> ticketsEncontrados = new ArrayList<>();
        
        for (String ticket : tickets) {
            if (ticket.contains(tipo)) {
                ticketsEncontrados.add(ticket);
            }
        }
        
        return ticketsEncontrados;
    }
}
