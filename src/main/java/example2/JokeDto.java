package example2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class JokeDto {
    private String [] categories;
    private String created_at;
    private String icon_url;
    private String id;
    private String updated_at;
    private String url;
    private String value;
}
