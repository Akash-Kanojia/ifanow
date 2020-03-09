package ifanow.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ifanow.entities.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

	public Transaction findByUserId(Integer userid);
	public Transaction findById(Integer id);
}
