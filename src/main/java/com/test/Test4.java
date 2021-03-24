package com.test;

import com.google.common.collect.Maps;
import com.model.User;
import java.util.Map;
import org.apache.commons.beanutils.BeanUtils;

/**
 * @author yinbenyang
 * @version 1.0
 * @description: 啊啊啊
 * @date 2021/3/23 11:18 上午
 */
public class Test4 {

    public static void main(String[] args) {
        User user = new User();
//        user.setId(1);
//        user.setName("张三");
        Map<String, Object> map = Maps.newHashMap();
        map.put("id2",1);
        map.put("name","里斯");
        try {
            BeanUtils.populate(user,map);
            System.out.println(user);
            Map<String, String> describe = BeanUtils.describe(user);
            System.out.println(describe);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
