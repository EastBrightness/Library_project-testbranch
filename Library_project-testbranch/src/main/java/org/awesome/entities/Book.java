package org.awesome.entities;

import jakarta.persistence.*;
import org.awesome.constants.RentalStatus;
import org.awesome.constants.RentalType;

@Entity
public class Book extends BaseEntity {
    @Id
    private String bookId;

    @Column(length=45, nullable = false)
    private String gid;

    @Enumerated(EnumType.STRING)
    @Column(length=30, nullable = false)
    private RentalStatus status = RentalStatus.RETURN;

    @Enumerated(EnumType.STRING)
    @Column(length=30, nullable = false)
    private RentalType erentalType = RentalType.PAPER;
    @Column(length=100, nullable = false)
    private String bookNm;
    @Column(length=45, nullable = false)
    private String author;
    @Column(length=45, nullable = false)
    private String publisher;

    @Lob
    private String description;

}
