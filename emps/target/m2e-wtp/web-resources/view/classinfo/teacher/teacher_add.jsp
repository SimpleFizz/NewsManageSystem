<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>首页</title>
<!-- 新 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/css/bootstrap.min.css">
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="${pageContext.request.contextPath }/js/jquery.min.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="${pageContext.request.contextPath }/js/bootstrap.min.js"></script>
</head>

<body>
	<div style="padding: 0px; margin: 0px;">
		<ul class="breadcrumb" style="margin: 0px;">
			<li><a href="#">系统管理</a></li>
			<li>教师管理</li>
			<li>添加教师</li>
		</ul>
	</div>

	<form
		action="${pageContext.request.contextPath }/TeacherController/staffinfoAdd.action"
		class="form-horizontal" method="post">
		<div class="row">
			<div class="col-sm-3 col-sm-offset-4">
				<input type="submit" class="btn btn-success" value="保存" /> <input
					type="reset" class="btn  btn-danger" value="取消" />
			</div>
		</div>
		<h5 class="page-header alert-info"
			style="padding: 10px; margin: 0px; margin-bottom: 5px;">基本信息</h5>
		<div class="row">
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">编号</label>
					<div class="col-sm-9">
						<input type="text" name="staffId" class="form-control input-sm"
							readonly="readonly" placeholder="请输入编号" />
					</div>
				</div>

			</div>
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">姓名</label>
					<div class="col-sm-9">
						<input type="text" name="staffName" class="form-control input-sm"
							placeholder="请输入姓名" />
					</div>
				</div>
			</div>

		</div>
		<!-- 开始2 -->
		<div class="row">
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">年龄</label>
					<div class="col-sm-5">
						<input type="text" name="staffAge" class="form-control input-sm"
							placeholder="请输入年龄" />
					</div>
				</div>

			</div>
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">性别</label>
					<div class="col-sm-4">

						<select class="form-control input-sm" name="staffSex">
							<option selected value="男">男</option>
							<option value="女">女</option>
						</select>

					</div>
				</div>
			</div>
		</div>
		<!-- 结束2 -->
		<!-- 开始3 -->
		<div class="row">
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">籍贯</label>
					<div class="col-sm-6">
						<input type="text" name="" class="form-control input-sm"
							placeholder="请输入籍贯" />
					</div>
				</div>

			</div>
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">身份证</label>
					<div class="col-sm-9">
						<input type="text" name="staffIdcard"
							class="form-control input-sm" placeholder="请输入身份证号码" />
					</div>
				</div>
			</div>
		</div>
		<!-- 结束3 -->
		<!-- 开始4 -->
		<div class="row">
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">出生日期</label>
					<div class="col-sm-9">
						<input type="text" name="" class="form-control input-sm"
							placeholder="请输入出生日期" />
					</div>
				</div>

			</div>
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">办公电话</label>
					<div class="col-sm-9">
						<input type="text" name="staffOfficePhone"
							class="form-control input-sm" placeholder="请输入办公电话" />
					</div>
				</div>
			</div>
		</div>
		<!-- 结束4 -->
		<!-- 开始4 -->
		<div class="row">
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">电子邮件</label>
					<div class="col-sm-9">
						<input type="text" name="staffEamil" class="form-control input-sm"
							placeholder="请输入电子邮件" />
					</div>
				</div>

			</div>
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">移动电话</label>
					<div class="col-sm-9">
						<input type="text" name="staffMobilePhone"
							class="form-control input-sm" placeholder="请输入移动电话" />
					</div>
				</div>
			</div>
		</div>
		<!-- 结束4 -->
		<!-- 开始5 -->
		<div class="row">
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">家庭住址</label>
					<div class="col-sm-9">
						<input type="text" name="staffAddr" class="form-control input-sm"
							placeholder="请输入家庭住址 " />
					</div>
				</div>

			</div>
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">QQ</label>
					<div class="col-sm-9">
						<input type="text" name="staffQq" class="form-control input-sm"
							placeholder="请输入QQ" />
					</div>
				</div>
			</div>
		</div>
		<!-- 结束5 -->
		<!-- 开始6 -->
		<div class="row">
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">入职时间</label>
					<div class="col-sm-9">
						<input type="text" name="staffEntryTime"
							class="form-control input-sm" placeholder="请输入入职时间 " />
					</div>
				</div>

			</div>
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">教育水平</label>
					<div class="col-sm-6">
						<select class="form-control input-sm" name="staffEductionLevel">
							<option value="博士" selected>博士</option>
							<option value="硕士">硕士</option>
							<option value="本科">本科</option>
						</select>
					</div>
				</div>
			</div>
		</div>
		<!-- 结束6 -->
		<h5 class="page-header alert-info"
			style="padding: 10px; margin: 0px; margin-bottom: 5px;">备注信息</h5>
		<div class="row">
			<div class="col-sm-10">
				<div class="form-group">
					<label class="col-sm-3 control-label">备注</label>
					<div class="col-sm-9">
						<textarea class="form-control" name="staffRemark"></textarea>
					</div>
				</div>

			</div>

		</div>
		<h5 class="page-header alert-info"
			style="padding: 10px; margin: 0px; margin-bottom: 5px;">账号信息</h5>
		<div class="row">
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">账号</label>
					<div class="col-sm-9">
						<input type="text" name="userNumber" class="form-control input-sm"
							placeholder="请输入账号 " />
					</div>
				</div>

			</div>
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">密码</label>
					<div class="col-sm-9">
						<input type="password" name="userPassowrd"
							class="form-control input-sm" placeholder="请输入密码" />
					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-sm-3 col-sm-offset-4">
				<input type="submit" class="btn btn-success" value="保存" /> <input
					type="reset" class="btn  btn-danger" value="取消" />
			</div>
		</div>
	</form>

</body>
</html>
