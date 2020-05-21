package cn.iisheng.test.entity;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author iisheng
 * @date 2020/05/18 09:50:00
 */
@Data
@Builder
public class User {

    private Long id;

    private Long testId;

    private String name;

    private Integer age;

    private String address;

    private String description;

    private LocalDateTime createTime;

    private LocalDateTime modifyTime;
}
