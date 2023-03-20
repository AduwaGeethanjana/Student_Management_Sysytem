package com.sms.studentmanagementsystemapi.repository;

import com.sms.studentmanagementsystemapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
