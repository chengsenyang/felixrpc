package com.github.yangchengsen.rpcnettycommon.exception.remoting;


public class RemotingContextException extends RemotingException {



	public RemotingContextException(String message) {
        super(message, null);
    }


    public RemotingContextException(String message, Throwable cause) {
        super(message, cause);
    }

}
