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
    <!-- Bootstrap Core CSS -->
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
                <div class="col-12">
                    <div class="card">
                        <div class="card-body">
                            <h4 class="card-title">文件管理</h4>
                            <h6 class="card-subtitle">For multiple file upload put class <code>.dropzone</code> to form.</h6>
                            <form action="#" class="dropzone">
                                <div class="fallback">
                                    <input name="file" type="file" multiple />
                                </div>
                            </form>
                            <div class="row">
                                <div class="col-lg-3 col-md-6 m-b-20"><img src="/resources/admin/images/chair.jpg" class="img-responsive radius"></div>
                                <div class="col-lg-3 col-md-6 m-b-20"><img src="/resources/admin/images/chair.jpg" class="img-responsive radius"></div>
                                <div class="col-lg-3 col-md-6 m-b-20"><img src="/resources/admin/images/chair.jpg" class="img-responsive radius"></div>
                                <div class="col-lg-3 col-md-6 m-b-20"><img src="/resources/admin/images/chair.jpg" class="img-responsive radius"></div>
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
<!-- All Jquery -->
<#include "inc/js.ftl">

</body>

</html>