/**
 * admin custom.js
 * Created by Ellery on 2018/12/7.
 */
// 获取 base path
let localObj = window.location;
let basePath = localObj.protocol + "//" + localObj.host;

// 校验用户名
function checkAdminUser() {
    let adminUser = $('#adminUser').val().trim();
    let errorText = $('#login_error');
    let reg = /^[a-zA-Z]{1}([a-zA-Z0-9]|[._]){4,19}$/;
    if (!reg.test(adminUser)) {
        errorText.text('请输入5-20位的用户名');
        return false;
    }
    errorText.text('');
    return true;
}
$('#adminUser').on('blur', checkAdminUser);

// 校验密码
function checkAdminPWD() {
    let adminPwd = $('#adminPwd').val().trim();
    let errorText = $('#login_error');
    let reg = /^[a-zA-Z][a-zA-Z0-9_]{5,19}$/;
    if (!reg.test(adminPwd)) {
        errorText.text('请输入6-20位的密码');
        return false;
    }

    errorText.text('');
    return true;
}
$('#adminPwd').on('blur', checkAdminPWD);

// 登录
$('#loginBtn').on('click', function () {
    if (checkAdminUser() && checkAdminPWD()) {
        $('#loginForm').submit();
    }
});

// 发布
$('#summernote').summernote({
    lang: 'zh-CN',
    height: 340,
    placeholder: '写点儿什么吧...',
    callbacks:{
        onImageUpload: function (files, editor, $editable) { //the onImageUpload API
            uploadFile(files[0], editor, $editable);
        },
        onMediaDelete: function (target) {
            deleteFile(target);
        }
    }
});

// 上传图片
function uploadFile(file, editor, welEditable) {
    let data = new FormData();
    data.append('file', file);
    $.ajax({
        data: data,
        type: 'POST',
        url: basePath + '/admin/imgUpload',
        cache: false,
        contentType: false,
        processData: false,
        dataType: 'json',
        success: function(imageUrl) {
            // console.log('1--'+ imageUrl);
            $('#summernote').summernote('editor.insertImage', imageUrl);
        },
        error: function(jqXHR, textStatus, errorThrown) {
            console.log('responseText: ' + jqXHR.responseText);
            console.log('status: ' + jqXHR.status);
            console.log('readyState: ' + jqXHR.readyState);
            console.log('statusText: ' + jqXHR.statusText);

            console.log('textStatus: ' + textStatus);
            console.log('errorThrown: ' + errorThrown);
        }
    });
}

// 删除图片
function deleteFile(target) {
    let imgSrc = target[0].currentSrc;
    let data = new FormData();
    data.append('imgSrc', imgSrc);
    $.ajax({
        data: data,
        type: 'POST',
        url: basePath + '/admin/imgDelete',
        cache: false,
        contentType: false,
        processData: false,
        success: function (data) {
            if (data == false) {
                console.log('删除图片出错！');
            }
        },
        error: function(jqXHR, textStatus, errorThrown) {
            console.log('responseText: ' + jqXHR.responseText);
            console.log('status: ' + jqXHR.status);
            console.log('readyState: ' + jqXHR.readyState);
            console.log('statusText: ' + jqXHR.statusText);

            console.log('textStatus: ' + textStatus);
            console.log('errorThrown: ' + errorThrown);
        }
    });
}

// 保存分类
$('#categorySubmit').on('click', function() {
    let metasName = $('#metasName').val();
    let data = {
        metasName: metasName
    };

    $.ajax({
        data: data,
        type: 'POST',
        url: basePath + '/admin/addCategory',
        cache: false,
        success: function (data) {
            console.log(data);

            let html = template("category_template", {metasDO:data});
            $("#category_body").append(html);
        },
        error: function(jqXHR, textStatus, errorThrown) {
            console.log('responseText: ' + jqXHR.responseText);
            console.log('status: ' + jqXHR.status);
            console.log('readyState: ' + jqXHR.readyState);
            console.log('statusText: ' + jqXHR.statusText);

            console.log('textStatus: ' + textStatus);
            console.log('errorThrown: ' + errorThrown);
        }
    });
});

// 删除分类
function deleteCategory(mid) {
    let data = {
        mid: mid
    };

    $.ajax({
        data: data,
        type: 'POST',
        url: basePath + '/admin/deleteCategory',
        cache: false,
        success: function (data) {
            console.log(data);
            $('#category-' + mid).addClass('hide');
        },
        error: function(jqXHR, textStatus, errorThrown) {
            console.log('responseText: ' + jqXHR.responseText);
            console.log('status: ' + jqXHR.status);
            console.log('readyState: ' + jqXHR.readyState);
            console.log('statusText: ' + jqXHR.statusText);

            console.log('textStatus: ' + textStatus);
            console.log('errorThrown: ' + errorThrown);
        }
    });
}

// 发布文章
$('#articlePublish').on('click', function() {
    let articleTitle = $('#articleTitle').val();
    let articleSlug = $('#articleSlug').val();
    let articleTags = $('#articleTags').val();
    let articleCategory = $('#articleCategory').val();

    let articleContent = $('#summernote').summernote('code');

    let allowComment = $('#allowComment').is(':checked');
    let allowPing = $('#allowPing').is(':checked');
    let allowFeed = $('#allowFeed').is(':checked');

    let edit = false;

    let data = {
        articleTitle: articleTitle,
        articleSlug: articleSlug,
        articleTags: articleTags,
        articleCategory: articleCategory,
        articleContent: articleContent,
        allowComment: allowComment,
        allowPing: allowPing,
        allowFeed: allowFeed,
        edit: edit
    };

    $.ajax({
        data: data,
        type: 'POST',
        url: basePath + '/admin/postArticle',
        cache: false,
        success: function (data) {
            // console.log(data);
            if (data) {
                window.location.href = "/admin/article";
            }
        },
        error: function(jqXHR, textStatus, errorThrown) {
            console.log('responseText: ' + jqXHR.responseText);
            console.log('status: ' + jqXHR.status);
            console.log('readyState: ' + jqXHR.readyState);
            console.log('statusText: ' + jqXHR.statusText);

            console.log('textStatus: ' + textStatus);
            console.log('errorThrown: ' + errorThrown);
        }
    });
});

// 保存文章草稿
$('#articleDraft').on('click', function() {

    let articleTitle = $('#articleTitle').val();
    let articleSlug = $('#articleSlug').val();
    let articleTags = $('#articleTags').val();
    let articleCategory = $('#articleCategory').val();

    let articleContent = $('#summernote').summernote('code');

    let allowComment = $('#allowComment').is(':checked');
    let allowPing = $('#allowPing').is(':checked');
    let allowFeed = $('#allowFeed').is(':checked');

    let data = {
        articleTitle: articleTitle,
        articleSlug: articleSlug,
        articleTags: articleTags,
        articleCategory: articleCategory,
        articleContent: articleContent,
        allowComment: allowComment,
        allowPing: allowPing,
        allowFeed: allowFeed
    };

    $.ajax({
        data: data,
        type: 'POST',
        url: basePath + '/admin/postArticleDraft',
        cache: false,
        success: function (data) {
            // console.log(data);
            if (data) {
                window.location.href = "/admin/article";
            }
        },
        error: function(jqXHR, textStatus, errorThrown) {
            console.log('responseText: ' + jqXHR.responseText);
            console.log('status: ' + jqXHR.status);
            console.log('readyState: ' + jqXHR.readyState);
            console.log('statusText: ' + jqXHR.statusText);

            console.log('textStatus: ' + textStatus);
            console.log('errorThrown: ' + errorThrown);
        }
    });
});

// 发布编辑文章
function editArticlePublish(cid) {


    let articleTitle = $('#articleTitle').val();
    let articleSlug = $('#articleSlug').val();
    let articleTags = $('#articleTags').val();
    let articleCategory = $('#articleCategory').val();

    let articleContent = $('#summernote').summernote('code');

    let allowComment = $('#allowComment').is(':checked');
    let allowPing = $('#allowPing').is(':checked');
    let allowFeed = $('#allowFeed').is(':checked');

    let edit = true;

    let data = {
        articleTitle: articleTitle,
        articleSlug: articleSlug,
        articleTags: articleTags,
        articleCategory: articleCategory,
        articleContent: articleContent,
        allowComment: allowComment,
        allowPing: allowPing,
        allowFeed: allowFeed,
        cid: cid,
        edit: edit
    };

    $.ajax({
        data: data,
        type: 'POST',
        url: basePath + '/admin/postArticle',
        cache: false,
        success: function (data) {
            // console.log(data);
            if (data) {
                window.location.href = "/admin/article";
            }
        },
        error: function(jqXHR, textStatus, errorThrown) {
            console.log('responseText: ' + jqXHR.responseText);
            console.log('status: ' + jqXHR.status);
            console.log('readyState: ' + jqXHR.readyState);
            console.log('statusText: ' + jqXHR.statusText);

            console.log('textStatus: ' + textStatus);
            console.log('errorThrown: ' + errorThrown);
        }
    });
}

// 删除文章
function deleteArticle(cid) {
    let data = {
        cid: cid
    };

    $.ajax({
        data: data,
        type: 'POST',
        url: basePath + '/admin/deleteArticle',
        cache: false,
        success: function (data) {
            // console.log(data);
            if (data) {
                $('#content_list_' + cid).addClass('hide');
            }
        },
        error: function(jqXHR, textStatus, errorThrown) {
            console.log('responseText: ' + jqXHR.responseText);
            console.log('status: ' + jqXHR.status);
            console.log('readyState: ' + jqXHR.readyState);
            console.log('statusText: ' + jqXHR.statusText);

            console.log('textStatus: ' + textStatus);
            console.log('errorThrown: ' + errorThrown);
        }
    });
}

// 编辑文章
function editArticle(cid) {
    let data = {
        cid: cid
    };

    $.ajax({
        data: data,
        type: 'POST',
        url: basePath + '/admin/editArticle',
        cache: false,
        success: function (data) {
            console.log(data);
        },
        error: function(jqXHR, textStatus, errorThrown) {
            console.log('responseText: ' + jqXHR.responseText);
            console.log('status: ' + jqXHR.status);
            console.log('readyState: ' + jqXHR.readyState);
            console.log('statusText: ' + jqXHR.statusText);

            console.log('textStatus: ' + textStatus);
            console.log('errorThrown: ' + errorThrown);
        }
    });
}