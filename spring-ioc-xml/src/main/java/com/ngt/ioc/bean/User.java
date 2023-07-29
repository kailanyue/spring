package com.ngt.ioc.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

/**
 * 2023-07-29 17:11
 * @author 696292
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Log4j2
public class User {
    private String name;
    private Integer age;

    public void run() {
        System.out.println("run......");
    }
}
