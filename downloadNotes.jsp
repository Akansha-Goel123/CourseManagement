<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!DOCTYPE html>
<html>
<head>
	<title>Student</title>
	<link rel="stylesheet" type="text/css" href="css/download.css">
	<script type="text/javascript" href="../javascript/download.js"></script>
<link href="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<!------ Include the above in your HEAD tag ---------->
</head>
<body>
<div class="container">
	<div class="row">
		<div id="left" class="span3">
            <ul id="menu-group-1" class="nav menu">  
                <li class="item-1 deeper parent active">
                    <a class="" href="#">
                        <span data-toggle="collapse" data-parent="#menu-group-1" href="#sub-item-1" class="sign"><i class="icon-plus icon-white"></i></span>
                        <span class="lbl">Menu Group i</span>                      
                    </a>
                    <ul class="children nav-child unstyled small collapse" id="sub-item-1">
                        <li class="item-2 deeper parent active">
                            <a class="" href="#">
                                <span data-toggle="collapse" data-parent="#menu-group-1" href="#sub-item-2" class="sign"><i class="icon-plus icon-white"></i></span>
                                <span class="lbl">Menu 1</span> 
                            </a>
                            <ul class="children nav-child unstyled small collapse" id="sub-item-2">
                                <li class="item-3 current active">
                                    <a class="" href="#">
                                        <span class="sign"><i class="icon-play"></i></span>
                                        <span class="lbl">Menu 1.1</span> (current menu)
                                    </a>
                                </li>
                                <li class="item-4">
                                    <a class="" href="#">
                                        <span class="sign"><i class="icon-play"></i></span>
                                        <span class="lbl">Menu 1.2</span> 
                                    </a>
                                </li>                                
                            </ul>
                        </li>
                        <li class="item-5 deeper parent">
                            <a class="" href="#">
                                <span data-toggle="collapse" data-parent="#menu-group-1" href="#sub-item-5" class="sign"><i class="icon-plus icon-white"></i></span>
                                <span class="lbl">Menu 2</span> 
                            </a>
                            <ul class="children nav-child unstyled small collapse" id="sub-item-5">
                                <li class="item-6">
                                    <a class="" href="#">
                                        <span class="sign"><i class="icon-play"></i></span>
                                        <span class="lbl">Menu 2.1</span>                                    
                                    </a>
                                </li>
                                <li class="item-7">
                                    <a class="" href="#">
                                        <span class="sign"><i class="icon-play"></i></span>
                                        <span class="lbl">Menu 2.2</span>                                    
                                    </a>
                                </li>
                            </ul>
                        </li>
                    </ul>
                </li>

                <li class="item-8 deeper parent">
                    <a class="" href="#">
                        <span data-toggle="collapse" data-parent="#menu-group-1" href="#sub-item-8" class="sign"><i class="icon-plus icon-white"></i></span>
                        <span class="lbl">Menu Group ii</span>                      
                    </a>
                    <ul class="children nav-child unstyled small collapse" id="sub-item-8">
                        <li class="item-9 deeper parent">
                            <a class="" href="#">
                                <span data-toggle="collapse" data-parent="#menu-group-1" href="#sub-item-9" class="sign"><i class="icon-plus icon-white"></i></span>
                                <span class="lbl">Menu 1</span> 
                            </a>
                            <ul class="children nav-child unstyled small collapse" id="sub-item-9">
                                <li class="item-10">
                                    <a class="" href="#">
                                        <span class="sign"><i class="icon-play"></i></span>
                                        <span class="lbl">Menu 1.1</span>
                                    </a>
                                </li>
                                <li class="item-11">
                                    <a class="" href="#">
                                        <span class="sign"><i class="icon-play"></i></span>
                                        <span class="lbl">Menu 1.2</span> 
                                    </a>
                                </li>                                
                            </ul>
                        </li>
                        <li class="item-12 deeper parent">
                            <a class="" href="#">
                                <span data-toggle="collapse" data-parent="#menu-group-1" href="#sub-item-12" class="sign"><i class="icon-plus icon-white"></i></span>
                                <span class="lbl">Menu 2</span> 
                            </a>
                            <ul class="children nav-child unstyled small collapse" id="sub-item-12">
                                <li class="item-13">
                                    <a class="" href="#">
                                        <span class="sign"><i class="icon-play"></i></span>
                                        <span class="lbl">Menu 2.1</span>                                    
                                    </a>
                                </li>
                                <li class="item-14">
                                    <a class="" href="#">
                                        <span class="sign"><i class="icon-play"></i></span>
                                        <span class="lbl">Menu 2.2</span>                                    
                                    </a>
                                </li>
                            </ul>
                        </li>
                    </ul>
                </li>    			
            </ul>          
		</div>
	</div>
</div>
</body>
</html>