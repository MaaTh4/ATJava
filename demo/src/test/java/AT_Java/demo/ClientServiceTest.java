package AT_Java.demo;

import AT_Java.demo.model.Client;
import AT_Java.demo.service.ClientService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ClientServiceTest {

@Autowired
ClientService clientService;

@Test
@DisplayName("Retornar todos os clientes")
void returnAllClients(){
    List<Client> clients = clientService.getAll();
    assertEquals(3, clients.size());
}

}
