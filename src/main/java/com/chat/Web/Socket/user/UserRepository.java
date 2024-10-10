package com.chat.Web.Socket.user;

import com.chat.Web.Socket.enu.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,String> {
    List<User> findAllByStatus(Status status);
}
