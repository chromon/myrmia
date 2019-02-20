
<!-- Left Sidebar  -->
<div class="left-sidebar">
    <!-- Sidebar scroll-->
    <div class="scroll-sidebar">
        <!-- Sidebar navigation-->
        <nav class="sidebar-nav">
            <ul id="sidebarnav">
                <li class="nav-devider"></li>
                <li class="nav-label">仪表盘</li>
                <li <#if active ?? && active == "home">class="active"</#if>>
                    <a href="/admin/index" aria-expanded="false">
                        <i class="fa fa-home"></i>
                        <span class="hide-menu">
                            主页
                        </span>
                    </a>
                </li>
                <li class="nav-label">文章</li>
                <li <#if active ?? && active == "publish">class="active"</#if>>
                    <a class="" href="/admin/publish" aria-expanded="false">
                        <i class="fa fa-pencil"></i>
                        <span class="hide-menu">
                            发布文章
                        </span>
                    </a>
                </li>
                <li <#if active ?? && active == "article">class="active"</#if>>
                    <a class="" href="/admin/article" aria-expanded="false">
                        <i class="fa fa-list"></i>
                        <span class="hide-menu">
                            文章管理
                        </span>
                    </a>
                </li>
                <li class="nav-label">页面</li>
                <li <#if active ?? && active == "page">class="active"</#if>>
                    <a class="" href="/admin/page" aria-expanded="false">
                        <i class="fa fa-plus-square-o"></i>
                        <span class="hide-menu">
                            页面管理
                        </span>
                    </a>
                </li>
                <li class="nav-label">标签</li>
                <li <#if active ?? && active == "category">class="active"</#if>>
                    <a class="" href="/admin/category" aria-expanded="false">
                        <i class="fa fa-tags"></i>
                        <span class="hide-menu">
                            分类/标签
                        </span>
                    </a>
                </li>
                <li class="nav-label">文件</li>
                <li <#if active ?? && active == "attach">class="active"</#if>>
                    <a class="" href="/admin/attach" aria-expanded="false">
                        <i class="fa fa-cloud-upload"></i>
                        <span class="hide-menu">
                            文件管理
                        </span>
                    </a>
                </li>
                <li class="nav-label">关联</li>
                <li <#if active ?? && active == "links">class="active"</#if>>
                    <a class="" href="/admin/links" aria-expanded="false">
                        <i class="fa fa-link"></i>
                        <span class="hide-menu">
                            友链管理
                        </span>
                    </a>
                </li>
                <li class="nav-label">设置</li>
                <li <#if active ?? && active == "setting">class="active"</#if>>
                    <a class="" href="/admin/setting" aria-expanded="false">
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