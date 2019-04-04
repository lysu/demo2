package com.example.demo2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	public User findById(Long id);

	public User save(User user);

	@Query(value = "SELECT u FROM User u WHERE name=:name")
	public User findName(@Param("name") String name);

}
