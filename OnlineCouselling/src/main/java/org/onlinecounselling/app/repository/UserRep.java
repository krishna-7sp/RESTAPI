package org.onlinecounselling.app.repository;

import org.onlinecounselling.app.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRep extends JpaRepository<UserModel, Integer>{
  public boolean existsByUserName(String userName);
  public boolean existsByUserNameAndPassword(String userName,String password);
}
