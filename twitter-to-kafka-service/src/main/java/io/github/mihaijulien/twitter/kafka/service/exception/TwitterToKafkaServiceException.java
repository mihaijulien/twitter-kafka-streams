package io.github.mihaijulien.twitter.kafka.service.exception;

public class TwitterToKafkaServiceException extends RuntimeException{

    public TwitterToKafkaServiceException(String message){
        super(message);
    }

    public TwitterToKafkaServiceException(String message, Throwable cause){
        super(message, cause);
    }
}
