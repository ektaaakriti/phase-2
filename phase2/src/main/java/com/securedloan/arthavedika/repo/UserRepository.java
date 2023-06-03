package com.securedloan.arthavedika.repo;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.securedloan.arthavedika.model.User;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	@Query("SELECT u FROM User u  WHERE u.mobile_no = ?1 and u.password= ?2 ")
	Collection<User> findUsers(String mobile_no, String password);

	@Query("SELECT u FROM User u WHERE u.otp = ?1")
	public User findByVerificationCode(String otp);

//	@Query("UPDATE User u SET u.loggedIn = true WHERE user_id =?1")
//	@Modifying
//	public void loggedIn(String user_id);
	@Query("UPDATE User u SET u.verified = true WHERE user_id =?1")
	@Modifying
	public void verified(String user_id);

	@Query("SELECT u FROM User u WHERE u.email_id =?1")
	public User findByEmail(String email_id);

	// public User findByResetPasswordToken(String token);

}
