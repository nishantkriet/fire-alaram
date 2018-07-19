package com.nishant.firealaram.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
@RestController
public class CustomizedResponseEntityException extends ResponseEntityExceptionHandler {


    @ExceptionHandler(Exception.class)
    public final ResponseEntity<Object> handleAllException(Exception ex, WebRequest request)   {

        List<ApiValidationError> apiValidationErrors=new ArrayList<ApiValidationError>();

        //logger.info("Global Exception "+ex.getMessage().toString());

        ApiError apiError = new ApiError(HttpStatus.INTERNAL_SERVER_ERROR);
        apiError.setMessage(ex.getMessage());
        apiError.setHttpStatus(HttpStatus.INTERNAL_SERVER_ERROR);
        apiError.setDebugMessage(ex.getMessage());
        ApiValidationError apiValidationError=new ApiValidationError();
        apiValidationError.setField(ex.getMessage());
        apiValidationError.setMessage(ex.getMessage());
        apiValidationErrors.add(apiValidationError);
        apiError.setSubErrors(apiValidationErrors);
        return new ResponseEntity(apiError, HttpStatus.INTERNAL_SERVER_ERROR);
    }
    //UserPricePlanSubscriptionException
    @ExceptionHandler(AlaramNaotFoundException.class)
    public final ResponseEntity<Object> userDetailException(Exception ex, WebRequest request)   {

        List<ApiValidationError> apiValidationErrors=new ArrayList<ApiValidationError>();

        //logger.info("Global Exception "+ex.getMessage().toString());

        ApiError apiError = new ApiError(HttpStatus.NOT_FOUND);
        apiError.setMessage(ex.getMessage());
        apiError.setHttpStatus(HttpStatus.NOT_FOUND);
        apiError.setDebugMessage(ex.getMessage());
        ApiValidationError apiValidationError=new ApiValidationError();
        apiValidationError.setField(ex.getMessage());
        apiValidationError.setMessage(ex.getMessage());
        apiValidationErrors.add(apiValidationError);
        apiError.setSubErrors(apiValidationErrors);
        return new ResponseEntity(apiError, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(CorporationNotFoundException.class)
    public final ResponseEntity<Object> userPricePlanSubscriptionException(Exception ex, WebRequest request)   {

        List<ApiValidationError> apiValidationErrors=new ArrayList<ApiValidationError>();

        //logger.info("Global Exception "+ex.getMessage().toString());

        ApiError apiError = new ApiError(HttpStatus.NOT_FOUND);
        apiError.setMessage(ex.getMessage());
        apiError.setHttpStatus(HttpStatus.NOT_FOUND);
        apiError.setDebugMessage(ex.getMessage());
        ApiValidationError apiValidationError=new ApiValidationError();
        apiValidationError.setField(ex.getMessage());
        apiValidationError.setMessage(ex.getMessage());
        apiValidationErrors.add(apiValidationError);
        apiError.setSubErrors(apiValidationErrors);
        return new ResponseEntity(apiError, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(BuildingNotFoundException.class)
    public final ResponseEntity<Object> planPricingMappingException(Exception ex, WebRequest request)   {

        List<ApiValidationError> apiValidationErrors=new ArrayList<ApiValidationError>();

        //logger.info("Global Exception "+ex.getMessage().toString());

        ApiError apiError = new ApiError(HttpStatus.NOT_FOUND);
        apiError.setMessage(ex.getMessage());
        apiError.setHttpStatus(HttpStatus.NOT_FOUND);
        apiError.setDebugMessage(ex.getMessage());
        ApiValidationError apiValidationError=new ApiValidationError();
        apiValidationError.setField(ex.getMessage());
        apiValidationError.setMessage(ex.getMessage());
        apiValidationErrors.add(apiValidationError);
        apiError.setSubErrors(apiValidationErrors);
        return new ResponseEntity(apiError, HttpStatus.NOT_FOUND);
    }

   /* @ExceptionHandler(ProductPricingException.class)
    public final ResponseEntity<Object> productPricingException(Exception ex, WebRequest request)   {

        List<ApiValidationError> apiValidationErrors=new ArrayList<ApiValidationError>();

        //logger.info("Global Exception "+ex.getMessage().toString());

        ApiError apiError = new ApiError(HttpStatus.NOT_FOUND);
        apiError.setMessage(ex.getMessage());
        apiError.setHttpStatus(HttpStatus.NOT_FOUND);
        apiError.setDebugMessage(ex.getMessage());
        ApiValidationError apiValidationError=new ApiValidationError();
        apiValidationError.setField(ex.getMessage());
        apiValidationError.setMessage(ex.getMessage());
        apiValidationErrors.add(apiValidationError);
        apiError.setSubErrors(apiValidationErrors);
        return new ResponseEntity(apiError, HttpStatus.NOT_FOUND);
    }*/


}
