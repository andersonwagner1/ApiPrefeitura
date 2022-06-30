package br.com.prefeitura.diadema.exception;

import java.util.HashMap;
import java.util.Map;

public abstract class BaseRuntimeException extends RuntimeException implements MessageException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final Map<String, Object> mapDetails;

    public BaseRuntimeException() {
        mapDetails = null;
    }
    public BaseRuntimeException(final Map<String, Object> mapDetails) {
        this.mapDetails = mapDetails;
    }
    
    public BaseRuntimeException(String details){
    	Map<String, Object> mapDetails = new HashMap<String, Object>();
    	mapDetails.put("1", details);
    	this.mapDetails = mapDetails;
    }

    public abstract String getExceptionKey();

    public Map<String, Object> getMapDetails() {
        return this.mapDetails;
    }
}