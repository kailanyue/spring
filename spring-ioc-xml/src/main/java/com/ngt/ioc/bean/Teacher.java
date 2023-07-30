package com.ngt.ioc.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

/**
 * 2023-07-30 22:15
 * @author yueka
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Log4j2
public class Teacher {
	private String teacherId;
	private String teacherName;
}
