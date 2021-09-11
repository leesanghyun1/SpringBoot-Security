package com.example.test.board.vo;


import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class BoardUserVo {
    private String board_no;
    private String title;
    private String text;
    private Date date;
    private String user_id;
    private String visit;
    private String privateYn;

}
