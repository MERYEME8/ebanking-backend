package org.sid.ebankingbackend.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Entity @Data
@DiscriminatorValue("SA")
@AllArgsConstructor
@NoArgsConstructor

public class SavingAccount extends BankAccount  {
    private double interestRate;
    }

