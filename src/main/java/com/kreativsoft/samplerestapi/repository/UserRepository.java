package com.kreativsoft.samplerestapi.repository;

import com.kreativsoft.samplerestapi.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
