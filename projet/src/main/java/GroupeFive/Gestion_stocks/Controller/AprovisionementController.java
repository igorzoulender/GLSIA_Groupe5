package GroupeFive.Gestion_stocks.Controller;

import GroupeFive.Gestion_stocks.Model.*;
import GroupeFive.Gestion_stocks.Service.*;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;


import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
@RequestMapping("/aprovisionement")
public class AprovisionementController {
    @Autowired
    private AprovisionementService aprovisionementService;

    @Autowired
    private ArticleService articleService;


    @GetMapping("/all")
    public String GetAllAprovisionement(Model model) {
        model.addAttribute("aprovisionements", aprovisionementService.AfficherArticleaprovisioner());
        return "Aprovisionement/ListAprovisionement";
    }


    @PostMapping("/aprovisioner")
    public String AprovisionerArticle(Aprovisionement aprovisionement) {
        aprovisionement.setDateApprovision(LocalDate.now());
        aprovisionementService.Faireaprovisionement(aprovisionement);
        return "redirect:/aprovisionement/all";
    }

    @GetMapping("/update/{IdArticle}")
    public String UpdateAprovisionement(@PathVariable("IdArticle") Integer IdArticle, Model model){
        model.addAttribute("article", articleService.FindArticleById(IdArticle));
        return "aprovisionement/UpdateAprovisionement";
    }

    @DeleteMapping("/delete/{idAprovisionement}")
    public String DeleteAprovisionement(@PathVariable("idAprovisionement") Integer idAprovisionement) {
        aprovisionementService.deleteApprovisionnement(idAprovisionement);
        return "redirect:/aprovisionement/all";

    }

}
