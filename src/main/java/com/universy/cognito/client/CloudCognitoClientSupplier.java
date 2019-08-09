package com.universy.cognito.client;

import com.amazonaws.regions.Regions;
import com.amazonaws.services.cognitoidp.AWSCognitoIdentityProvider;
import com.amazonaws.services.cognitoidp.AWSCognitoIdentityProviderClientBuilder;
import com.universy.cognito.environment.CognitoEnvironment;

public class CloudCognitoClientSupplier implements CognitoClientSupplier {

    @Override
    public AWSCognitoIdentityProvider get() {
        return AWSCognitoIdentityProviderClientBuilder
                .standard()
                .withRegion(Regions.fromName(CognitoEnvironment.getCognitoRegion()))
                .build();
    }
}
