package testdata;

import com.github.javafaker.Faker;

public class DataBuilder {
    private static final Faker FAKER = new Faker();
    public static DataFormat getData() {
        return DataFormat.builder()
                .email(FAKER.internet().emailAddress())
                .password(FAKER.internet().password())
                .build();
    }
}


