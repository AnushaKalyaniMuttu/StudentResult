package com.student.result.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table
public class Student {
		@Id
		private int studentId;
		private String studentName;
		private Float maths;
		private Float physics;
		private Float biology;
		
		public Student(int studentId, String studentName, Float maths, Float physics, Float biology) {
			super();
			this.studentId = studentId;
			this.studentName = studentName;
			this.maths = maths;
			this.physics = physics;
			this.biology = biology;
		}
		
		public Student() {
			
		}
		
		
}
