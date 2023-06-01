package com.examples.demos.Repositorie;

import com.examples.demos.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
