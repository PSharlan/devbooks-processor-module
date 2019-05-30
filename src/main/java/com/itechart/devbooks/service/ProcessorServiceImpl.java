package com.itechart.devbooks.service;

import com.itechart.devbooks.model.catalog.OfferDto;
import com.itechart.devbooks.model.inventory.OrderDto;
import com.itechart.devbooks.model.inventory.OrderItemDto;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProcessorServiceImpl implements ProcessorService {

    @Override
    public OrderDto generateOrder(Long userId, List<OfferDto> offers) {
        List<OrderItemDto> orderItems = new ArrayList<>();
        for (OfferDto offer : offers) {
            OrderItemDto item = new OrderItemDto();
            item.setOfferId(offer.getId());
            item.setName(offer.getName());
            item.setDescription(offer.getDescription());
            item.setCategory(offer.getCategory().getName());
            item.setPrice(offer.getPrice());

            orderItems.add(item);
        }
        OrderDto order = new OrderDto();
        order.setCustomerId(userId);
        order.setItems(orderItems);

        return order;
    }

    @Override
    public OrderItemDto generateItem(OfferDto offer) {

        OrderItemDto item = new OrderItemDto();
        item.setOfferId(offer.getId());
        item.setName(offer.getName());
        item.setDescription(offer.getDescription());
        item.setCategory(offer.getCategory().getName());
        item.setPrice(offer.getPrice());

        return item;
    }

    @Override
    public double calculateOrdersPrice(List<OrderDto> orders) {
        double totalPrice = 0;
        for (OrderDto order : orders) {
            if(!order.getOrderStatus().toLowerCase().equals("canceled")) {
                totalPrice += order.getPriceTotal();
            }
            DecimalFormat df = new DecimalFormat("#.##");
            totalPrice = Double.valueOf(df.format(totalPrice));
        }
        return totalPrice;
    }
}
