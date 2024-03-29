package com.universy.cognito.client;

import com.amazonaws.services.cognitoidp.AWSCognitoIdentityProvider;

import java.util.function.Supplier;

public interface CognitoClientSupplier extends Supplier<AWSCognitoIdentityProvider> {
}
