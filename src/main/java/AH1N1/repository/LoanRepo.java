package AH1N1.repository;

/**
 * Created by Woj on 2017-02-14.
 */

import AH1N1.entity.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanRepo extends JpaRepository<Loan,Long> {
    //public Loan findById(Long id);



}
