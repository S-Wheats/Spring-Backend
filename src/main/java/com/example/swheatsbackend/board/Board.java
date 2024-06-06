package com.example.swheatsbackend.board;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "board")
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "board_no")
    private int board_no;

    private String title;
    private String contents;
    private String image;

    public void setBoardNo(int board_no) { this.board_no = board_no; }
}
