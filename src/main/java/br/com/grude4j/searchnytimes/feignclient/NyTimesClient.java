package br.com.grude4j.searchnytimes.feignclient;

import br.com.grude4j.searchnytimes.dto.ArticleDTO;
import br.com.grude4j.searchnytimes.model.NyTimes;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(
            name = "nytimes",
            url = "https://api.nytimes.com/svc/mostpopular/v2",
            configuration = NyTimesConfig.class
)
public interface NyTimesClient {

        @GetMapping("/viewed/1.json")
        public NyTimes getMostPopular();
}
