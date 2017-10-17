package org.mystic.blog.service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * @author: mystic
 * @date: 2017/10/12 13:39
 * @since: JDK1.8.0_144
 * @version:
 * Description:
 */
public interface UserService {
    /**
     * 根据条件查询用户
     * @param condition 查询的条件
     * @return 查询结果的集合
     */
    List<Map<String,Object>> findUser(Map<String, Object> condition);

    /**
     * 保存用户信息
     * @param condition 用户信息
     * @param request 注入request
     * @return 影响的行数
     */
    int saveUser(Map<String, Object> condition, HttpServletRequest request);

    /**
     * 删除指定的用户信息
     * @param condition 删除条件
     * @return 影响的行数
     */
    int deleteUser(Map<String, Object> condition);
}
