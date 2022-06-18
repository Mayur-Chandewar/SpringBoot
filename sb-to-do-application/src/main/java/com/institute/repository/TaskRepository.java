package com.institute.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.institute.entity.Task;
import com.institute.entity.User;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer>{

	@Transactional
	@Modifying
	@Query("update Task set status= :st where id= :id")
	void updateTaskStatus(@Param("id") int id, @Param("st") String status);

	@Query("from Task where id = :id")
	Task getTaskByTaskId(@Param("id") int id);

	@Query("from Task where uid= :uid ")
	List<Task> getTaskByUserId(@Param("uid") User uid);

	@Query("from Task where uid= :uid and status=:st ")
	List<Task> getTaskByStatusAndUserId(@Param("uid") User uid,@Param("st") String status);

}
