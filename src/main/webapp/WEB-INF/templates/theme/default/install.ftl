<!DOCTYPE html>
<html lang="zxx" class="no-js">
<head>
    <!-- Mobile Specific Meta -->
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- Favicon-->
    <link rel="shortcut icon" href="">
    <!-- Author Meta -->
    <meta name="author" content="ellery">
    <!-- Meta Description -->
    <meta name="description" content="">
    <!-- Meta Keyword -->
    <meta name="keywords" content="">
    <!-- meta character set -->
    <meta charset="UTF-8">
    <!-- Site Title -->
    <title>Myrmia</title>
    <!-- css -->
    <#include "inc/css.ftl">
</head>
<body>

<!-- Start banner Area -->
<section class="generic-banner">
    <div class="container">
        <div class="row height2 align-items-center justify-content-center">
            <div class="col-lg-10">
                <div class="generic-banner-content">
                    <h2 class="text-white">开始写博客吧 :)</h2>
                    <p class="text-white">Myrmia 安装向导</p>
                </div>
            </div>
        </div>
    </div>
</section>
<!-- End banner Area -->

<!-- Start Sample Area -->
<section class="sample-text-area custom-bgc">
    <div class="container">
        <div class="col-lg-10 offset-lg-1">

            <#if !isInstalled>
            <div class="single-testimonial item" id="site_setting">
                <h4 class="install-setting">网站设置</h4>
                <form action="#">
                    <div class="mt-10">
                        <input type="text" id="siteTitle" name="siteTitle" placeholder="* 网站名称" onfocus="this.placeholder = ''" onblur="this.placeholder = '* 网站名称'"
                               required aria-required="true" maxlength="100" class="single-input">
                    </div>
                    <div class="mt-10">
                        <input type="text" id="siteURL" name="siteURL" placeholder="* 网站地址" onfocus="this.placeholder = ''" onblur="this.placeholder = '* 网站地址'"
                               required aria-required="true" class="single-input">
                    </div>
                    <div class="mt-10">
                        <input type="text" id="adminUser" name="adminUser" placeholder="* 管理员账号" onfocus="this.placeholder = ''" onblur="this.placeholder = '* 管理员账号'"
                               required aria-required="true" rangelength="[4,20]" class="single-input">
                    </div>
                    <div class="mt-10">
                        <input type="email" id="adminEmail" name="adminEmail" placeholder="* 管理员邮箱" onfocus="this.placeholder = ''" onblur="this.placeholder = '* 管理员邮箱'"
                               required class="single-input">
                    </div>
                    <div class="mt-10">
                        <input type="text" id="adminPwd" name="adminPwd" placeholder="* 管理员密码" onfocus="this.placeholder = ''" onblur="this.placeholder = '* 管理员密码'"
                               required aria-required="true" rangelength="[6,14]" class="single-input">
                    </div>
                    <div class="mt-10">
                        <input type="password" id="adminPwdConfirm" name="adminPwdConfirm" placeholder="* 确认管理员密码" onfocus="this.placeholder = ''" onblur="this.placeholder = '* 确认管理员密码'"
                               required equalTo="#adminPwd" class="single-input">
                    </div>
                    <div class="button-group-area install-setting-btn">
                        <a href="#" class="genric-btn default radius">取消</a>
                        <a href="javascript:void(0);" id="install_submit" class="genric-btn primary radius">下一步</a>
                    </div>
                </form>
            </div>

            <div class="single-testimonial item hide">
                <h4 class="install-setting">数据库设置</h4>
                <form action="#">
                    <div class="mt-10">
                        <input type="text" name="first_name" placeholder="* 数据库地址" onfocus="this.placeholder = ''" onblur="this.placeholder = '* 数据库地址'" required class="single-input">
                    </div>
                    <div class="mt-10">
                        <input type="text" name="last_name" placeholder="* 数据库名称" onfocus="this.placeholder = ''" onblur="this.placeholder = '* 数据库名称'" required class="single-input">
                    </div>
                    <div class="mt-10">
                        <input type="text" name="last_name" placeholder="* 数据库用户" onfocus="this.placeholder = ''" onblur="this.placeholder = '* 数据库用户'" required class="single-input">
                    </div>
                    <div class="mt-10">
                        <input type="text" name="last_name" placeholder="* 数据库密码" onfocus="this.placeholder = ''" onblur="this.placeholder = '* 数据库密码'" required class="single-input">
                    </div>
                    <div class="button-group-area install-setting-btn">
                        <a href="#" class="genric-btn default radius">上一步</a>
                        <a href="#" class="genric-btn primary radius">下一步</a>
                    </div>
                </form>
            </div>

            <div class="single-testimonial item hide" id="site_install_success">
                <h4 class="install-setting">恭喜，安装完成</h4>
                <form action="#">
                    <div class="button-group-area install-setting-btn">
                        <a href="#" class="genric-btn primary radius">登录后台</a>
                    </div>
                </form>
            </div>
            <#else>
            <div class="single-testimonial item">
                你已经安装过Tale了，如需重新安装请提前做好备份，并删除根目录下的
                <mark>install.lock</mark> 文件。
            </div>
            </#if>
        </div>
    </div>
</section>
<!-- End Sample Area -->

<!-- js -->
<#include "inc/js.ftl">
<!-- end js -->
</body>
</html>