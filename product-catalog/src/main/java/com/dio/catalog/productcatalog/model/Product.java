package com.dio.catalog.productcatalog.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Setting;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Document(indexName = "product")
@Setting(indexStoreType = "catalog")
public class Product {

    @Id
    private Long id;

    private String name;
    private int amount;

}
