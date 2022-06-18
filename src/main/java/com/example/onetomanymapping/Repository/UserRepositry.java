package com.example.onetomanymapping.Repository;

import com.example.onetomanymapping.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositry  extends JpaRepository<User,Long> {

}
