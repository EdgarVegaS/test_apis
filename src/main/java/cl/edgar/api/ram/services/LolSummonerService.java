package cl.edgar.api.ram.services;

import cl.edgar.api.ram.dtos.LolSummoner;

public interface LolSummonerService {

    public LolSummoner obtenerSummonerPorNombre(String name);

}
