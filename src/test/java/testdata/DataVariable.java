package testdata;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class DataVariable {
    private String email;
    private String password;
}
