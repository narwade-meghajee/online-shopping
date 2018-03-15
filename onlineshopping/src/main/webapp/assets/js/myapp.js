//JQuery
$(function() {
	// solving active menu problem
	switch (menu) { // menu values come from controller
	case 'About Us':
		$('#about').addClass('active');

	case 'Contact Us':
		$('#contact').addClass('active');
		break;

	default:
		$('#home').addClass('active');
		break;
	}

});