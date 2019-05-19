package guru.springframework.joke.jokeapp.controller;

import guru.springframework.joke.jokeapp.service.ChuckNorrisQuotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private ChuckNorrisQuotesService chuckNorrisQuotesService;

    public JokesController() {
    }

    @Autowired
    public JokesController(ChuckNorrisQuotesService chuckNorrisQuotesService) {
        this.chuckNorrisQuotesService = chuckNorrisQuotesService;
    }


    @RequestMapping({"/",""})
    public String jokesView(Model model){
        model.addAttribute("joke",chuckNorrisQuotesService.getJoke());
        return "chucknorris";
    }
}
