package comlisanshuxue.lisan.mapper;

import comlisanshuxue.lisan.entity.SharedData;
import org.apache.ibatis.annotations.*;

@Mapper
public interface SharedDataMapper {
    @Insert("INSERT INTO shared_data(content, create_time) VALUES(#{content}, #{createTime})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insert(SharedData sharedData);

    @Select("SELECT * FROM shared_data WHERE id = #{id}")
    SharedData selectById(Long id);
}