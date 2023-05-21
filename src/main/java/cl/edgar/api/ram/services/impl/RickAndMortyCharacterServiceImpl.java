package cl.edgar.api.ram.services.impl;

import cl.edgar.api.ram.clients.RickAndMortyClient;
import cl.edgar.api.ram.dtos.RickAndMortyCharacter;
import cl.edgar.api.ram.services.RickAndMortyCharacterService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
@RequiredArgsConstructor
public class RickAndMortyCharacterServiceImpl implements RickAndMortyCharacterService {

    private final RickAndMortyClient rickAndMortyClient;
    final static Logger LOGGER = Logger.getLogger(RickAndMortyCharacterServiceImpl.class.getName());

    @Override
    public RickAndMortyCharacter obtenerPersonajePorId(final String id) {
        final var rickAndMortyCharacter = rickAndMortyClient.obtenerPersonaje(id);
        LOGGER.info(rickAndMortyCharacter.toString());
        return rickAndMortyCharacter;
    }
}
