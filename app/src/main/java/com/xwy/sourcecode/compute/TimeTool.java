package com.xwy.sourcecode.compute;

import java.security.Timestamp;
import java.text.DateFormat;

/**
 * Created by xuweiyu on 2020/6/10.
 * email: xuweiyu@igengmei.com
 * 简介：
 */
public class TimeTool {
    public static void check(String title,Task task){
        System.out.println(title+"开始执行：");
        long startTime = System.currentTimeMillis();
        task.execute();
        long endTime = System.currentTimeMillis();
        System.out.println(title+"开始完毕耗时："+(endTime-startTime)/1000.0f+"s");
    }
    interface Task{
        void execute();
    }
}
