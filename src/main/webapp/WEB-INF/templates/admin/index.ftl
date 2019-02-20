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
            <!-- Start Page Content -->
            <div class="row">
                <div class="col-md-3">
                    <div class="card p-30">
                        <div class="media">
                            <div class="media-left meida media-middle">
                                <span><i class="fa fa-pencil-square-o f-s-40 color-primary"></i></span>
                            </div>
                            <div class="media-body media-text-right">
                                <h2>${contentsSize}</h2>
                                <p class="m-b-0">发表文章</p>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-md-3">
                    <div class="card p-30">
                        <div class="media">
                            <div class="media-left meida media-middle">
                                <span><i class="fa fa-commenting f-s-40 color-success"></i></span>
                            </div>
                            <div class="media-body media-text-right">
                                <h2>1178</h2>
                                <p class="m-b-0">留言</p>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-md-3">
                    <div class="card p-30">
                        <div class="media">
                            <div class="media-left meida media-middle">
                                <span><i class="fa fa-cloud-upload f-s-40 color-warning"></i></span>
                            </div>
                            <div class="media-body media-text-right">
                                <h2>25</h2>
                                <p class="m-b-0">上传附件</p>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-md-3">
                    <div class="card p-30">
                        <div class="media">
                            <div class="media-left meida media-middle">
                                <span><i class="fa fa-link f-s-40 color-danger"></i></span>
                            </div>
                            <div class="media-body media-text-right">
                                <h2>847</h2>
                                <p class="m-b-0">友链</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <div class="row">
                <div class="col-lg-6">
                    <div class="card">
                        <div class="card-title">
                            <h4>最新文章</h4>
                        </div>
                        <div class="card-body">
                            <div class="table-responsive">
                                <table class="table">
                                    <thead>
                                    <tr>
                                        <th>标题</th>
                                        <th>日期</th>
                                        <th>评论</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <#list contentsDOList as contentsDO>
                                    <tr>
                                        <td>${contentsDO.title}</td>
                                        <td><span>${contentsDO.created}</span></td>
                                        <td><span class="badge badge-success">${contentsDO.commentsNum}</span></td>
                                    </tr>
                                    </#list>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-lg-6">
                    <div class="card">
                        <div class="card-title">
                            <h4>最新留言</h4>
                        </div>
                        <div class="recent-comment">
                            <div class="media">
                                <div class="media-left">
                                    <a href="#"><img alt="..." src="/resources/admin/images/7.jpg" class="media-object"></a>
                                </div>
                                <div class="media-body">
                                    <h4 class="media-heading">john doe</h4>
                                    <p>Cras sit amet nibh libero, in gravida nulla. </p>
                                    <p class="comment-date">October 21, 2018</p>
                                </div>
                            </div>
                            <div class="media">
                                <div class="media-left">
                                    <a href="#"><img alt="..." src="/resources/admin/images/7.jpg" class="media-object"></a>
                                </div>
                                <div class="media-body">
                                    <h4 class="media-heading">john doe</h4>
                                    <p>Cras sit amet nibh libero, in gravida nulla. </p>
                                    <p class="comment-date">October 21, 2018</p>
                                </div>
                            </div>

                            <div class="media">
                                <div class="media-left">
                                    <a href="#"><img alt="..." src="/resources/admin/images/7.jpg" class="media-object"></a>
                                </div>
                                <div class="media-body">
                                    <h4 class="media-heading">john doe</h4>
                                    <p>Cras sit amet nibh libero, in gravida nulla. </p>
                                    <p class="comment-date">October 21, 2018</p>
                                </div>
                            </div>

                            <div class="media no-border">
                                <div class="media-left">
                                    <a href="#"><img alt="..." src="/resources/admin/images/7.jpg" class="media-object"></a>
                                </div>
                                <div class="media-body">
                                    <h4 class="media-heading">Mr. Michael</h4>
                                    <p>Cras sit amet nibh libero, in gravida nulla. </p>
                                    <div class="comment-date">October 21, 2018</div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
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