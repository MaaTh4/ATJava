package AT_Java.demo.service;

import AT_Java.demo.model.Client;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ClientService {
    private Map<Long, Client> clients = initClients();

    private Map<Long, Client> initClients(){
        Client pedro = new Client(1L, "Pedro", "12345678901");
        Client fernando = new Client(2L, "Fernando", "98765432110");
        Client lucas = new Client(3L, "Lucas", "68755401917");
        Map<Long,Client> clients = Map.of(1L,pedro,2L,fernando,3L,lucas);
        return clients;


    }

    public List<Client> getAll() {
        return clients.values().stream().toList();
    }
}
