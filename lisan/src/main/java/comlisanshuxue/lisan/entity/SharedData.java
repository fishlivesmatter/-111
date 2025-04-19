package comlisanshuxue.lisan.entity;

import lombok.Data;

@Data
public class SharedData {
    private Long id;
    private String content; // 存储JSON格式的内容数据
    private Long createTime;
}
