package com.esl.spring;

/**
 * @author bhanu
 **/

public interface CustomerDAO {
    public void insert(Customer customer);

    public Customer findByCustomerId(int custId);
}

