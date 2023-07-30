package com.ngt.ioc.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

import java.util.Map;

/**
 * 2023-07-30 20:50
 * @author yueka
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Log4j2
public class Student {
	private String name;
	private Integer age;
	private School school;
	private String[] hobbies;
	private Map<String,Teacher> teacherMap;

}
