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
    <link rel="icon" type="image/png" sizes="16x16" href="/resources/admin/images/favicon.png">
    <title>Ela - Bootstrap Admin Dashboard Template</title>

    <#include "inc/css.ftl">
</head>

<body class="fix-header fix-sidebar">

<!-- preloader -->
<#include "inc/preloader.ftl">
<!-- end preloader -->

<!-- Main wrapper  -->
<div id="main-wrapper">

    <!-- header -->
    <#include "inc/header.ftl">
    <!-- end header -->

    <!-- sidebar -->
    <#include "inc/sidebar.ftl">
    <!-- end sidebar -->

    <!-- Page wrapper  -->
    <div class="page-wrapper">
        <!-- Bread crumb -->
        <div class="row page-titles">
            <div class="col-md-5 align-self-center">
                <h3 class="text-primary">Dashboard</h3> </div>
            <div class="col-md-7 align-self-center">
                <ol class="breadcrumb">
                    <li class="breadcrumb-item"><a href="javascript:void(0)">Home</a></li>

                    <li class="breadcrumb-item active">Dashboard</li>
                </ol>
            </div>
        </div>
        <!-- End Bread crumb -->
        <!-- Container fluid  -->
        <div class="container-fluid">
            <div class="row">
                <div class="col-lg-6">
                    <div class="card">
                        <div class="card-title">
                            <h4>全局设置</h4>
                        </div>
                        <div class="card-body">
                            <div class="basic-form">
                                <form>
                                    <div class="form-group">
                                        <label>站点名称</label>
                                        <input type="email" class="form-control" placeholder="Email">
                                    </div>
                                    <div class="form-group">
                                        <label>站点描述</label>
                                        <input type="email" class="form-control" placeholder="Email">
                                    </div>
                                    <div class="form-group">
                                        <label>站点关键词</label>
                                        <input type="email" class="form-control" placeholder="Email">
                                    </div>
                                    <div class="form-group">
                                        <label>博客主题</label>
                                        <select class="form-control">
                                            <option>1</option>
                                            <option>2</option>
                                            <option>3</option>
                                            <option>4</option>
                                            <option>5</option>
                                        </select>
                                    </div>
                                    <div class="checkbox">
                                        <label>
                                            <input type="checkbox"> 允许重新安装
                                        </label>
                                    </div>
                                    <button type="submit" class="btn btn-default">保持设置</button>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- /# column -->
                <div class="col-lg-6">
                    <div class="card">
                        <div class="card-title">
                            <h4>个性化设置</h4>
                        </div>
                        <div class="card-body">
                            <div class="basic-form">
                                <form>
                                    <div class="form-group">
                                        <label>微博账号</label>
                                        <input type="email" class="form-control" placeholder="Email">
                                    </div>
                                    <div class="form-group">
                                        <label>知乎账号</label>
                                        <input type="email" class="form-control" placeholder="Email">
                                    </div>
                                    <div class="form-group">
                                        <label>Github 账号</label>
                                        <input type="email" class="form-control" placeholder="Email">
                                    </div>
                                    <div class="form-group">
                                        <label>Twitter 账号</label>
                                        <input type="email" class="form-control" placeholder="Email">
                                    </div>
                                    <button type="submit" class="btn btn-default">保持设置</button>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- /# column -->
            </div>

            <!-- End PAge Content -->
        </div>
        <!-- End Container fluid  -->
    </div>
    <!-- End Page wrapper  -->
</div>
<!-- End Wrapper -->

<!-- js -->
<#include "inc/js.ftl">
<!-- end js -->

</body>

</html>