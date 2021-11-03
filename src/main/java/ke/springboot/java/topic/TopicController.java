package ke.springboot.java.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@RequestMapping("/topics")
	public List getAllTopics() {
		return Arrays.asList(
				new Topic("harry", "Harry Potter", "Harry and his friends at school of magic"),
				new Topic("bilbo", "The Hobbit", "Small person helps less smaller people get home"),
				new Topic("thrones", "Game of Thrones", "Dragons, White Walkers and a really good looking queen"),
				new Topic("rings", "Long of the Rings", "Some small people going to take a ring into a volcano")
				);
	}

}
