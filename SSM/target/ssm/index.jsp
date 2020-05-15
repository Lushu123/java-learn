<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/9/4
  Time: 17:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录界面</title>
    <style>
        *{
            margin: 0;
            padding: 0;
            text-decoration: none;
            box-sizing: border-box;
        }
        body{
            min-height: 100vh;/*vh就是当前屏幕可见高度的1%，vw就是当前屏幕可见宽度的1%*/
            background-image: linear-gradient(128deg,#3498db,#8c44ad);
        }
        .login-form{
            width:360px ;
            height: 580px;
            background: #f1f1f1;
            padding: 80px 40px;
            border-radius: 10px;
            position: absolute;
            top: 50%;
            left:50% ;
            transform: translate(-50%,-50%);

        }
        .login-form h1{
            text-align: center;
            margin-bottom: 60px;
        }
        .txtb{
            border-bottom: 2px solid #adadad;
            position: relative;
            margin: 30px 0;
        }
        .txtb input{
            font-size: 15px;
            color: #333;
            width: 100%; /*如果一个元素的宽度是100%，但它没有占满他的父元素，则父元素肯定设置的padding*/
            border: none;
            outline: none;
            background: none;
            padding: 0px 5px;
            height: 40px;
        }
        .txtb span::before{
            content: attr(data-placeholder);
            position: absolute;
            top: 50%;
            left: 5px;
            color: #adadad;
            transform: translateY(-50%);
            z-index: -1;
            transition: 0.5s;
        }
        .txtb span::after{
            content: "";
            width: 0%;
            position: absolute;
            height: 2px;      /*
                                  如果一个容器的大小是被子元素撑大的，一旦它的的子元素设置position为absolute
                                 （此处父容器的position为relative）则容器高度缩小，子元素溢出。
                                  注：但不会溢出容器的border。
                                */
            background-image: linear-gradient(128deg,#3498db,#8c44ad);
            transition: 0.5s;
        }
        .focus + span::before{
            top: -5px;
        }
        .focus + span::after{
            width: 100%;
        }
        .logbtn{
            display: block;
            width: 100%;
            height: 50px;
            border: none;
            background-image: linear-gradient(128deg,#3498db,#8c44ad);
            background-size:200% ;
            color: #ffffff;
            outline: none;
            cursor: pointer;
            transition: 0.5s;
        }
        .logbtn:hover{
            background-position: right;
        }
        .bottom-text{
            margin-top: 60px;
            text-align: center;
        }

    </style>
</head>
<body>
    <form class="login-form" method="post" action="account/checkoutAccount">
    <h1>登录</h1>
    <div class="txtb">
        <input type="text" name="name">
        <span data-placeholder="用户名"></span>
    </div>
    <div class="txtb">
        <input type="password"  name="password">
        <span data-placeholder="密码"></span>
    </div>
    <input type="submit" value="登录" id="" class="logbtn" >
    <div class="bottom-text">
        没有账号？<a href="#">注册</a>
    </div>
</form>
    <script src="js/jquery-3.4.1.min.js"></script>
    <script>
        $(".txtb input").on("focus",function () {
            $(this).addClass("focus");
        });

        $(".txtb input").on("blur",function () {
            if($(this).val() == ""){
                $(this).removeClass("focus");
            }
        })
    </script>
</body>
</html>
