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
//Code for jquery dataTable
//create a data set	
	var products = [
	                ['1', 'ABC'],
	                ['2', 'ACB'],
	                ['3', 'BAC'],
	                ['4', 'BCA'],
	                ['5', 'CAB'],
	                ['6', 'CBA'],
	                ['7', 'AAA'],
	                ['8', 'BBB'],
	                ['9', 'CCC'],
	                ];
	var $table = $('#productListTable');
	//execute below code only were we have this table
	
	if($table.length){
		$table.DataTable({
			data:products
		});
	}
});


