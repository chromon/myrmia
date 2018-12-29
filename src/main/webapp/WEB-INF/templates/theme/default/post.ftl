<!DOCTYPE html>
<html lang="en">
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

<!-- header -->
<#include "inc/header.ftl">
<!-- end header -->

<!-- Start Sample Area -->
<section class="sample-text-area">
    <div class="container">
        <div class="col-lg-10 offset-lg-1">
            <h3 class="text-heading">${contentsDO.title}</h3>
            <ul class="custom-tags">
                <li><a href="#">Travel</a></li>
                <li><a href="#">Life style</a></li>
            </ul>
            <p class="post-date">${contentsDO.created}</p>
            <p class="sample-text">
               ${contentsDO.content}
            </p>
        </div>
    </div>
</section>
<!-- End Sample Area -->

<!-- -->
<section>
    <div class="container">
        <div class="section-top-border">
            <div class="row">
                <div class="col-lg-6 offset-lg-1">
                    <!-- <h3 class="mb-30">Form Element</h3> -->
                    <form action="#">
                        <div class="mt-10">
                            <input type="text" name="first_name" placeholder="First Name" onfocus="this.placeholder = ''" onblur="this.placeholder = 'First Name'" required class="single-input">
                        </div>
                        <div class="mt-10">
                            <input type="text" name="last_name" placeholder="Last Name" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Last Name'" required class="single-input">
                        </div>
                        <div class="mt-10">
                            <textarea class="single-textarea" placeholder="Message" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Message'" required></textarea>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</section>
<!-- -->

<!-- Comment Area -->
<section class="comment-area">
    <div class="container section-top-border2">
        <div class="col-lg-10 offset-lg-1">
            <div class="comments-area">
                <!-- <h4>05 Comments</h4> -->
                <div class="comment-list">
                    <div class="single-comment justify-content-between d-flex">
                        <div class="user justify-content-between d-flex">
                            <div class="thumb">
                                <img src="/resources/theme/default/img/i1.jpg" alt="">
                            </div>
                            <div class="desc">
                                <h5><a href="#">Emilly Blunt</a></h5>
                                <p class="date">December 4, 2017 at 3:12 pm </p>
                                <p class="comment">
                                    Never say goodbye till the end comes!
                                </p>
                            </div>
                        </div>
                        <div class="reply-btn">
                            <a href="#" class="genric-btn primary radius medium">Default</a>
                        </div>
                    </div>
                </div>
                <div class="comment-list left-padding">
                    <div class="single-comment justify-content-between d-flex">
                        <div class="user justify-content-between d-flex">
                            <div class="thumb">
                                <img src="/resources/theme/default/img/i1.jpg" alt="">
                            </div>
                            <div class="desc">
                                <h5><a href="#">Elsie Cunningham</a></h5>
                                <p class="date">December 4, 2017 at 3:12 pm </p>
                                <p class="comment">
                                    Never say goodbye till the end comes!
                                </p>
                            </div>
                        </div>
                        <div class="reply-btn">
                            <a href="#" class="genric-btn primary radius medium">Default</a>
                        </div>
                    </div>
                </div>
                <div class="comment-list left-padding">
                    <div class="single-comment justify-content-between d-flex">
                        <div class="user justify-content-between d-flex">
                            <div class="thumb">
                                <img src="/resources/theme/default/img/i1.jpg" alt="">
                            </div>
                            <div class="desc">
                                <h5><a href="#">Annie Stephens</a></h5>
                                <p class="date">December 4, 2017 at 3:12 pm </p>
                                <p class="comment">
                                    Never say goodbye till the end comes!
                                </p>
                            </div>
                        </div>
                        <div class="reply-btn">
                            <a href="#" class="genric-btn primary radius medium">Default</a>
                        </div>
                    </div>
                </div>
                <div class="comment-list">
                    <div class="single-comment justify-content-between d-flex">
                        <div class="user justify-content-between d-flex">
                            <div class="thumb">
                                <img src="/resources/theme/default/img/i1.jpg" alt="">
                            </div>
                            <div class="desc">
                                <h5><a href="#">Maria Luna</a></h5>
                                <p class="date">December 4, 2017 at 3:12 pm </p>
                                <p class="comment">
                                    Never say goodbye till the end comes!
                                </p>
                            </div>
                        </div>
                        <div class="reply-btn">
                            <a href="#" class="genric-btn primary radius medium">Default</a>
                        </div>
                    </div>
                </div>
            </div>

            <nav class="blog-pagination justify-content-center d-flex">
                <ul class="pagination">
                    <li class="page-item">
                        <a href="#" class="page-link" aria-label="Previous">
                            <span aria-hidden="true">
                                <span class="lnr lnr-chevron-left"></span>
                            </span>
                        </a>
                    </li>
                    <li class="page-item"><a href="#" class="page-link">01</a></li>
                    <li class="page-item active"><a href="#" class="page-link">02</a></li>
                    <li class="page-item"><a href="#" class="page-link">03</a></li>
                    <li class="page-item"><a href="#" class="page-link">04</a></li>
                    <li class="page-item"><a href="#" class="page-link">09</a></li>
                    <li class="page-item">
                        <a href="#" class="page-link" aria-label="Next">
                            <span aria-hidden="true">
                                <span class="lnr lnr-chevron-right"></span>
                            </span>
                        </a>
                    </li>
                </ul>
            </nav>
        </div>
    </div>
</section>
<!-- End Comment Area -->


<!-- footer -->
<#include "inc/footer.ftl">
<!-- end footer -->


<!-- js -->
<#include "inc/js.ftl">
<!-- end js -->
</body>
</html>