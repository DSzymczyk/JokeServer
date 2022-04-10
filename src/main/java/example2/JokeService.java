package example2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class JokeService {

    private RestTemplate restTemplate = new RestTemplate();

    public JokeTrueDto getJoke(){
        JokeDto response = restTemplate.getForObject("https://api.chucknorris.io/jokes/random",JokeDto.class);
        return JokeTrueDto.builder()
                .id(response.getId())
                .icon_url(response.getIcon_url())
                .value(response.getValue())
                .created_at(response.getCreated_at())
                .url(response.getUrl())
                .build();
    }
}
