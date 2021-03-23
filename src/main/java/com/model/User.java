package com.model;

import java.io.Serializable;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yinbenyang
 * @version 1.0
 * @description: TODO
 * @date 2021/3/23 11:23 上午
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

    private int id;

    private String name;

    private String mobile;

    private int sex;

    private LocalDate birthday;

    private String email;

}
