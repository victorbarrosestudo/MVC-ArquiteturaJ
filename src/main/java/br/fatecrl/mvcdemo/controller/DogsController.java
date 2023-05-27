package br.fatecrl.mvcdemo.controller;


import br.fatecrl.mvcdemo.model.DogsModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/DogsForAdoption")
public class DogsController {

    public List<DogsModel> dogs = new ArrayList<DogsModel>();

    public DogsController() {
        dogs.add(new DogsModel("Donatello", "S/R", 8, "Grande Porte", "Humor Instável"));
        dogs.add(new DogsModel("Chico", "S/R", 1, "Médio Porte", "Humor Amigável. Gosta de crianças."));
        dogs.add(new DogsModel("Luna", "Pastor Alemão", 5, "Grande Porte", "Brava"));
    }

    @GetMapping
    public String getDogsModel(Model model){
        model.addAttribute("dogs",dogs);
        return "DogsForAdoption";
    }
}
