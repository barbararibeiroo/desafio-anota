package com.projeto.desafioanota.domain.product;

import com.projeto.desafioanota.domain.category.Category;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "products")
@Setter
@Getter
@NoArgsConstructor
public class Product {

    @Id
    private String id;
    private String title;
    private String description;
    private String ownerId;
    private Integer price;
    private Category category;

    public Product(ProductDTO productDTO) {
        this.title = productDTO.title();
        this.description = productDTO.title();
        this.ownerId = productDTO.ownerId();
        this.price = productDTO.price();
    }
}
