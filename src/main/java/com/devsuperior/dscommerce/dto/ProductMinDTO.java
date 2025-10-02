package com.devsuperior.dscommerce.dto;

import com.devsuperior.dscommerce.entities.Product;

// quando se trata de um dto de listagem apenas, nao é necessário validação entao a gente tira os jakarta validation
public class ProductMinDTO {

    private Long id; // mesmo que no requisito nao mostre explicitamente pra trazer o id na listagem, é bom trazer ele mesmo assim, isso é uma malicia que como dev devemos ter
   
    private String name;
    private Double price;
    
    private String imgUrl;
    
    public ProductMinDTO() {
    }

    public ProductMinDTO(Long id, String name, Double price, String imgUrl) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.imgUrl = imgUrl;
    }

    public ProductMinDTO(Product entity) {
        id = entity.getId();
        name = entity.getName();
        price = entity.getPrice();
        imgUrl = entity.getImgUrl();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public Double getPrice() {
        return price;
    }

    public String getImgUrl() {
        return imgUrl;
    }
}
