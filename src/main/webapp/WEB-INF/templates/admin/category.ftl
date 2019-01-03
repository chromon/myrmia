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
                    <li class="breadcrumb-item"><a href="javascript:void(0)">主页</a></li>

                    <li class="breadcrumb-item active">分类/标签管理</li>
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
                            <h4>分类列表</h4>
                        </div>
                        <div class="card-body" id="category_body">
                            <#list categoryList as category>
                            <div class="dropdown category-inline" id="category-${category.mid}">
                                <button class="btn btn-success dropdown-toggle" type="button" data-toggle="dropdown" aria-expanded="false">
                                    ${category.name}
                                    <span class="caret"></span>
                                </button>
                                <ul class="dropdown-menu" x-placement="bottom-start" style="position: absolute; transform: translate3d(0px, 40px, 0px); top: 0px; left: 0px; will-change: transform;">
                                    <li><a href="#">修改</a></li>
                                    <li><a href="javascript:void(0);" onclick="deleteCategory(${category.mid});">删除</a></li>
                                </ul>
                            </div>
                            </#list>
                        </div>
                    </div>
                </div>

                <script type="text/html" id="category_template">
                    <div class="dropdown category-inline">
                        <button class="btn btn-success dropdown-toggle" type="button" data-toggle="dropdown" aria-expanded="false">
                            {{metasDO.name}}
                            <span class="caret"></span>
                        </button>
                        <ul class="dropdown-menu" x-placement="bottom-start" style="position: absolute; transform: translate3d(0px, 40px, 0px); top: 0px; left: 0px; will-change: transform;">
                            <li><a href="javascript:void(0);">修改</a></li>
                            <li><a href="javascript:void(0);" onclick="deleteCategory('{{metasDO.mid}}');">删除</a></li>
                        </ul>
                    </div>
                </script>

                <div class="col-lg-6">
                    <div class="card">
                        <div class="card-title">
                            <h4>标签列表</h4>
                        </div>
                        <div class="card-body">
                            <#list metasList as meta>
                            <div class="dropdown">
                                <button class="btn btn-info dropdown-toggle" type="button" data-toggle="dropdown" aria-expanded="false">
                                    ${meta.name}
                                    <span class="caret"></span></button>
                                <ul class="dropdown-menu" x-placement="bottom-start" style="position: absolute; transform: translate3d(0px, 40px, 0px); top: 0px; left: 0px; will-change: transform;">
                                    <li><a href="#">删除</a></li>
                                </ul>
                            </div>
                            </#list>
                        </div>
                    </div>
                </div>

                <div class="col-lg-6">
                    <div class="card">
                        <div class="form-group form-inline">
                            <input type="text" id="metasName" class="form-control links-right" placeholder="请输入分类名称">
                            <button type="submit" id="categorySubmit" class="btn btn-warning">保存分类</button>
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