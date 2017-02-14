package AH1N1.service;

import AH1N1.entity.Loan;
import AH1N1.repository.LoanRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Woj on 2017-02-14.
 */
@Service
public class LoanService {

    @Autowired
    LoanRepo loanRepo;

    public Loan find(Long id){return loanRepo.findOne(id);}

    public void  save(Loan loan){loanRepo.save(loan);}

    public void delete(Long id){
        if (null!=loanRepo.findOne(id)) loanRepo.delete(id);
    }


}
