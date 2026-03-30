package com.easybytes.accounts.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter@Setter@AllArgsConstructor@NoArgsConstructor
@Entity
public class Customer extends BaseEntity {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="customer_id") //customer_id (SQL column) is same as customerId(java obj) JPA handles this
private Long customerId;

private String name;

private String email;
private String mobileNumber;

}
