package br.com.grude4j.searchnytimes.dto;

import lombok.Data;

@Data
public class ArticleDTO {
    private String source;
    private String publishedDate;
    private String updated;
    private String section;
    private String subsection;
    private String nytdsection;
    private String adxKeywords;
    private String byline;
    private String type;
    private String title;
    private String abstractText;
}

