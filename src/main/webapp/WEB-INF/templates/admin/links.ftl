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
                <div class="col-lg-12">
                    <div class="card">
                        <div class="card-title">
                            <h4>友链管理</h4>
                        </div>
                        <div class="card-body">
                            <div class="table-responsive">
                                <table class="table">
                                    <thead>
                                    <tr>
                                        <th>链接名称</th>
                                        <th>链接地址</th>
                                        <th>链接LOGO</th>
                                        <th>链接排序</th>
                                        <th>操作</th>
                                    </tr>
                                    </thead>
                                    <tbody>

                                    <tr>
                                        <td>John Abraham</td>
                                        <td><span>  January 22</span></td>
                                        <td><span>iBook</span></td>
                                        <td><span class="badge badge-success">5</span></td>
                                        <td>
                                            <button type="button" class="btn btn-primary btn-flat btn-addon btn-sm">
                                                <i class="fa fa-pencil"></i>
                                                Default
                                            </button>
                                            <button type="button" class="btn btn-danger btn-sm">
                                                <i class="fa fa-trash" aria-hidden="true"></i>
                                                Default
                                            </button>
                                            <button type="button" class="btn btn-success btn-sm">
                                                <i class="fa fa-paper-plane" aria-hidden="true"></i>
                                                Default
                                            </button>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>John Abraham</td>
                                        <td><span>  January 22</span></td>
                                        <td><span>iBook</span></td>
                                        <td><span class="badge badge-danger">0</span></td>
                                        <td>
                                            <button type="button" class="btn btn-primary btn-flat btn-addon btn-sm">
                                                <i class="fa fa-pencil"></i>
                                                Default
                                            </button>
                                            <button type="button" class="btn btn-danger btn-sm">
                                                <i class="fa fa-trash" aria-hidden="true"></i>
                                                Default
                                            </button>
                                            <button type="button" class="btn btn-success btn-sm">
                                                <i class="fa fa-paper-plane" aria-hidden="true"></i>
                                                Default
                                            </button>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>John Abraham</td>
                                        <td><span>  January 22</span></td>
                                        <td><span>iBook</span></td>
                                        <td><span class="badge badge-primary">12</span></td>
                                        <td>
                                            <button type="button" class="btn btn-primary btn-flat btn-addon btn-sm">
                                                <i class="fa fa-pencil"></i>
                                                Default
                                            </button>
                                            <button type="button" class="btn btn-danger btn-sm">
                                                <i class="fa fa-trash" aria-hidden="true"></i>
                                                Default
                                            </button>
                                            <button type="button" class="btn btn-success btn-sm">
                                                <i class="fa fa-paper-plane" aria-hidden="true"></i>
                                                Default
                                            </button>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>John Abraham</td>
                                        <td><span>  January 22</span></td>
                                        <td><span>iBook</span></td>
                                        <td><span class="badge badge-warning">3</span></td>
                                        <td>
                                            <button type="button" class="btn btn-primary btn-flat btn-addon btn-sm">
                                                <i class="fa fa-pencil"></i>
                                                Default
                                            </button>
                                            <button type="button" class="btn btn-danger btn-sm">
                                                <i class="fa fa-trash" aria-hidden="true"></i>
                                                Default
                                            </button>
                                            <button type="button" class="btn btn-success btn-sm">
                                                <i class="fa fa-paper-plane" aria-hidden="true"></i>
                                                Default
                                            </button>
                                        </td>
                                    </tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                    <div class="dataTables_wrapper">
                        <div class="dataTables_paginate paging_simple_numbers" id="example23_paginate"><a class="paginate_button previous disabled" aria-controls="example23" data-dt-idx="0" tabindex="0" id="example23_previous">Previous</a><span><a class="paginate_button current" aria-controls="example23" data-dt-idx="1" tabindex="0">1</a><a class="paginate_button " aria-controls="example23" data-dt-idx="2" tabindex="0">2</a><a class="paginate_button " aria-controls="example23" data-dt-idx="3" tabindex="0">3</a><a class="paginate_button " aria-controls="example23" data-dt-idx="4" tabindex="0">4</a><a class="paginate_button " aria-controls="example23" data-dt-idx="5" tabindex="0">5</a><a class="paginate_button " aria-controls="example23" data-dt-idx="6" tabindex="0">6</a></span><a class="paginate_button next" aria-controls="example23" data-dt-idx="7" tabindex="0" id="example23_next">Next</a></div>
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