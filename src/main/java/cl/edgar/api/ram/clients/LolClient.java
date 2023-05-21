package cl.edgar.api.ram.clients;

import cl.edgar.api.ram.dtos.LolSummoner;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.Map;

@FeignClient(name = "lolApi", url = "${rest.service.lol.summoner}")
public interface LolClient {

    @GetMapping("summoners/by-name/{name}")
    LolSummoner obtenerInvocador(@RequestHeader Map<String, String> headers, @PathVariable String name);

}
