package GroupeFive.Gestion_stocks.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import GroupeFive.Gestion_stocks.Repo.*;
import java.util.List;
import java.util.Optional;
import GroupeFive.Gestion_stocks.Model.*;

@Service
public class ClientService {

    @Autowired
    private final ClientRepo clientRepo;
    
    public ClientService(ClientRepo clientRepo){
        this.clientRepo = clientRepo;
    }

    public Client AjouterClient(Client client){
        return clientRepo.save(client);
    }

    public List<Client> AfficherClient() {
        return clientRepo.findAll();
    }

    public Client UpdateClient(Client client){
        return clientRepo.save(client);
    }

    public Client FindClientById(Integer idClient){

        Optional<Client> optional = clientRepo.findById(idClient);
        Client client = null;
        if(optional.isPresent())
        {
            client = optional.get();
        }else
        {
            throw new RuntimeException("id introuvable");
        }
        return  client;
        
    }

    public void DeleteClient(Integer idClient){
        clientRepo.deleteById(idClient);
    }
}
