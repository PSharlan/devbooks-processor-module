package com.itechart.devbooks.model.catalog;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;
import java.util.Set;

@Getter
@Setter
public class OfferDto {

    private Long id;
    private String name;
    private String description;
    private CategoryDto category;
    private Set<TagDto> tags;
    private double price;

    public OfferDto() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OfferDto)) return false;
        OfferDto offerDto = (OfferDto) o;
        return Double.compare(offerDto.price, price) == 0 &&
                Objects.equals(id, offerDto.id) &&
                Objects.equals(name, offerDto.name) &&
                Objects.equals(description, offerDto.description) &&
                Objects.equals(category, offerDto.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, category, price);
    }

    @Override
    public String toString() {
        return "OfferDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", category=" + category +
                ", price=" + price +
                '}';
    }
}
