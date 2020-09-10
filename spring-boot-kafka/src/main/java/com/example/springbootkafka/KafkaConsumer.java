package com.example.springbootkafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @author ynx
 * @version V1.0
 * @date 2020-09-10
 */
@Component
public class KafkaConsumer {
    protected static final Logger logger = LoggerFactory.getLogger(KafkaConsumer.class);

    /**
     * 监听kafka topic
     * @param record
     */
    @KafkaListener(topics = {"#{'${topics.canal}'.split(',')}"},concurrency = "${topics.canal.concurrency}")
    public void listenExample(ConsumerRecord<String, String> record) {
        logger.info("in:" + record.topic());
        logger.info(record.value());
        String message = record.value();
    }
}
