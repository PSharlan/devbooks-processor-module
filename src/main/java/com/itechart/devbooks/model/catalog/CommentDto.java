package com.itechart.devbooks.model.catalog;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class CommentDto {

    private Long id;
    private String message;
    private OfferDto offer;
    private int rating;
    private long customerId;
    private long editorCustomerId;
    private Timestamp creationTime;
    private Timestamp editionTime;

}
