package com.easybytes.accounts.service;


import com.easybytes.accounts.dto.CustomerDto;

public interface IAccountsService {
    /**
     *
     * @param customerDto - customer dto object
     */
    void createAccount(CustomerDto customerDto);
    /**
     *
     * @param mobileNumber -input mobile number
     * @return Account details based on mobile number
     */
    CustomerDto fetchAccount(String mobileNumber);
}
