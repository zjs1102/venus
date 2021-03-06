/**
 * 
 */
package com.meidusa.venus.exception;

import com.meidusa.venus.annotations.RemoteException;


/**
 * 
 * 
 * @author Sun Ning
 * @version 2010-3-4
 */
@RemoteException(errorCode=VenusExceptionCodeConstant.SERVICE_NOT_FOUND)
public class ServiceNotFoundException extends AbstractVenusException {
    private static final long serialVersionUID = 1L;

    public ServiceNotFoundException(String msg) {
        super(msg);
    }

    public ExceptionLevel getLevel() {
        return ExceptionLevel.INFO;
    }

    @Override
    public int getErrorCode() {
        return VenusExceptionCodeConstant.SERVICE_NOT_FOUND;
    }
}
