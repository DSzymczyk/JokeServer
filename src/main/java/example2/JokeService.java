package example2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Service
@Slf4j
public class JokeService {

    private RestTemplate restTemplate = new RestTemplate();

    public JokeTrueDto getJoke(){
        HttpHeaders headers = new HttpHeaders();
        headers.add("user-agent", "Application");
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> entity = new HttpEntity<>(headers);
        ResponseEntity<JokeDto> responseJson = restTemplate.exchange("https://api.chucknorris.io/jokes/random", HttpMethod.GET, entity, JokeDto.class);
        JokeDto response = responseJson.getBody();
        return JokeTrueDto.builder()
                .id(response.getId())
                .icon_url(response.getIcon_url())
                .value(response.getValue())
                .created_at(response.getCreated_at())
                .url(response.getUrl())
                .build();
    }
}
