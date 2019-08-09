package com.universy.cognito.actions;

import com.amazonaws.AmazonWebServiceResult;
import com.amazonaws.ResponseMetadata;

public interface CognitoAction<T, R extends AmazonWebServiceResult<ResponseMetadata>> {
    R perform(T param);
}
