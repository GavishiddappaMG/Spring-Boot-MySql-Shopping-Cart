package com.gavi.supermarket.models;

import com.gavi.supermarket.enums.Status;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

/**
 * Created by Hi on 23-01-2018.
 */
@Getter
@Setter
@Entity
public class ProductOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long orderId;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Product> pproducts;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="userId")
    private User user;

//    private long userId;

    private LocalDate oorderDate;

    @Enumerated(EnumType.STRING)
    private Status sstatus;


}
