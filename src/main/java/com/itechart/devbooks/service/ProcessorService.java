package com.itechart.devbooks.service;

import com.itechart.devbooks.model.catalog.OfferDto;
import com.itechart.devbooks.model.inventory.OrderDto;
import com.itechart.devbooks.model.inventory.OrderItemDto;

import java.util.List;

public interface ProcessorService {

    OrderDto generateOrder(Long userId, List<OfferDto> offers);

    OrderItemDto generateItem(OfferDto offer);

    double calculateOrdersPrice(List<OrderDto> orders);

}
