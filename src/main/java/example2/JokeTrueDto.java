package example2;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class JokeTrueDto {
    private String id;
    private String value;
    private String created_at;
    private String icon_url;
    private String url;
}
