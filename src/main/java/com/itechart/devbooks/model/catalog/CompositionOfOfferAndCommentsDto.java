package com.itechart.devbooks.model.catalog;

import com.itechart.devbooks.model.customer.CustomerDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;


@Getter
@Setter
@AllArgsConstructor
public class CompositionOfOfferAndCommentsDto {

    private OfferDto offer;
    private Set<CommentDto> comments;
    private Set<CustomerDto> customers;

}
