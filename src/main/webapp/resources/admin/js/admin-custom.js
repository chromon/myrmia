/**
 * admin custom.js
 * Created by Ellery on 2018/12/7.
 */

// 校验用户名
function checkAdminUser() {
    let adminUser = $('#adminUser').val().trim();
    let errorText = $('#login_error');
    let reg = /^[a-zA-Z]{1}([a-zA-Z0-9]|[._]){4,19}$/;
    if (!reg.test(adminUser)) {
        errorText.text('请输入5-20位的密码');
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