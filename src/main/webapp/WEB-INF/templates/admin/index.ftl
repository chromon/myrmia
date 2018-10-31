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
    <link href="/resources/admin/css/bootstrap.min.css" rel="stylesheet">
    <!-- Custom CSS -->

    <!--     <link href="css/lib/calendar2/semantic.ui.min.css" rel="stylesheet">
        <link href="css/lib/calendar2/pignose.calendar.min.css" rel="stylesheet">
        <link href="css/lib/owl.carousel.min.css" rel="stylesheet" />
        <link href="css/lib/owl.theme.default.min.css" rel="stylesheet" /> -->
    <link href="/resources/admin/css/helper.css" rel="stylesheet">
    <link href="/resources/admin/css/style.css" rel="stylesheet">
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:** -->
    <!--[if lt IE 9]>
    <script src="https:**oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https:**oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body class="fix-header fix-sidebar">
<!-- Preloader - style you can find in spinners.css -->
<div class="preloader">
    <svg class="circular" viewBox="25 25 50 50">
        <circle class="path" cx="50" cy="50" r="20" fill="none" stroke-width="2" stroke-miterlimit="10" /> </svg>
</div>
<!-- Main wrapper  -->
<div id="main-wrapper">
    <!-- header header  -->
    <div class="header">
        <nav class="navbar top-navbar navbar-expand-md navbar-light">
            <!-- Logo -->
            <div class="navbar-header">
                <a class="navbar-brand" href="index.html">
                    <!-- Logo icon -->
                    <b><img src="/resources/admin/images/logo.png" alt="homepage" class="dark-logo" /></b>
                    <!--End Logo icon -->
                    <!-- Logo text -->
                    <span><img src="/resources/admin/images/logo-text.png" alt="homepage" class="dark-logo" /></span>
                </a>
            </div>
            <!-- End Logo -->
            <div class="navbar-collapse">
                <!-- toggle and nav items -->
                <ul class="navbar-nav mr-auto mt-md-0">
                    <li class="nav-item m-l-10"> <a class="nav-link sidebartoggler hidden-sm-down text-muted  " href="javascript:void(0)"><i class="fa fa-bars"></i></a> </li>
                </ul>
                <!-- User profile and search -->
                <ul class="navbar-nav my-lg-0">

                    <!-- Search -->
                    <li class="nav-item hidden-sm-down search-box"> <a class="nav-link hidden-sm-down text-muted  " href="javascript:void(0)"><i class="fa fa-search"></i></a>
                        <form class="app-search">
                            <input type="text" class="form-control" placeholder="Search here"> <a class="srh-btn"><i class="fa fa-close"></i></a> </form>
                    </li>
                    <!-- Comment -->
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle text-muted text-muted  " href="#" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> <i class="fa fa-bell"></i>
                            <div class="notify"> <span class="heartbit"></span> <span class="point"></span> </div>
                        </a>
                        <div class="dropdown-menu dropdown-menu-right mailbox animated zoomIn">
                            <ul>
                                <li>
                                    <div class="drop-title">Notifications</div>
                                </li>
                                <li>
                                    <div class="message-center">
                                        <!-- Message -->
                                        <a href="#">
                                            <div class="btn btn-danger btn-circle m-r-10"><i class="fa fa-link"></i></div>
                                            <div class="mail-contnet">
                                                <h5>This is title</h5> <span class="mail-desc">Just see the my new admin!</span> <span class="time">9:30 AM</span>
                                            </div>
                                        </a>
                                        <!-- Message -->
                                        <a href="#">
                                            <div class="btn btn-success btn-circle m-r-10"><i class="fa fa-calendar"></i></div>
                                            <div class="mail-contnet">
                                                <h5>This is another title</h5> <span class="mail-desc">Just a reminder that you have event</span> <span class="time">9:10 AM</span>
                                            </div>
                                        </a>
                                        <!-- Message -->
                                        <a href="#">
                                            <div class="btn btn-info btn-circle m-r-10"><i class="fa fa-settings"></i></div>
                                            <div class="mail-contnet">
                                                <h5>This is title</h5> <span class="mail-desc">You can customize this template as you want</span> <span class="time">9:08 AM</span>
                                            </div>
                                        </a>
                                        <!-- Message -->
                                        <a href="#">
                                            <div class="btn btn-primary btn-circle m-r-10"><i class="fa fa-user"></i></div>
                                            <div class="mail-contnet">
                                                <h5>This is another title</h5> <span class="mail-desc">Just see the my admin!</span> <span class="time">9:02 AM</span>
                                            </div>
                                        </a>
                                    </div>
                                </li>
                                <li>
                                    <a class="nav-link text-center" href="javascript:void(0);"> <strong>Check all notifications</strong> <i class="fa fa-angle-right"></i> </a>
                                </li>
                            </ul>
                        </div>
                    </li>
                    <!-- End Comment -->
                    <!-- Messages -->
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle text-muted  " href="#" id="2" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> <i class="fa fa-envelope"></i>
                            <div class="notify"> <span class="heartbit"></span> <span class="point"></span> </div>
                        </a>
                        <div class="dropdown-menu dropdown-menu-right mailbox animated zoomIn" aria-labelledby="2">
                            <ul>
                                <li>
                                    <div class="drop-title">You have 4 new messages</div>
                                </li>
                                <li>
                                    <div class="message-center">
                                        <!-- Message -->
                                        <a href="#">
                                            <div class="user-img"> <img src="/resources/admin/images/7.jpg" alt="user" class="img-circle"> <span class="profile-status online pull-right"></span> </div>
                                            <div class="mail-contnet">
                                                <h5>Michael Qin</h5> <span class="mail-desc">Just see the my admin!</span> <span class="time">9:30 AM</span>
                                            </div>
                                        </a>
                                        <!-- Message -->
                                        <a href="#">
                                            <div class="user-img"> <img src="/resources/admin/images/7.jpg" alt="user" class="img-circle"> <span class="profile-status busy pull-right"></span> </div>
                                            <div class="mail-contnet">
                                                <h5>John Doe</h5> <span class="mail-desc">I've sung a song! See you at</span> <span class="time">9:10 AM</span>
                                            </div>
                                        </a>
                                        <!-- Message -->
                                        <a href="#">
                                            <div class="user-img"> <img src="/resources/admin/images/7.jpg" alt="user" class="img-circle"> <span class="profile-status away pull-right"></span> </div>
                                            <div class="mail-contnet">
                                                <h5>Mr. John</h5> <span class="mail-desc">I am a singer!</span> <span class="time">9:08 AM</span>
                                            </div>
                                        </a>
                                        <!-- Message -->
                                        <a href="#">
                                            <div class="user-img"> <img src="/resources/admin/images/7.jpg" alt="user" class="img-circle"> <span class="profile-status offline pull-right"></span> </div>
                                            <div class="mail-contnet">
                                                <h5>Michael Qin</h5> <span class="mail-desc">Just see the my admin!</span> <span class="time">9:02 AM</span>
                                            </div>
                                        </a>
                                    </div>
                                </li>
                                <li>
                                    <a class="nav-link text-center" href="javascript:void(0);"> <strong>See all e-Mails</strong> <i class="fa fa-angle-right"></i> </a>
                                </li>
                            </ul>
                        </div>
                    </li>
                    <!-- End Messages -->
                    <!-- Profile -->
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle text-muted  " href="#" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><img src="/resources/admin/images/7.jpg" alt="user" class="profile-pic" /></a>
                        <div class="dropdown-menu dropdown-menu-right animated zoomIn">
                            <ul class="dropdown-user">
                                <li><a href="#"><i class="fa fa-user"></i> Profile</a></li>
                                <li><a href="#"><i class="fa fa-cog"></i> Setting</a></li>
                                <li><a href="#"><i class="fa fa-power-off"></i> Logout</a></li>
                            </ul>
                        </div>
                    </li>
                </ul>
            </div>
        </nav>
    </div>
    <!-- End header header -->
    <!-- Left Sidebar  -->
    <div class="left-sidebar">
        <!-- Sidebar scroll-->
        <div class="scroll-sidebar">
            <!-- Sidebar navigation-->
            <nav class="sidebar-nav">
                <ul id="sidebarnav">
                    <li class="nav-devider"></li>
                    <li class="nav-label">仪表盘</li>
                    <li>
                        <a href="#" aria-expanded="false">
                            <i class="fa fa-home"></i>
                            <span class="hide-menu">
                                    主页
                                </span>
                        </a>
                    </li>
                    <li class="nav-label">文章</li>
                    <li>
                        <a class="" href="#" aria-expanded="false">
                            <i class="fa fa-pencil"></i>
                            <span class="hide-menu">
                                    发布文章
                                </span>
                        </a>
                    </li>
                    <li>
                        <a class="" href="#" aria-expanded="false">
                            <i class="fa fa-list"></i>
                            <span class="hide-menu">
                                    文章管理
                                </span>
                        </a>
                    </li>
                    <li class="nav-label">页面</li>
                    <li>
                        <a class="" href="#" aria-expanded="false">
                            <i class="fa fa-plus-square-o"></i>
                            <span class="hide-menu">
                                    页面管理
                                </span>
                        </a>
                    </li>
                    <li class="nav-label">标签</li>
                    <li>
                        <a class="" href="#" aria-expanded="false">
                            <i class="fa fa-tags"></i>
                            <span class="hide-menu">
                                    分类/标签
                                </span>
                        </a>
                    </li>
                    <li class="nav-label">文件</li>
                    <li>
                        <a class="" href="#" aria-expanded="false">
                            <i class="fa fa-cloud-upload"></i>
                            <span class="hide-menu">
                                    文件管理
                                </span>
                        </a>
                    </li>
                    <li class="nav-label">关联</li>
                    <li>
                        <a class="" href="#" aria-expanded="false">
                            <i class="fa fa-link"></i>
                            <span class="hide-menu">
                                    友链管理
                                </span>
                        </a>
                    </li>
                    <li class="nav-label">设置</li>
                    <li>
                        <a class="" href="#" aria-expanded="false">
                            <i class="fa fa-cog"></i>
                            <span class="hide-menu">
                                    系统设置
                                </span>
                        </a>
                    </li>
                </ul>
            </nav>
            <!-- End Sidebar navigation -->
        </div>
        <!-- End Sidebar scroll-->
    </div>
    <!-- End Left Sidebar  -->
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
                                <h2>568120</h2>
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

                                    <tr>
                                        <td>John Abraham</td>
                                        <td><span>iBook</span></td>
                                        <td><span class="badge badge-success">5</span></td>
                                    </tr>
                                    <tr>
                                        <td>John Abraham</td>
                                        <td><span>iPhone</span></td>
                                        <td><span class="badge badge-success">0</span></td>
                                    </tr>
                                    <tr>
                                        <td>John Abraham</td>
                                        <td><span>456 pcs</span></td>
                                        <td><span class="badge badge-success">12</span></td>
                                    </tr>
                                    <tr>
                                        <td>John Abraham</td>
                                        <td><span>iBook</span></td>
                                        <td><span class="badge badge-success">3</span></td>
                                    </tr>
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
<!-- All Jquery -->
<script src="/resources/admin/js/jquery.min.js"></script>
<!-- Bootstrap tether Core JavaScript -->
<!-- <script src="js/lib/bootstrap/js/popper.min.js"></script> -->
<!-- <script src="static/jsbootstrap.min.js"></script> -->
<!-- slimscrollbar scrollbar JavaScript -->
<script src="/resources/admin/js/jquery.slimscroll.js"></script>
<!--Menu sidebar -->
<script src="/resources/admin/js/sidebarmenu.js"></script>
<!--stickey kit -->
<script src="/resources/admin/js/sticky-kit.min.js"></script>
<!--Custom JavaScript -->

<script src="/resources/admin/js/custom.min.js"></script>

</body>

</html>