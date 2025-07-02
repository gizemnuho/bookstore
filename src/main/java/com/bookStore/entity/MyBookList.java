package com.bookStore.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MyBookList {
    @Id
    private int id;
    private String name;
    private String author;
    private String price;
}

/*    public MyBookList() {

    }

    public MyBookList(int id, String name, String author, String price) {
    }
}
*/