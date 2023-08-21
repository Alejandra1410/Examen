package Controlador;

/**
 *
 * @author abiga
 */
import java.util.ArrayList;
import java.util.List;

public class ControladorTickets {
    private List<String> ticketQueue = new ArrayList<>();

    private void Generarticket() {
        int newTicketNumber = ticketQueue.size() + 1;
        String newTicket = "Ticket #" + newTicketNumber;
        ticketQueue.add(newTicket);
        System.out.println("Nuevo ticket generado: " + newTicket);
    }

    private void Atender() {
        if (!ticketQueue.isEmpty()) {
            String ticketToProcess = ticketQueue.remove(0);
            System.out.println("Atendiendo ticket: " + ticketToProcess);
        } else {
            System.out.println("No hay tickets pendientes para atender.");
        }
    }
}

    
