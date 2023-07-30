package com.ngt.ioc.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

import java.util.List;

/**
 * 2023-07-30 20:52
 *
 * @author yueka
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Log4j2
public class School {
	private String name;
	private List<Student> students;
}
