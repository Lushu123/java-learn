package com.example.demo.pojo;


import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Component
public class ValidatorPojo {

    @NotNull(message = "id不能为空")
    private Integer id;

    @Future(message = "需要一个将来的日期")
    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;
}
