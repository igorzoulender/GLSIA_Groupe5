package GroupeFive.Gestion_stocks.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import GroupeFive.Gestion_stocks.Repo.*;
import java.util.List;
import java.util.Optional;
import GroupeFive.Gestion_stocks.Model.*;

@Service
public class EmployerService {
    
    @Autowired
    private final EmployerRepo employerRepo;
    
    public EmployerService(EmployerRepo employerRepo){
        this.employerRepo = employerRepo;
    }

    public Employer AjouterEmployer(Employer employer){
        return employerRepo.save(employer);
    }

    public List<Employer> AfficherEmployer() {
        return employerRepo.findAll();
    }

    public Employer UpdateEmployer(Employer employer){
        return employerRepo.save(employer);
    }

    public Employer FindEmployerById(Integer idEmployer){

        Optional<Employer> optional = employerRepo.findById(idEmployer);
        Employer Employer = null;
        if(optional.isPresent())
        {
            Employer = optional.get();
        }else
        {
            throw new RuntimeException("id introuvable");
        }
        return  Employer;
        
    }

    public void DeleteEmployer(Integer idEmployer){
        employerRepo.deleteById(idEmployer);
    }
}
