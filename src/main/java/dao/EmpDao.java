package dao;

import entity.Emp;

import java.util.List;

public interface EmpDao {
    int insertEmp(Emp emp);
    int deleteEmp(int empno);
    int saveEmp(Emp emp);
    Emp findById(int id);
    List<Emp> findAll();
}
