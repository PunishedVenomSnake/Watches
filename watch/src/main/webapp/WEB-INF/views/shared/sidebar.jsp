<div class="list-group">
	
	<c:forEach items="${categories}" var="category">
	
	<a href="${contextRoot}/show/category/${category.id}/products" class="list-group-item list-group-item-action active">${category.name}</a>
	</c:forEach>
	  
</div>