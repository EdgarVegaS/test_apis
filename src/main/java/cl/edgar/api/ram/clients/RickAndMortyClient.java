package cl.edgar.api.ram.clients;

import cl.edgar.api.ram.dtos.RickAndMortyCharacter;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient( name = "apirick", url = "${rest.service.rickandmorty}")
public interface RickAndMortyClient {

    @GetMapping("/character/{id}")
    RickAndMortyCharacter obtenerPersonaje(@PathVariable String id);

}
