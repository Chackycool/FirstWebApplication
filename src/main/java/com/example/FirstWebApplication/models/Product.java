package com.example.FirstWebApplication.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

public class Product {
    private long id;
    @Setter
    private int price;
    @Setter
    @Getter
    private String city, title, description, author;

    public Product() {
    }

    public Product(long id, int price, String city, String title, String description, String author) {
        this.id = id;
        this.price = price;
        this.city = city;
        this.title = title;
        this.description = description;
        this.author = author;
    }

    public int getPrice() {
        return this.price;
    }

    public String getCity() {
        return this.city;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAutor() {
        return this.author;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAutor(String autor) {
        this.author = autor;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Product other)) return false;
        if (!other.canEqual(this)) return false;
        if (this.getPrice() != other.getPrice()) return false;
        final Object this$city = this.getCity();
        final Object other$city = other.getCity();
        if (!Objects.equals(this$city, other$city)) return false;
        final Object this$title = this.getTitle();
        final Object other$title = other.getTitle();
        if (!Objects.equals(this$title, other$title)) return false;
        final Object this$description = this.getDescription();
        final Object other$description = other.getDescription();
        if (!Objects.equals(this$description, other$description))
            return false;
        final Object this$autor = this.getAutor();
        final Object other$autor = other.getAutor();
        return Objects.equals(this$autor, other$autor);
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Product;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + this.getPrice();
        final Object $city = this.getCity();
        result = result * PRIME + ($city == null ? 43 : $city.hashCode());
        final Object $title = this.getTitle();
        result = result * PRIME + ($title == null ? 43 : $title.hashCode());
        final Object $description = this.getDescription();
        result = result * PRIME + ($description == null ? 43 : $description.hashCode());
        final Object $autor = this.getAutor();
        result = result * PRIME + ($autor == null ? 43 : $autor.hashCode());
        return result;
    }

    public String toString() {
        return "Product(price=" + this.getPrice() + ", city=" + this.getCity() + ", title=" + this.getTitle() + ", description=" + this.getDescription() + ", autor=" + this.getAutor() + ")";
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
