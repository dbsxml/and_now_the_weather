<?xml version="1.0"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">

<xsl:template match="station">
	<html>
		<head>
			<link rel="stylesheet" href="wetter.css"/>
			<script language="javascript" type="text/javascript" src="wetter.js"></script>
			<title><xsl:value-of select="stationNumber/@stationNumber" /></title>
		</head>
		<body>
			<xsl:apply-templates/>
		</body>
	</html>
</xsl:template>


<xsl:template match="location">
	<div id="location">tag location: geoLocation kommt noch</div>
</xsl:template>

<xsl:template match="data">
	
	 <label>Wetterdaten für Jahr <xsl:value-of select="@year"/> für Monat: 
	 	<select name="months" size="1"> 
	 		<option>Jan.</option> 
	 		<option>Feb.</option> 
	 		<option>Mar.</option> 
	 		<option>Apr.</option> 
	 		<option>May</option> 
	 		<option>Jun.</option> 
	 		<option>Jul</option> 
	 		<option>Aug.</option> 
	 		<option>Sep.</option> 
	 		<option>Oct.</option> 
	 		<option>Nov.</option> 
	 		<option>Dec.</option> 

	 	</select> 
	 </label>
		<div class="table">
			<div class="tablehead">
				<div class="th day">Day</div>
				<div class="th hour">00:00</div>
				<div class="th hour">01:00</div>
				<div class="th hour">02:00</div>
				<div class="th hour">03:00</div>
				<div class="th hour">04:00</div>
				<div class="th hour">05:00</div>
				<div class="th hour">06:00</div>
				<div class="th hour">07:00</div>
				<div class="th hour">08:00</div>
				<div class="th hour">09:00</div>
				<div class="th hour">10:00</div>
				<div class="th hour">11:00</div>
				<div class="th hour">12:00</div>
				<div class="th hour">13:00</div>
				<div class="th hour">14:00</div>
				<div class="th hour">15:00</div>
				<div class="th hour">16:00</div>
				<div class="th hour">17:00</div>
				<div class="th hour">18:00</div>
				<div class="th hour">19:00</div>
				<div class="th hour">20:00</div>
				<div class="th hour">21:00</div>
				<div class="th hour">22:00</div>
				<div class="th hour">23:00</div>
			</div>
			<div class="tablebody"><xsl:apply-templates/></div>
		</div>
</xsl:template>

<xsl:template match="month">
	<div class="month invisible">
		<xsl:attribute name="id"><xsl:value-of select="@caption"/></xsl:attribute>
		<xsl:apply-templates/>
	</div>
</xsl:template>

<xsl:template match="day">
	<div class="tablerow">
		<div class="day"><xsl:value-of select="@valueDay"/></div>
		<xsl:for-each select="hour">
			<div class="hour"><xsl:value-of select="@temperature"/></div>
    	</xsl:for-each>
	</div>
</xsl:template>



</xsl:stylesheet>