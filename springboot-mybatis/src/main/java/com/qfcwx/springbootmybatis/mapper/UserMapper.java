package com.qfcwx.springbootmybatis.mapper;

import com.qfcwx.springbootmybatis.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @ClassName: UserMapper
 * @Author: 清风一阵吹我心
 * @Description: TODO  访问数据库的接口
 * @Date: 2019/3/12 16:47
 * @Version 1.0
 **/
public interface UserMapper {


    /**
     * 插入
     * @param user
     * @return
     */
    @Insert("INSERT INTO user(name,phone,age,create_date) VALUES(#{name},#{phone},#{age},#{createDate})")
    @Options(useGeneratedKeys = true,keyProperty = "id",keyColumn = "id")
    int insert(User user);

    /**
     * 查询所有
     * @return
     */
    @Select("SELECT * FROM user")
    @Results({@Result(column = "create_date",property = "createDate")})
    List<User> findAll();

    /**
     * 根据id查找
     * @param id
     * @return
     */
    @Select("SELECT * FROM user WHERE id = #{id}")
    @Results({@Result(column = "create_date",property = "createDate")})
    User findById(Long id);

    /**
     * 修改用户名
     * @param user
     */
    @Update("UPDATE user SET name = #{name} WHERE id = #{id}")
    void update(User user);

    /**
     * 根据id删除用户
     * @param id
     */
    @Delete("DELETE FROM user WHERE id = #{id}")
    void delete(Long id);
}
