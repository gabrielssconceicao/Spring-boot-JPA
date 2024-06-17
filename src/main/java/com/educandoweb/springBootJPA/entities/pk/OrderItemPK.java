package com.educandoweb.springBootJPA.entities.pk;


import com.educandoweb.springBootJPA.entities.Order;
import com.educandoweb.springBootJPA.entities.Product;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

// Auxiliary class to refer to Order and Product
// primary keys
public class OrderItemPK implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    private Order order;
    private Product product;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderItemPK that)) return false;
        return Objects.equals(getOrder(), that.getOrder()) && Objects.equals(getProduct(), that.getProduct());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOrder(), getProduct());
    }
}
