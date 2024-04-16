package com.projeto.desafioanota.domain.category;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.annotation.processing.Generated;


@Document(collection = "category")
@Getter
@Setter
@NoArgsConstructor
public class Category {

    @Id
    private String id;
    private String title;
    private String description;
    private String ownerId;

}
