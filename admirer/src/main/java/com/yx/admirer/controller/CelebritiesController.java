package com.yx.admirer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author yangxi
 * @Date 2019/12/3 15:15
 */
@RestController
@RequestMapping("/celebrities")
public class CelebritiesController {

    @RequestMapping("/get")
    public void getCelebrities(@RequestParam(name = "id") Integer id) {
        // 调用service服务获取对应id的用户对象并返回给前端
    }
}
