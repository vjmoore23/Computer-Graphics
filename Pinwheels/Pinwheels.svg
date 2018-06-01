<?xml version="1.0"?>
<!DOCTYPE svg PUBLIC "-//W3C//DTD SVG 1.1//EN" 
  "http://www.w3.org/Graphics/SVG/1.1/DTD/svg11.dtd">
<svg version="1.1"
     xmlns="http://www.w3.org/2000/svg"
     xmlns:xlink="http://www.w3.org/1999/xlink"
     width="14cm" height="10cm" 
     viewBox="0 0 7 5">

     
<defs>
		
	<polygon id="wheel" points="0,0  0.5,0.5  1,0  1,-0.1"/>
               
    <g id="pinwheel">  
        <rect x="-0.05" y="0" width="0.1" height="2" fill="gray"/>
        <g transform="translate(0,2)">
		<g transform="rotate(0)"> 
                <animateTransform attributeName="transform" attributeType="XML"
                            type="rotate" from="360" to="0" dur="3s" 
                            fill="remove" repeatCount="indefinite"/>  
                <use xlink:href="#wheel" fill = "red"/>
				<use xlink:href="#wheel" fill = "white" transform="rotate(120)"/>
                <use xlink:href="#wheel" fill = "blue" transform="rotate(240)"/>
				
            </g>
			<circle cx = "0" cy ="0" r = "0.15" fill = "gray"/>
        </g>
    </g>
	
	<g id="pinwheel2">  
        <rect x="-0.05" y="0" width="0.1" height="3" fill="gray"/>
        <g transform="translate(0,3)">
		<g transform="rotate(0)"> 
                <animateTransform attributeName="transform" attributeType="XML"
                            type="rotate" from="360" to="0" dur="4s" 
                            fill="remove" repeatCount="indefinite"/>  
                <use xlink:href="#wheel" fill = "red"/>
				<use xlink:href="#wheel" fill = "white" transform="rotate(120)"/>
                <use xlink:href="#wheel" fill = "blue" transform="rotate(240)"/>
				
            </g>
			<circle cx = "0" cy ="0" r = "0.15" fill = "gray"/>
        </g>
    </g>

	

</defs>


<g transform="translate(0,4) scale(1,-1)">
    <rect x="0" y="-1" width="7" height="5" fill= "skyblue"/> 
    <use xlink:href="#pinwheel" transform="translate(1.3,-1)"/> 
	<use xlink:href="#pinwheel2" transform="translate(3.5,-1)"/> 
	<use xlink:href="#pinwheel" transform="translate(5.5,-1)" dur = "2s"/>

</g>

</svg>

