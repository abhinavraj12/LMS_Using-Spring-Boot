package com.example.sbl.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sbl.model.Borrow;

public interface BorrowRepository extends JpaRepository<Borrow, Long> {
	
//	@Query("select fine from Borrow borrow where borrow.borrow_id = :borrow_id ")
//	Borrow findFineById(long borrowId);
	List<Borrow> findByBorrowerId(long borrowerId);
	List<Borrow> findByBookId(long bookId);
	
}
