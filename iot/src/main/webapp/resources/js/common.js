function emptyCheck(){
	var ok = true;
	$('.chk').each(function(){
		if( $(this).val()==''){
			var item = $(this).attr('placeholder');
			alert('입력하세요!');
			$(this).focus();
			ok = false;
			return ok;
		}
	});
	return ok;
}