package AT_Java.demo.service;

import AT_Java.demo.model.Client;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ClientService {

    private Map<Long, Client> clients = initClients();
    private Long lastId = 3L;


    private Map<Long, Client> initClients() {
        Client pedro = new Client(1L, "Pedro", "12345678901");
        Client fernando = new Client(2L, "Fernando", "98765432110");
        Client lucas = new Client(3L, "Lucas", "68755401917");
         //Map.of(1L, pedro, 2L, fernando, 3L, lucas);
        Map<Long, Client> clients = new HashMap<>();
        clients.put(1L, pedro); clients.put(2L, fernando); clients.put(3L, lucas);

        return clients;


    }

    public List<Client> getAll() {
        return clients.values().stream().toList();
    }

    public Client getById(Long Id) {
        Client client = clients.get(Id);
        return client;
    }

    public void deleteById(long ID) {
        clients.remove(ID);

    }

    public void update(long Id, Client client) {
    clients.replace(Id, client);
    }

    public Long getLastID(){
        return this.lastId;
    }

    public void incrementsLastId() {
        this.lastId++;
    }

    public void create(Client client) {
        Long id = ++this.lastId;
        client.setId(id);
        clients.put(client.getId(), client);
        lastId++;
    }
}

