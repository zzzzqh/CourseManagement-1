package com.handsome.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.handsome.dao.LessonDao;
import com.handsome.po.Lesson;

public class LessonDaoImpl implements LessonDao {
	
	private SqlSessionFactory sqlSessionFactory;
	
	public LessonDaoImpl(SqlSessionFactory sqlSessionFactory){
		this.sqlSessionFactory = sqlSessionFactory;
	}
	
	public Lesson selectLessonByName(String name) {
		
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		Lesson lesson = sqlSession.selectOne("lesson.selectLessonByName", name);
		
		return lesson;
	}

	public List<Lesson> selectAll() {
		
		SqlSession sqlSession = sqlSessionFactory.openSession(true);

		List<Lesson> list = sqlSession.selectList("lesson.selectAllLesson");
		
		return list;
	}

}
