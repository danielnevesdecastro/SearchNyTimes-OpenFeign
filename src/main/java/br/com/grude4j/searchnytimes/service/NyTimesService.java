package br.com.grude4j.searchnytimes.service;

import br.com.grude4j.searchnytimes.dto.ArticleDTO;
import br.com.grude4j.searchnytimes.feignclient.NyTimesClient;
import br.com.grude4j.searchnytimes.model.NyTimes;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class NyTimesService {

    private final NyTimesClient nyTimesClient;

    public NyTimesService(NyTimesClient nyTimesClient) {
        this.nyTimesClient = nyTimesClient;
    }

    public List<ArticleDTO> getMostPopular() {
        NyTimes nyTimesResponse = nyTimesClient.getMostPopular();
        return nyTimesResponse.getResults().stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    private ArticleDTO convertToDTO(NyTimes.Article article) {
        ArticleDTO dto = new ArticleDTO();
        dto.setSource(article.getSource());
        dto.setPublishedDate(article.getPublishedDate());
        dto.setUpdated(article.getUpdated());
        dto.setSection(article.getSection());
        dto.setSubsection(article.getSubsection());
        dto.setNytdsection(article.getNytdsection());
        dto.setAdxKeywords(article.getAdxKeywords());
        dto.setByline(article.getByline());
        dto.setType(article.getType());
        dto.setTitle(article.getTitle());
        dto.setAbstractText(article.getAbstractText());
        return dto;
    }
}
