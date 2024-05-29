package com.StringNameUse.String.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.StringNameUse.String.entity.StringUse;

@Repository
public interface StringRepository extends JpaRepository<StringUse, Integer> {

	Optional<StringUse> findByName(String name);

}
