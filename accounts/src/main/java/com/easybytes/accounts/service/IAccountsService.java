package com.easybytes.accounts.service;


import com.easybytes.accounts.dto.CustomerDto;

public interface IAccountsService {
    /**
     *
     * @param customerDto - customer dto object
     */
    void createAccount(CustomerDto customerDto);
}
