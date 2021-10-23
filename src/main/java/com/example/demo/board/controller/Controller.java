package com.example.demo.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.board.service.BoardService;

@org.springframework.stereotype.Controller
@RequestMapping("/board")
public class Controller {

	@Autowired
	BoardService service;
	
	@GetMapping
	public String test() {
		service.test();
		return "index";
	}
}
