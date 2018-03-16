/**
 * 公用js文件
 */
//添加复选按钮事件
$(function() {
	$('input:checkbox.chks').each(function() {
		$(this).on("click", function() {
			if ($(this).parent("span").attr("class") === "checked") {
				$(this).parent("span").removeClass("checked");
			} else {
				$(this).parent("span").addClass("checked");
			}
		});
	});
});
//全选事件
$("#chkall").on("click", function() {
	if ($(this).parent("span").attr("class") === "checked") {
		$(this).parent("span").removeClass("checked");
		$('input:checkbox.chks').parent("span").removeClass("checked");
	} else {
		$(this).parent("span").addClass("checked");
		$('input:checkbox.chks').parent("span").addClass("checked");
	}
});

