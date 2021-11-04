package ke.springboot.java.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics = Arrays.asList(
			new Topic("harry", "Harry Potter", "Harry and his friends at school of magic"),
			new Topic("bilbo", "The Hobbit", "Small person helps less smaller people get home"),
			new Topic("thrones", "Game of Thrones", "Dragons, White Walkers and a really good looking queen"),
			new Topic("rings", "Long of the Rings", "Some small people going to take a ring into a volcano")
			);
	
	public List<Topic> getAllTopics () {
		return topics;
	}
	
	public Topic getTopic(String id) {
		//Map over the stream to filter through the list and use a lambda function to match URL id with topic ID
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

}
