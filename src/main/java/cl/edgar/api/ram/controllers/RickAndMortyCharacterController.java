package cl.edgar.api.ram.controllers;

import cl.edgar.api.ram.dtos.RickAndMortyCharacter;
import cl.edgar.api.ram.services.RickAndMortyCharacterService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/personaje")
@RequiredArgsConstructor
public class RickAndMortyCharacterController {

    private final RickAndMortyCharacterService service;

    @GetMapping("/{id}")
    public RickAndMortyCharacter obtenerPersonajePorId(@PathVariable String id){
        return this.service.obtenerPersonajePorId(id);
    }

}
