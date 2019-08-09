package com.universy.cognito.environment;

import com.universy.cognito.environment.exceptions.CorruptCognitoEnvironmentSetUpException;

import java.util.Optional;

public class CognitoEnvironment {

    public static String getCognitoRegion() {
        Optional<String> awsCognitoRegion = Optional.ofNullable(System.getenv("AWS_COGNITO_REGION"));
        return awsCognitoRegion.orElseThrow(CorruptCognitoEnvironmentSetUpException::new);
    }

    public static String getClientID() {
        Optional<String> environment = Optional.ofNullable(System.getenv("CLIENT_ID"));
        return environment.orElseThrow(CorruptCognitoEnvironmentSetUpException::new);
    }

    public static String getStage() {
        Optional<String> environment = Optional.ofNullable(System.getenv("STAGE"));
        return environment.orElseThrow(CorruptCognitoEnvironmentSetUpException::new);
    }
}
