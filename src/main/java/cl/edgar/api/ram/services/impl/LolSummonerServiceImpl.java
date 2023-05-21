package cl.edgar.api.ram.services.impl;

import cl.edgar.api.ram.clients.LolClient;
import cl.edgar.api.ram.dtos.LolSummoner;
import cl.edgar.api.ram.properties.LolSecurityProperties;
import cl.edgar.api.ram.services.LolSummonerService;
import cl.edgar.api.ram.utils.LolApiUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
@RequiredArgsConstructor
public class LolSummonerServiceImpl implements LolSummonerService {

    private final LolClient lolClient;
    private final LolSecurityProperties lolSecurityProperties;
    final static Logger LOGGER = Logger.getLogger(LolSummonerServiceImpl.class.getName());

    @Override
    public LolSummoner obtenerSummonerPorNombre(String name) {
        final var lolSummoner = lolClient.obtenerInvocador(LolApiUtils.obtenerHeaders(lolSecurityProperties.getToken()), name);
        LOGGER.info(lolSummoner.toString());
        return lolSummoner;
    }

}
