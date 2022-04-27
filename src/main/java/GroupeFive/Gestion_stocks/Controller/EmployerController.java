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
@RequestMapping("/Employer")
public class EmployerController {

    @Autowired
    private EmployerService employerService;

    @GetMapping("/All")
    public ResponseEntity<List<Employer>> GetAllEmployer() {
        List<Employer> employer = employerService.AfficherEmployer();
        return new ResponseEntity<>(employer, HttpStatus.OK);
    }

    @PostMapping("/Create")
    public ResponseEntity<Employer> addEmployer(@RequestBody Employer employer) {
        Employer newEmployer = employerService.AjouterEmployer(employer);
        return new ResponseEntity<>(newEmployer, HttpStatus.CREATED);
    }

    @GetMapping("/Find/{id}")
    public ResponseEntity<Employer> TrouverEmployerbyId(@PathVariable("idEmployer") Integer idEmployer){
        Employer FindEmployer = employerService.FindEmployerById(idEmployer);
        return new ResponseEntity<>(FindEmployer,HttpStatus.OK); 
    }
    
    @PutMapping("/Update")
    public ResponseEntity<Employer> UpdateEmployer(@RequestBody Employer employer){
        Employer updateEmployer = employerService.UpdateEmployer(employer);
        return new ResponseEntity<>(updateEmployer,HttpStatus.OK); 
    
    }

    @DeleteMapping("/Delete/{id}")
    public ResponseEntity<Employer> DeleteEmployer(@PathVariable("id_Employer") Integer idEmployer){
        employerService.DeleteEmployer(idEmployer);
        return new ResponseEntity<>(HttpStatus.OK); 
    }
    
}
