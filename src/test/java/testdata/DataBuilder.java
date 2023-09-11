package testdata;

import com.github.javafaker.Faker;

public class DataBuilder {
    private static final Faker FAKER = new Faker();
    public static DataVariable getData() {
        return DataVariable.builder()
                .email(FAKER.internet().emailAddress())
                .password(FAKER.internet().password())
                .build();
    }
}


