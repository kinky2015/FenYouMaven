	$(function() {
		//得到焦点
		$("#password").focus(function() {
			$("#left_hand").animate({
				left : "150",
				top : " -38"
			}, {
				step : function() {
					if (parseInt($("#left_hand").css("left")) > 140) {
						$("#left_hand").attr("class", "left_hand");
					}
				}
			}, 2000);
			$("#right_hand").animate({
				right : "-64",
				top : "-38px"
			}, {
				step : function() {
					if (parseInt($("#right_hand").css("right")) > -70) {
						$("#right_hand").attr("class", "right_hand");
					}
				}
			}, 2000);
		});
		//失去焦点
		$("#password").blur(function() {
			$("#left_hand").attr("class", "initial_left_hand");
			$("#left_hand").attr("style", "left:100px;top:-12px;");
			$("#right_hand").attr("class", "initial_right_hand");
			$("#right_hand").attr("style", "right:-112px;top:-12px");
		});
		
		$("#submit").click(function(){
			console.log("login");
			var user = {
					"userName" : $("#username").val(),
					"passWord" : hex_md5($("#password").val())
				};
			$.ajax({
				type : "post",
				url : "login.do",
				data: user,
				success : function(data){
					if (false == data.loginResult) {
						alert("用户名或者密码错误，请重新登录！");
//						document.location.href="pages/login/login.html";
					} else if (true == data.loginResult) {
//						alert("登录成功！");
						document.location.href="pages/home/home.jsp";
					/*	var indexUrl = window.location.protocol+"//"+window.location.host+window.location.pathname+"html/index.html";
						window.location = indexUrl;*/
					}
					
				},
			error : function() {
				alert("服务器发生故障，请尝试重新登录！");
			}
			});
		});
	});