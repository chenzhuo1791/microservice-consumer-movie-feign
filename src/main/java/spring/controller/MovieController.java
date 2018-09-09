package spring.controller;

import spring.client.UserFeignClient;
import spring.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

	private Logger logger = LoggerFactory.getLogger(MovieController.class);

	@Autowired
	private UserFeignClient userFeignClient ;

	@GetMapping("/findUser/{userId}")
	public User findUserById(@PathVariable Long userId){
		User user = userFeignClient.findById(userId);
		logger.info(" result :" + user);
		return user ;
	}

}
