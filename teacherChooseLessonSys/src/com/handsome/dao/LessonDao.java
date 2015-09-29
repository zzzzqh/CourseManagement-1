package com.handsome.dao;

import java.util.List;

import com.handsome.po.Lesson;

public interface LessonDao {
	
	public Lesson selectLessonByName(String name);
	
	public List<Lesson> selectAll();
}
