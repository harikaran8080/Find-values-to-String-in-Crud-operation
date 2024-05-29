package com.StringNameUse.String.service;

import java.util.List;

import com.StringNameUse.String.dto.DtoStringUse;
import com.StringNameUse.String.entity.StringUse;

public interface ServiceImplement {

	DtoStringUse GetString(String name);

	StringUse post(DtoStringUse dtoUse);

	

	

	

}
