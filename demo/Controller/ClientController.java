package AT_Java.demo.Controller;


import AT_Java.demo.model.Client;
import AT_Java.demo.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    ClientService clientService;
    @GetMapping
    public List<Client> getAll(){
        List<Client> clients = clientService.getAll();
        return clients;
    }

    @PostMapping
    public void create(@RequestBody Client client){
        clientService.create(client);
    }
}
