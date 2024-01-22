package com.example.tournoiback;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/tasks")
@CrossOrigin(origins = "http://localhost:4200")
public class HelloController {

    @GetMapping("/list")
    public List<Task> getRandomTask() {
        List<Task> taskList = Arrays.asList(
            new Task("Les Monstres de Marshmallow", false),
            new Task("Les Télégraphistes de la Galaxie", false),
            new Task("Les Centaures Turbulents", false),
            new Task("Les Slalomeurs de la Fantaisie", false),
            new Task("Les Lutins Affamés", false),
            new Task("Les Étrangers Flamboyants", false),
            new Task("Les Cosaques de l’Ouest", false),
            new Task("Les Épéistes du Royaume", false),
            new Task("Les Patineurs de la Révolution", false),
            new Task("Les Gladiateurs du Temps", false),
            new Task("Les Grenouilles de l’Écume", false),
            new Task("Les Vagabonds de l’Espace", false),
            new Task("Les Cœurs Héroïques", false),
            new Task("Les Bandits de l’Aurore", false),
            new Task("Les Mousquetaires des Ténèbres", false),
            new Task("Les Éclaireurs de l’Avenir", false),
            new Task("Les Chevaliers de l’Hiver", false),
            new Task("Les Fous Volants de la Nuit", false),
            new Task("Les Sorciers de l’Orient", false),
            new Task("Les Hiérarques de la Paix", false),
            new Task("Les Cavaliers du Vent", false),
            new Task("Les Cavaliers du Destin", false)
        );

        // Shuffle the list to make the order random.
        shuffleList(taskList);

        // Return the first task from the shuffled list.
        return taskList;
    }

    private void shuffleList(List<Task> list) {
        // Shuffle the list using Collections.shuffle()
        Collections.shuffle(list);
    }



}