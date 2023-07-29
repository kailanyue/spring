package com.ngt.ioc.bean;

import lombok.*;
import lombok.extern.log4j.Log4j2;

/**
 * 2023-07-29 17:04
 * @author 696292
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Log4j2
public class Book {
    private String name;
    private String author;
    private Double price;
}
