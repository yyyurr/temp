package com.example.demo.board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.board.mapper.DaoMapper;

@Service
public class BoardService {

	@Autowired
	DaoMapper mapper;
	
	public void test() {
		System.out.println(mapper.test());
	}
}
