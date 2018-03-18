//JQuery
$(function() {
	// solving active menu problem
	switch (menu) { // menu values come from controller
	case 'About Us':
		$('#about').addClass('active');

	case 'Contact Us':
		$('#contact').addClass('active');
		break;
	case 'All Products':
		$('#listProducts').addClass('active');
		break;

	default:
		$('#listProducts').addClass('active');
	    $('#a_'+menu).addClass('active');
		break;
	}

});