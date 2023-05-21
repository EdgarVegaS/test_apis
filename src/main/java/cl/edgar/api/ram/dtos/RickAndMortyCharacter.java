package cl.edgar.api.ram.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RickAndMortyCharacter {

    private int id;
    private String name;
    private String status;
    private String species;
    private String type;
    private String gender;
    private RickAndMortyOrigin origin;
    private RickAndMortyLocation location;
    private String image;
    private List<String> episode = new ArrayList<>();
    private String url;
    private LocalDate created;

}
