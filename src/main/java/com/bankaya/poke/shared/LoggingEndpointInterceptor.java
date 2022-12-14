package com.bankaya.poke.shared;

import com.bankaya.poke.domain.LogEntity;
import com.bankaya.poke.domain.LogRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ws.context.MessageContext;
import org.springframework.ws.server.EndpointInterceptor;
import org.springframework.ws.server.endpoint.MethodEndpoint;

import java.time.LocalDateTime;

@Component
public class LoggingEndpointInterceptor implements EndpointInterceptor {

    private static final Logger LOG = LoggerFactory.getLogger(LoggingEndpointInterceptor.class);

    @Autowired
    private LogRepository repository;


    @Override
    public boolean handleRequest(MessageContext messageContext, Object endpoint) throws Exception {

        if (endpoint instanceof MethodEndpoint) {
            LogEntity entity = new LogEntity();
            entity.setMethod(((MethodEndpoint) endpoint).getMethod().getName());
            entity.setExecutionDate(LocalDateTime.now());
            entity.setIp(Context.ip.get());
            repository.save(entity);
        }
        return true;
    }

    @Override
    public boolean handleResponse(MessageContext messageContext, Object endpoint) throws Exception {
        LOG.info("Endpoint Response Handling");
        return true;
    }

    @Override
    public boolean handleFault(MessageContext messageContext, Object endpoint) throws Exception {
        LOG.info("Endpoint Exception Handling");
        return true;
    }

    @Override
    public void afterCompletion(MessageContext messageContext, Object endpoint, Exception ex) throws Exception {
        LOG.info("Execute code after completion");
    }
}