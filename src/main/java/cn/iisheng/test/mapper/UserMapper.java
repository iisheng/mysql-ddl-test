package cn.iisheng.test.mapper;

import cn.iisheng.test.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author iisheng
 * @date 2020/05/19 09:50:00
 */
public interface UserMapper extends BaseMapper<User> {

    @Select("SELECT * FROM user WHERE id > #{cursor} LIMIT #{limit}")
    List<User> queryByCursor(Long cursor, Integer limit);

}
