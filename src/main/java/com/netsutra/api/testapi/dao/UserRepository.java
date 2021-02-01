package com.netsutra.api.testapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.netsutra.api.testapi.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
