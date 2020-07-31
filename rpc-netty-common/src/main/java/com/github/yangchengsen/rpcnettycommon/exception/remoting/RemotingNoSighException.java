package com.github.yangchengsen.rpcnettycommon.exception.remoting;


public class RemotingNoSighException extends RemotingException {


	public RemotingNoSighException(String message) {
        super(message, null);
    }


    public RemotingNoSighException(String message, Throwable cause) {
        super(message, cause);
    }

}
