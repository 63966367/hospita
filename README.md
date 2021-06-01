基于Springboot+layui的医疗管理系统

一、项目运行过程

1、打开SQLyog或Navicat数据库工具创建数据库**`lb_appointment`**导入hospital.sql文件
设置    username: root
      password: 123456
      
 2、导入Hospital-project一整个项目，设置好maven依赖文件，开始运行项目
 在浏览器输入http://localhost:8080/hos/home/index进入前台相关页面，前台页面包括网站首页、医院简介、科室类别、坐诊时间、就医指南、新闻中心、关于我们、注册登录
 
 
 3、点击登录注册，进入注册登录页面，注册相关账号，输入相关注册信息，登录账号进入后台管理，后台管理包括系统管理（医生管理、患者管理、药品管理、科目查询管理、疾病管理）、预约管理、病史管理、住院信息管理、管理员管理****