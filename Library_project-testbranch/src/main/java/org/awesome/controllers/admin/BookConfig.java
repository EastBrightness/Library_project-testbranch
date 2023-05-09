package org.awesome.controllers.admin;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.awesome.models.admin.BookType;
import org.awesome.models.admin.RentalType;

import java.awt.print.Paper;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookConfig {

    private long bNumber; // 도서 번호

    private BookType booktype;

    private RentalType rentalType;



    @NotBlank(message="도서명을 입력하세요")
    private String bName; // 도서명

    @NotBlank(message="저자를 입력하세요")
    private String author; // 저자명

    @NotBlank(message="출판사를 입력하세요")
    private String publisher; // 저자명

    private String description; // 상세 설명
}
