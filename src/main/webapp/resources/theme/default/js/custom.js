/**
 * custom js
 * Created by Ellery on 2018/12/4.
 */
// 获取 base path
let localObj = window.location;
let basePath = localObj.protocol + "//" + localObj.host;

// 检查网站标题
function checkSiteTitle() {
    let siteTitle = $('#siteTitle').val().trim();
    let errorText = $('#install_error');

    let len_en = 0;
    let len_cn = 0;

    // 获取字符串长度，中文算两个字符
    for (let i = 0; i < siteTitle.length; i ++) {
        let a = siteTitle.charAt(i);
        if (a.match(/[^\x00-\xff]/ig) != null) {
            len_cn += 2;
        } else {
            len_en += 1;
        }
    }

    let label_text1 = '网站名称最短为2个汉字或3个英文字符';
    let label_text2 = '网站名称最长为50个汉字或100个英文字符';

    if (len_cn < 1) {
        if (len_en < 3) {
            // 全英文少于 3 个字母
            errorText.text(label_text1);
            return false;
        } else if (20 < len_en) {
            // 全英文大于 20 个字母
            errorText.text(label_text2);
            return false;
        }
    }

    if (len_en < 1) {
        if (len_cn < 4) {
            // 全中文少于 2 个汉字
            errorText.text(label_text1);
            return false;
        } else if (20 < len_cn) {
            // 全中文大于 10 个汉字
            errorText.text(label_text2);
            return false;
        }
    }

    if ((2 < len_cn) && (1 < len_en) && (20 < len_cn + len_en)) {
        // 中英文混合，且长度大于 20
        errorText.text(label_text2);
        return false;
    }

    errorText.text('');
    return true;
}
$('#siteTitle').on('blur', checkSiteTitle);

// 检查网站 URL
function checkSiteURL() {
    let siteURL = $('#siteURL').val().trim();
    let errorText = $('#install_error');
    if (siteURL.length <= 0) {
        errorText.text('网站地址不能为空，未绑定域名请输入 http://ip:port');
        return false;
    }
    errorText.text('');
    return true;
}
$('#siteURL').on('blur', checkSiteURL);

// 校验用户名
function checkAdminUser() {
    let adminUser = $('#adminUser').val().trim();
    let errorText = $('#install_error');
    let reg = /^[a-zA-Z]{1}([a-zA-Z0-9]|[._]){4,19}$/;
    if (!reg.test(adminUser)) {
        errorText.text('请输入5-20位的用户名');
        return false;
    }
    errorText.text('');
    return true;
}
$('#adminUser').on('blur', checkAdminUser);

// 检查邮箱地址
function checkAdminEmail() {
    let email = $('#adminEmail').val().trim();
    let errorText = $('#install_error');
    let reg = /^[a-zA-Z_0-9.-]{1,64}@([a-zA-Z0-9-]{1,200}.){1,5}[a-zA-Z]{1,6}$/;
    if (!reg.test(email)) {
        errorText.text('请输入正确的邮箱地址');
        return false;
    }
    errorText.text('');
    return true;
}
$('#adminEmail').on('blur', checkAdminEmail);

// 检查密码
function checkAdminPwd() {
    let password = $('#adminPwd').val().trim();
    let errorText = $('#install_error');
    let reg = /^[a-zA-Z][a-zA-Z0-9_]{5,127}$/;
    if (!reg.test(password)) {
        errorText.text('请输入6-128位的密码');
        return false;
    }

    errorText.text('');
    return true;
}
$('#adminPwd').on('blur', checkAdminPwd);

// 检查密码是否一致
function checkAdminPwdConfirm() {
    let password = $('#adminPwd').val().trim();
    let passwordConfirm = $('#adminPwdConfirm').val().trim();
    let errorText = $('#install_error');

    if (password != passwordConfirm) {
        errorText.text('两次密码不一致');
        return false;
    }

    errorText.text('');
    return true;
}
$('#adminPwdConfirm').on('blur', checkAdminPwdConfirm);

// 安装信息
$('#install_submit').on('click', function () {

    if (checkSiteTitle() & checkSiteURL() & checkAdminUser()
        & checkAdminEmail() & checkAdminPwd() & checkAdminPwdConfirm()) {

        let siteTitle = $('#siteTitle').val();
        let siteURL = $('#siteURL').val();
        let adminUser = $('#adminUser').val();
        let adminEmail = $('#adminEmail').val();
        let adminPwd = $('#adminPwd').val();

        let data = {
            siteTitle: siteTitle,
            siteURL: siteURL,
            adminUser: adminUser,
            adminEmail: adminEmail,
            adminPwd: adminPwd
        };

        $.ajax({
            type: "POST",
            url: basePath + '/save_install_info',
            data: data,
            dataType: "text",
            success: function(data) {
                console.log(data);

                $('#site_install_success').removeClass('hide');
                $('#site_setting').addClass('hide');
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
});
