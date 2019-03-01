package org.cxfttest.presentation.api;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.cxfttest.presentation.models.Developer;

public class DeveloperServiceImpl implements DeveloperService {
	
	private Properties properties;

	public Developer getDevelopers() {

		Producer<String, String> producer = null;
		try {
			producer = new KafkaProducer<String, String>(properties);
			for (int i = 0; i < 3; i++) {
				String msg = "Message " + i;
				producer.send(new ProducerRecord<String, String>("HelloKafkaTopic", msg));
			}
			
		} catch (Exception e) {
			//TODO handle logging
			e.printStackTrace();

		} finally {
			producer.close();
		}

		return new Developer("Domenico","java");
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

}
