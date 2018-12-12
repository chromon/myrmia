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
            sendFile(files[0], editor, $editable);
        }
    }
});

function sendFile(file, editor, welEditable) {
    let data = new FormData();
    data.append("file", file);
    $.ajax({
        data: data,
        type: "POST",
        url: basePath +"/admin/imgUpload",
        cache: false,
        contentType: false,
        processData: false,
        dataType: "json",
        success: function(imageUrl) {
            console.log('1--'+ imageUrl);
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