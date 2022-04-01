package comodcode.apis.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("api/v1")
@AllArgsConstructor
public class ApiController {
    private RestTemplate restTemplate;
    @GetMapping("/chuck/categories")
    public Object getJokeCategories(){

        return restTemplate.getForObject("https://api.chucknorris.io/jokes/categories", Object.class);
    }
    @GetMapping("/swapi/people")
    public Object getStarWarsActors(){
       return restTemplate.getForObject("https://swapi.dev/api/people/",Object.class);
    }

    @GetMapping("/search")
    public Object getList(@RequestParam (value = "query") String query){
        return restTemplate.getForObject("https://swapi.dev/api/people/",Object.class);
    }
}
