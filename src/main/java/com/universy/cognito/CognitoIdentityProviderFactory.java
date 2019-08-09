package com.universy.cognito;

import com.amazonaws.services.cognitoidp.AWSCognitoIdentityProvider;
import com.universy.cognito.client.CloudCognitoClientSupplier;
import com.universy.cognito.client.CognitoClientSupplier;
import com.universy.cognito.client.LocalCognitoClientSupplier;
import com.universy.cognito.environment.CognitoEnvironment;

public class CognitoIdentityProviderFactory {

    public static AWSCognitoIdentityProvider createMapper() {
        CognitoClientSupplier cognitoClientSupplier;

        if (isLocalStage()) {
            cognitoClientSupplier = new LocalCognitoClientSupplier();
        } else {
            cognitoClientSupplier = new CloudCognitoClientSupplier();
        }
        return cognitoClientSupplier.get();
    }

    private static boolean isLocalStage() {
        return CognitoEnvironment.getStage().contains("local");
    }
}
