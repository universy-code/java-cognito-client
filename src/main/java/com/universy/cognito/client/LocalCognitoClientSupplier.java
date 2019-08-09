package com.universy.cognito.client;

import com.amazonaws.services.cognitoidp.AWSCognitoIdentityProvider;

public class LocalCognitoClientSupplier implements CognitoClientSupplier {

    @Override
    public AWSCognitoIdentityProvider get() {
        throw new UnsupportedOperationException("Not implemented yet.");
    }
}
