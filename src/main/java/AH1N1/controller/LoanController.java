package AH1N1.controller;

import AH1N1.entity.Loan;
import AH1N1.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.*;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.http.MediaType.APPLICATION_XML_VALUE;

/**
 * Created by Woj on 2017-02-14.
 */
@RestController
public class LoanController {


    @Autowired
    LoanService loanService;

    @RequestMapping(value = "getLoan", method = RequestMethod.GET, produces = APPLICATION_XML_VALUE)
    public
    @ResponseBody
    ResponseEntity<Loan> getLoanXML(@RequestParam Long id) {
        Loan result = loanService.find(id);
        System.out.println("found  " + result);
        if (null == result) {
            return ResponseEntity.notFound().build();
        } else {
            System.out.println("zwracam  " + result);
            return ResponseEntity.ok(result);
        }
    }


    @RequestMapping(value = "createLoan", method = RequestMethod.POST, consumes = APPLICATION_XML_VALUE)
    public ResponseEntity<Void> createLoanXML(@RequestBody Loan loan) {
        if (null != loan) {
            loanService.save(loan);
            return ResponseEntity.status(CREATED).build();
        } else return ResponseEntity.status(NOT_ACCEPTABLE).build();

    }


    @RequestMapping(value = "editLoan", method = RequestMethod.PUT, consumes = APPLICATION_XML_VALUE)
    public ResponseEntity<Void> editLoanXML(@RequestBody Loan loan, @RequestParam Long id) {
        Loan result = loanService.find(id);
        System.out.println("found " + result);
        if (null == result) {
            return ResponseEntity.notFound().build();
        } else {
            result.setLoanAmount(loan.getLoanAmount());
            result.setLoanTermMonths(loan.getLoanTermMonths());
            loanService.save(result);
            System.out.println("saved " + result);
            return ResponseEntity.ok().build();
        }


    }

    @RequestMapping(value = "getLoan", method = RequestMethod.GET, produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<Loan> getLoan(@RequestParam Long id) {
        Loan result = loanService.find(id);
        if (null == result) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(result);
        }
    }

    @RequestMapping(value = "createLoan", method = RequestMethod.POST, consumes = APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> createLoan(@RequestBody Loan loan) {
        if (null != loan) {
            loanService.save(loan);
            return ResponseEntity.status(CREATED).build();
        } else return ResponseEntity.status(NOT_ACCEPTABLE).build();

    }


    @RequestMapping(value = "deleteLoan", method = RequestMethod.DELETE)
    public ResponseEntity<Void> deleteLoan(@RequestParam Long id) {
        Loan loan = loanService.find(id);
        if (null == loan) {
            return ResponseEntity.notFound().build();
        } else {
            loanService.delete(id);
            return ResponseEntity.status(NO_CONTENT).build();
        }
    }

    @RequestMapping(value = "editLoan", method = RequestMethod.PUT, consumes = APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> editLoan(@RequestBody Loan loan, @RequestParam Long id) {
        Loan result = loanService.find(id);
        System.out.println("found " + result);
        if (null == result) {
            return ResponseEntity.notFound().build();
        } else {
            result.setLoanAmount(loan.getLoanAmount());
            result.setLoanTermMonths(loan.getLoanTermMonths());
            loanService.save(result);
            System.out.println("saved " + result);
            return ResponseEntity.ok().build();
        }


    }


}