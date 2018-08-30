<%@ page language="java" contentType="text/html; charset=UTF-8" 	pageEncoding="UTF-8"%>

 <header id="header">
		    <div class="container main-menu">
		    	<div class="row align-items-center justify-content-between d-flex">
			      <div id="logo">
			        <a href="index.html"><img src="${context}/resources/img/logo.png" alt="" title="" /></a>
			      </div>
			      <nav id="nav-menu-container">
			        <ul class="nav-menu">
			          <li><a id="home_btn" href="#">Home</a></li>
			          <li><a id="mypage_btn" href="#">마이페이지</a></li>
			          <li><a id="logout_btn" href="#">${user.name}님 로그아웃</a></li>
			          <li><a id="" href="#">뿅</a></li>
			          <li><a href="portfolio.html">Portfolio</a></li>
			          <li><a href="price.html">Pricing</a></li>
			          <li class="menu-has-children"><a href="">Blog</a>
			            <ul>
			              <li><a href="blog-home.html">Blog Home</a></li>
			              <li><a href="blog-single.html">Blog Single</a></li>
			            </ul>
			          </li>	
			          <li class="menu-has-children"><a href="">Pages</a>
			            <ul>
		            	  <li><a href="elements.html">Elements</a></li>
				          <li class="menu-has-children"><a href="">Level 2 </a>
				            <ul>
				              <li><a href="#">Item One</a></li>
				              <li><a href="#">Item Two</a></li>
				            </ul>
				          </li>					                		
			            </ul>
			          </li>					          					          		          
			          <li><a href="contact.html">Contact</a></li>
			        </ul>
			      </nav><!-- #nav-menu-container -->		    		
		    	</div>
		    </div>
		  </header><!-- #header -->

<script>
	user.session({
		userid : '${user.userid}',
		name : '${user.name}',
		gender : '${user.gender}',
		age : '${user.age}',
		roll : '${user.roll}',
		teamId : '${user.teamId}'
	});
</script>


