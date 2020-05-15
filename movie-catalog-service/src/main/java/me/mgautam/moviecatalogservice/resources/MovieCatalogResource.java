package me.mgautam.moviecatalogservice.resources;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import me.mgautam.moviecatalogservice.models.CatalogItem;
import me.mgautam.moviecatalogservice.models.Movie;
import me.mgautam.moviecatalogservice.models.Rating;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {


    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId){

        RestTemplate restTemplate = new RestTemplate();

        restTemplate.getForEntity("http://localhost:8083/movies/foo", Movie.class);

        List<Rating> ratings = Arrays.asList(
            new Rating("1234", 4),
            new Rating("5678", 3)
        );

        return ratings.stream().map(rating -> new CatalogItem("Titanic", "some titanic desc", 4))
                .collect(Collectors.toList());
    }
    
}