package br.com.grude4j.searchnytimes.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class NyTimes {


    private String status;
    private String copyright;
    private int numResults;
    private List<Article> results;

    @Data
    public static class Article {
        private String uri;
        private String url;
        private long id;
        private long assetId;
        private String source;
        @JsonProperty("published_date")
        private String publishedDate;
        private String updated;
        private String section;
        private String subsection;
        private String nytdsection;
        @JsonProperty("adx_keywords")
        private String adxKeywords;
        private String column;
        private String byline;
        private String type;
        private String title;
        @JsonProperty("abstract")
        private String abstractText;

    }
}

