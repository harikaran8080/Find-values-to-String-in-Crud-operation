package com.StringNameUse.String.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.StringNameUse.String.dto.DtoStringUse;
import com.StringNameUse.String.entity.StringUse;
import com.StringNameUse.String.service.ServiceImplement;

@RestController
@RequestMapping("rest/api")
public class StringController {
	@Autowired
	ServiceImplement implement;
	@GetMapping("/get/{name}")
	public DtoStringUse GetString(@PathVariable String name ) {
		return implement.GetString(name);
		
	}
	@PostMapping("/post")
	public StringUse post(@RequestBody DtoStringUse dtoUse ) {
		return implement.post(dtoUse);
	}			
	
}
	
	


