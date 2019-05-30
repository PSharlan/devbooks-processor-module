package com.itechart.devbooks.model.inventory;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class OrderItemDto {

    private Long id;
    private Long offerId;
    private String name;
    private String description;
    private String category;
    private double price;

    public OrderItemDto() {
    }

    public OrderItemDto(Long offerId, String name, String description, String category, double price) {
        this.offerId = offerId;
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
    }

    public OrderItemDto(Long id, Long offerId, String name, String description, String category, double price) {
        this(offerId, name, description, category, price);
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderItemDto)) return false;
        OrderItemDto that = (OrderItemDto) o;
        return Double.compare(that.price, price) == 0 &&
                Objects.equals(id, that.id) &&
                Objects.equals(offerId, that.offerId) &&
                Objects.equals(name, that.name) &&
                Objects.equals(description, that.description) &&
                Objects.equals(category, that.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, offerId, name, description, category, price);
    }

    @Override
    public String toString() {
        return "OrderItemDto{" +
                "id=" + id +
                ", offerId=" + offerId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
