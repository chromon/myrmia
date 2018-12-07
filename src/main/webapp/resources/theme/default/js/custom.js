/**
 * custom js
 * Created by Ellery on 2018/12/4.
 */
// 获取 base path
let localObj = window.location;
let basePath = localObj.protocol + "//" + localObj.host;

// 安装信息
$('#install_submit').on('click', function () {

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
});
