jQuery(document).ready(function($){
	
	$('#btn-register').click(function(e){
		e.preventDefault()
		
		var fullname = $('#fullname').val()
		var email = $('#email').val()
		var password = $('#password').val()
		
		$.ajax({
			url: 'http://localhost:8080/DemoFilter/api/register',
			type: 'get',
			data: {
				fullname: fullname,
				email: email,
				password: password
			}
		}).done(function(result){
			if(result.success){
				//Thanh cong
				$.ajax({
					url: 'http://localhost:8080/DemoFilter/api/users',
					type: 'get'
				}).done(function(value){
					value.forEach(function(data){
						var contentHtml = `
							<tr>
								<td>${data.fullname}</td>
								<td>${data.email}</td>
							</tr>
						`
						$('#table-users').append(contentHtml)
					})
				}).fail(function(error){
					console.log(error)
				})
				
			}else{
				//That bai
				$('#message').append('<h1>Thất bại</h1>')
			}
		}).fail(function(error){
			
		})
		
	})
	
})