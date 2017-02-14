package AH1N1.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * Created by Woj on 2017-02-14.
 */
@Entity
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    BigDecimal loanAmount;

    Integer loanTermMonths;

    public Loan() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(BigDecimal loanAmount) {
        this.loanAmount = loanAmount;
    }

    public Integer getLoanTermMonths() {
        return loanTermMonths;
    }

    public void setLoanTermMonths(Integer loanTermMonths) {
        this.loanTermMonths = loanTermMonths;
    }

    public Loan(BigDecimal loanAmount, Integer loanTermMonths) {
        this.loanAmount = loanAmount;
        this.loanTermMonths = loanTermMonths;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "id=" + id +
                ", loanAmount=" + loanAmount +
                ", loanTermMonths=" + loanTermMonths +
                '}';
    }
}
