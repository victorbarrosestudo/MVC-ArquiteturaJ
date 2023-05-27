package br.fatecrl.mvcdemo.controller;

import br.fatecrl.mvcdemo.model.DogsModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/DogsForAdoption")
public class DogsApiController {

    public List<DogsModel> dogs = new ArrayList<DogsModel>();

    public DogsApiController(){
        dogs.add(new DogsModel("Donatello", "S/R", 8, "Grande Porte", "Humor Instável"));
        dogs.add(new DogsModel("Chico", "S/R", 1, "Médio Porte", "Humor Amigável. Gosta de crianças."));
        dogs.add(new DogsModel("Luna", "Pastor Alemão", 5, "Grande Porte", "Brava"));
    }

    @GetMapping
    public List<DogsModel> getDogs(){
        return dogs;
    }
}