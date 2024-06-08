package br.com.grude4j.searchnytimes.controller;

import br.com.grude4j.searchnytimes.dto.ArticleDTO;
import br.com.grude4j.searchnytimes.service.NyTimesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NyTimesController {

    private final NyTimesService nyTimesService;

    public NyTimesController (NyTimesService nyTimesService){
        this.nyTimesService = nyTimesService;
    }

    @GetMapping("/most-popular")
    public List<ArticleDTO> getMostPopularArticles() {
        return nyTimesService.getMostPopular();
    }

}
