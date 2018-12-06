<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <!-- Tell the browser to be responsive to screen width -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <!-- Favicon icon -->
    <link rel="icon" type="image/png" sizes="16x16" href="images/favicon.png">
    <title>登录 - ${siteTitle}</title>
    <!-- Bootstrap Core CSS -->
    <#include "inc/css.ftl">

</head>

<body class="fix-header fix-sidebar">
<#include "inc/preloader.ftl">

<!-- Main wrapper  -->
<div id="main-wrapper">

    <div class="unix-login">
        <div class="container-fluid">
            <div class="row justify-content-center">
                <div class="col-lg-4">
                    <div class="login-content card">
                        <div class="login-form">
                            <h4>登录 ${siteTitle}</h4>
                            <form id="loginForm" action="/admin/do_login" method="post">
                                <div class="form-group login-error-bottom">
                                    <label class="login-error">用户名或密码不正确</label>
                                </div>
                                <div class="form-group">
                                    <label>账号</label>
                                    <input type="text" id="adminUser" name="adminUser" class="form-control" placeholder="请输入账号 :)">
                                </div>
                                <div class="form-group">
                                    <label>密码</label>
                                    <input type="password" id="adminPwd" name="adminPwd" class="form-control" placeholder="请输入密码">
                                </div>
                                <div class="checkbox">
                                    <label>
                                        <input type="checkbox"> 记住我
                                    </label>
                                    <label class="pull-right">
                                        <a href="#">忘记密码？</a>
                                    </label>

                                </div>
                                <button type="submit" id="loginBtn" class="btn btn-primary btn-flat m-b-30 m-t-30">登录</button>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

</div>
<!-- End Wrapper -->
<!-- All Jquery -->

<!-- js -->
<#include "inc/js.ftl">
<!-- end js -->

</body>

</html>