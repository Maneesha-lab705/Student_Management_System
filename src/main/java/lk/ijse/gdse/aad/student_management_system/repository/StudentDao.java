package lk.ijse.gdse.aad.student_management_system.repository;

import lk.ijse.gdse.aad.student_management_system.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDao extends JpaRepository<StudentEntity,String> {

}
