package cl.edgar.api.ram.controllers;

import cl.edgar.api.ram.dtos.LolSummoner;
import cl.edgar.api.ram.services.LolSummonerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/summoner")
@RequiredArgsConstructor
public class LolSummonerController {

    private final LolSummonerService service;

    @GetMapping("/{name}")
    public LolSummoner obtenerSummonerPorNombre(@PathVariable final String name){
        return this.service.obtenerSummonerPorNombre(name);
    }

}
