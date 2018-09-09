package spring.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.model.User;

@FeignClient(name="microservice-provider-user")
public interface UserFeignClient {

    @RequestMapping("/{id}/showUser")
    User findById(@PathVariable("id") Long id);

}
