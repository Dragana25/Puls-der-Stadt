<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
<meta name="viewport" content="width=device-width, initial-scale=1"/>
<link rel="stylesheet"
	href="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.css" />
<script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
<script
	src="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js"></script>
	<script>
	$("#one").click (function())
	</script>
<title>Puls der Stadt</title>
</head>
<body>
	<div data-role="page" id="home">
		<div data-role="panel" id="leftpanel" data-position="left"
			data-display="overlay"
			class="ui-panel ui-panel-position-left ui-panel-display-overlay ui-body-a ui-panel-animate ui-panel-closed">

			<div class="ui-panel-inner">
				<a href="#demo-links" data-rel="close" data-theme="a"
					class="ui-btn ui-shadow ui-corner-all ui-btn-a ui-icon-delete ui-btn-icon-left ui-btn-inline">Close
					panel</a>
			</div>
		</div>


		<div data-role="panel" id="rightpanel" data-position="right"
			data-display="overlay" data-theme="a"
			class="jqm-search-panel ui-panel ui-panel-position-right ui-panel-display-overlay ui-body-a ui-panel-animate ui-panel-closed">
			<div class="ui-panel-inner">
				<input data-type="search" placeholder="Search locations...">
			</div>
		</div>

		<div data-role="header">
			<a href="#leftpanel"
				class="ui-btn ui-icon-bars ui-btn-icon-notext ui-corner-all"></a> 
				<a href="#rightpanel"
				class="ui-btn ui-icon-search ui-btn-icon-notext ui-corner-all"></a>
			<h1>Puls der Stadt</h1>
		</div>
		<!-- /header -->

		<div data-role="main" class="ui-content">
			<div data-role="controlgroup">
				<a id="one" href="#" class="ui-btn ui-icon-carat-r ui-btn-icon-right">Aposto</a>
				<a href="#" class="ui-btn ui-icon-carat-r ui-btn-icon-right">Lehners</a>
				<a href="#" class="ui-btn ui-icon-carat-r ui-btn-icon-right">Alex</a>
				<a href="#" class="ui-btn ui-icon-carat-r ui-btn-icon-right">En
					Vogue</a> <a href="#" class="ui-btn ui-icon-carat-r ui-btn-icon-right">Kiwi</a>
			</div>
		</div>
		<!-- /content -->

		<div data-role="footer">
			<h4>Page Footer</h4>
		</div>
		<!-- /footer -->
	</div>
	<!-- /page -->

	<div data-role="page" id="two">
		<div data-role="header"></div>
		<div>Bild</div>
		<table>
			<tr>
				<td><label>Stimmung</label></td>
				<td><label>Besuchermenge</label></td>
			</tr>
		</table>
		<div data-role="content"></div>

	</div>
</body>
</html>