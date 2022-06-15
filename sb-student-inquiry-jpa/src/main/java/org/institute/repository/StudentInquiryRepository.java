package org.institute.repository;

import java.util.List;

import org.institute.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentInquiryRepository extends JpaRepository<Student, Integer> {

	@Query(value="from Student where city=:c")
	public List<Student> getInquiryByCity(@Param("c") String city);
	
	@Query(value="from Student where inqFor=:iq")
	public List<Student> getInquiryFor(@Param("iq") String inqFor);
}
