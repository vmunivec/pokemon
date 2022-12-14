package com.bankaya.poke.shared;

import org.springframework.util.ObjectUtils;

public interface Notification {

    String getCode();
    String getMessage();
    default ServiceFaultException exception(){
        throw new ServiceFaultException(getNotificationType()
                ,new ServiceFault(getCode(),getMessage()));
    }

    default String getNotificationType(){
        String type = "ERROR";
        if (!ObjectUtils.isEmpty(getCode())){
            if (getCode().startsWith("E_"))
                type = "ERROR";
            if (getCode().startsWith("W_"))
                type = "WARNING";
        }
        return type;
    }
}
