package GroupeFive.Gestion_stocks.Controller;
import GroupeFive.Gestion_stocks.Model.*;
import GroupeFive.Gestion_stocks.Service.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@Controller
@RequestMapping("/Client")

public class ClientController {
    @Autowired
    private ClientService clientService;

    @GetMapping("/All")
    public ResponseEntity<List<Client>> GetAllClient() {
        List<Client> client = clientService.AfficherClient();
        return new ResponseEntity<>(client, HttpStatus.OK);
    }


    @PostMapping("/Create")
    public ResponseEntity<Client> addClient(@RequestBody Client client) {
        Client newClient = clientService.AjouterClient(client);
        return new ResponseEntity<>(newClient, HttpStatus.CREATED);
    }

    @GetMapping("/Find/{id}")
    public ResponseEntity<Client> TrouverClientbyId(@PathVariable("idClient") Integer idClient){
        Client FindClient = clientService.FindClientById(idClient);
        return new ResponseEntity<>(FindClient,HttpStatus.OK); 
    }

    @PutMapping("/Update")
    public ResponseEntity<Client> UpdateClient(@RequestBody Client client){
        Client updateClient = clientService.UpdateClient(client);
        return new ResponseEntity<>(updateClient,HttpStatus.OK); 
    
    }

    @DeleteMapping("/Delete/{id}")
    public ResponseEntity<Client> DeleteClient(@PathVariable("id_Client") Integer idClient){
        clientService.DeleteClient(idClient);
        return new ResponseEntity<>(HttpStatus.OK); 
    }
    
}
