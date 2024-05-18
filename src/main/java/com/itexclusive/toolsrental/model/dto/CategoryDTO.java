package com.itexclusive.toolsrental.model.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CategoryDTO {
    private int id;
    private String name;
}
