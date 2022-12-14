package com.sejong.ghostyattendance.lecture.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LectureRes {

    private String location;
    private String lecture_name;
    private String start_date;
    private String end_date;
    private int progress;
    private String is_pass;
    private int status;
}
