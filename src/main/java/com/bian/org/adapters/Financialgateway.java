package com.bian.org.adapters;


import com.bian.org.restprocessors.impl.*;
import com.bian.org.restutility.Utility;
import com.bian.org.model.error.ApiError;
import com.bian.org.model.error.GenericError;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;


@Component
public class Financialgateway implements JavaDelegate{

    @Autowired
    private Utility utility;

    @Autowired
    private FinancialGatewayRestProcessor restProcessor;

    private final static Logger LOGGER = Logger.getLogger(Financialgateway.class.getName());

     @Override
    public void execute(DelegateExecution execution) throws Exception {
         LOGGER.info("Adapter execution started");
         String request = (String) execution.getVariable("jsonRequest");
         Object response = utility.processMsg(request, restProcessor);
         if(response instanceof ApiError ||  response instanceof GenericError){
            //Failure Path
            throw new RuntimeException("Error occurred in the adapter:"+Financialgateway.class.getName());
         }else{
            //success Path - enrich or transform the respone object here
         }
    }

}
