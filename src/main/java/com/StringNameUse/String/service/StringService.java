package com.StringNameUse.String.service;

import java.lang.StackWalker.Option;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StringNameUse.String.dto.DtoStringUse;
import com.StringNameUse.String.entity.StringUse;
import com.StringNameUse.String.repository.StringRepository;

@Service
public class StringService implements ServiceImplement {
	@Autowired
	StringRepository repository;

	@Override
	public DtoStringUse GetString(String name) {
		Optional<StringUse>optional = repository.findByName(name);
		StringUse stringUse=optional.get();
		DtoStringUse use = new DtoStringUse();
		use.setName(stringUse.getName());
		use.setId(stringUse.getId());
		use.setAge(stringUse.getAge());
		use.setDepartment(stringUse.getDepartment());
		return use;
	}

	@Override
	public StringUse post(DtoStringUse dtoUse) {
		StringUse use = new StringUse();
		use.setName(dtoUse.getName());
		use.setId(dtoUse.getId());
		use.setDepartment(dtoUse.getDepartment());
		use.setAge(dtoUse.getAge());
		return repository.save(use);
	}


	

	

}
