package testdata;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class DataFormat {
    private String email;
    private String password;
}
