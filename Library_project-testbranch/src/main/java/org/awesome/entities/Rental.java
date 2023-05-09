package org.awesome.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Rental extends BaseEntity {

    @Id @GeneratedValue
    private Long rentalNo;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="bookId")
    private Book book;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="userNo")
    private User user;

    @Temporal(TemporalType.DATE)
    private LocalDate rentDt;
    @Temporal(TemporalType.DATE)
    private LocalDate returnDt;
}
