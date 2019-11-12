package com.java;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@RequestMapping("/topics")
	public List<Topic> getAllTopics()
	{
		return Arrays.asList(
				new Topic("Spring","Spring Framework","Spring Framework Desc"),
				new Topic("Java","Core Java Framework","java Framework Desc"),
				new Topic("Javascript","Javascript Framework","Javascript Desc")
				
				);
	}
	


}
