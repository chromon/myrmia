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
    <!-- Custom CSS -->
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

                    <li class="breadcrumb-item active">发布文章</li>
                </ol>
            </div>
        </div>
        <!-- End Bread crumb -->
        <!-- Container fluid  -->
        <div class="container-fluid">
            <div class="row">
                <div class="col-lg-12">
                    <div class="card">
                        <div class="card-title">
                            <h4>发布文章</h4>
                        </div>
                        <div class="card-body">
                            <div class="basic-form">
                                <form>
                                    <div class="form-group form-inline">
                                        <div class="col-lg-5">
                                            <input type="text" class="custom-article-info form-control" placeholder="请输入文章标题（必须）">
                                        </div>
                                        <div class="col-lg-5">
                                            <input type="text" class="custom-article-info form-control" placeholder="自定义文章访问路径，如：my-first-article，默认为文章 id">
                                        </div>
                                    </div>
                                    <div class="form-group form-inline">
                                        <div class="col-lg-5">
                                            <input type="text" class="custom-article-info form-control" placeholder="文章标签">
                                        </div>
                                        <#--<div class="col-lg-5">-->
                                            <#--<input type="text" class="custom-article-info form-control" placeholder="文章分类">-->
                                        <#--</div>-->
                                        <div class="col-lg-5">
                                            <select class="form-control publish-select">
                                                <option>请选择分类</option>
                                                <option>2</option>
                                                <option>3</option>
                                                <option>4</option>
                                                <option>5</option>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="col-lg-10">
                                        <div id="summernote"></div>
                                    </div>
                                    <div class="col-lg-10">
                                        <button type="submit" class="btn btn-primary">保存文章</button>
                                        <button type="submit" class="btn btn-success">存为草稿</button>
                                        <div class="checkbox publish-checkbox">
                                            <label>
                                                <input type="checkbox" id="allowComment"> 开启评论
                                            </label>
                                            <label>
                                                <input type="checkbox" id="allowPing"> 允许 Ping
                                            </label>
                                            <label>
                                                <input type="checkbox" id="allowFeed"> 允许订阅
                                            </label>
                                        </div>
                                    </div>
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