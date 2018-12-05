package com.lyscharlie.biz.test.service.impl;

import com.lyscharlie.biz.test.entity.MyTest;
import com.lyscharlie.biz.test.mapper.MyTestMapper;
import com.lyscharlie.biz.test.service.IMyTestService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 我的测试表 服务实现类
 * </p>
 *
 * @author liyishi
 * @since 2018-12-04
 */
@Service
public class MyTestServiceImpl extends ServiceImpl<MyTestMapper, MyTest> implements IMyTestService {

}
