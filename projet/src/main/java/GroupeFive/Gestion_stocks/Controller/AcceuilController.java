package GroupeFive.Gestion_stocks.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AcceuilController {
    
    @GetMapping("/Home")
    public String Acceuil()
    {
        return "Acceuil";
    }
}
