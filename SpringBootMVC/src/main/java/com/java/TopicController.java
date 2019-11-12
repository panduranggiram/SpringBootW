package com.java;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@Autowired
	TopicService topicsrvice;

	// Get All Records At a Time
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return topicsrvice.getAllTopic();
	}

	// Get Single Records At a Time
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id) {
		return topicsrvice.getTopic(id);
	}

	// Create new resource
	//i used here @PostMapping insted of @RequestMapping(method = RequestMethod.POST
	@PostMapping(value = "/topics")
	public void addTopic(@RequestBody Topic topic) {
		topicsrvice.addTopic(topic);
	}

	// Update the resource
	@RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
	public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
		topicsrvice.updateTopic(id, topic);
	}

	// Delete single resource
	@RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
	public void deleteTopic(@PathVariable String id) {
		topicsrvice.addTopic(id);
	}

}
