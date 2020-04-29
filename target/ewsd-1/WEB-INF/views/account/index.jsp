<%--<!-- GLOBAL HEADER -->--%>

<%--<jsp:include page="/WEB-INF/views/common/header.jsp"/>--%>

<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>--%>
<%--<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>--%>

<%--<!-- COURSE COVER IMAGE -->--%>


<%--<!-- MAIN CONTENT OF THE PAGE -->--%>
<%--<div class="container">--%>

<%--    <div class="col col-lg-12 col-md-12 col-sm-12 col-12">--%>

<%--        <div class="ui-block">--%>

<%--            <div class="ui-block-content">--%>

<%--                <form:form--%>
<%--                        action="${pageContext.request.contextPath }/account/edit"--%>
<%--                        modelAttribute="user" enctype="multipart/form-data">--%>
<%--                    <div class="form-row">--%>


<%--                        <div class="col col-lg-6 col-md-6 col-sm-12 col-12">--%>
<%--                            <div class="form-group">--%>
<%--                                <label for="teamName">username</label>--%>
<%--                                <form:input path="username" class="form-control" id="teamName"--%>
<%--                                            placeholder="team Name..." />--%>
<%--                            </div>--%>
<%--                        </div>--%>


<%--                    </div>--%>

<%--                    <div class="form-row">--%>


<%--                        <div class="form-group col-md-12">--%>
<%--                            <label for="teamDescription">email</label>--%>
<%--&lt;%&ndash;                            <form:input path="email" class="form-control"&ndash;%&gt;--%>
<%--&lt;%&ndash;                                        id="teamDescription" placeholder="team Description..." />&ndash;%&gt;--%>
<%--&lt;%&ndash;                        </div>&ndash;%&gt;--%>

<%--&lt;%&ndash;                    </div>&ndash;%&gt;--%>





<%--&lt;%&ndash;                    <div class="form-row">&ndash;%&gt;--%>
<%--&lt;%&ndash;                        <div class="form-group col-md-10">&ndash;%&gt;--%>
<%--&lt;%&ndash;                            <c:if test="${not empty user.logo}">&ndash;%&gt;--%>
<%--&lt;%&ndash;                                <div class="form-group col-md-4">&ndash;%&gt;--%>
<%--&lt;%&ndash;                                    <table class="table">&ndash;%&gt;--%>
<%--&lt;%&ndash;                                        <tr>&ndash;%&gt;--%>
<%--&lt;%&ndash;                                            <th>Images</th>&ndash;%&gt;--%>
<%--&lt;%&ndash;                                            <th>Action</th>&ndash;%&gt;--%>
<%--&lt;%&ndash;                                        </tr>&ndash;%&gt;--%>
<%--&lt;%&ndash;                                        <tr>&ndash;%&gt;--%>
<%--&lt;%&ndash;                                            <th><img class="card-img-top"&ndash;%&gt;--%>
<%--&lt;%&ndash;                                                     src="${pageContext.request.contextPath }/img/${user.logo}"&ndash;%&gt;--%>
<%--&lt;%&ndash;                                                     alt=""></th>&ndash;%&gt;--%>
<%--&lt;%&ndash;                                            <th><a class="badge badge-primary"&ndash;%&gt;--%>
<%--&lt;%&ndash;                                                   href="team/deleteImage?logo=${logo}}&id=${id }">Delete</a></th>&ndash;%&gt;--%>
<%--&lt;%&ndash;                                        </tr>&ndash;%&gt;--%>
<%--&lt;%&ndash;                                    </table>&ndash;%&gt;--%>
<%--&lt;%&ndash;                                </div>&ndash;%&gt;--%>
<%--&lt;%&ndash;                            </c:if>&ndash;%&gt;--%>
<%--&lt;%&ndash;                        </div>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    </div>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    <input type="submit" class="btn btn-primary" value="Update account">&ndash;%&gt;--%>
<%--&lt;%&ndash;                </form:form>&ndash;%&gt;--%>



<%--            </div>--%>
<%--        </div>--%>
<%--    </div>--%>


<%--    <div class="row">--%>
<%--        <c:if test="${totalPages>0}">--%>

<%--            <div class="pagination">--%>
<%--                <c:forEach var="i" begin="0" end="${totalPages-1}" step="1">--%>
<%--                    <c:if test="${i == 0}"><a href="${pageContext.request.contextPath }/country/show-all?_search=&_pageIndex=${i}&_rows=5&_sort=NA">&laquo;</a>--%>
<%--                    </c:if>--%>

<%--                    <c:if test="${i == pageIndex}"><a class="active" href="${pageContext.request.contextPath }/country/show-all?_search=&_pageIndex=${i}&_rows=5&_sort=NA">${i+1}</a>--%>
<%--                    </c:if>--%>

<%--                    <c:if test="${i != pageIndex}"><a  href="${pageContext.request.contextPath }/country/show-all?_search=&_pageIndex=${i}&_rows=5&_sort=NA">${i+1}</a>--%>
<%--                    </c:if>--%>




<%--                    <c:if test="${i == totalPages}"><a href="${pageContext.request.contextPath }/country/show-all?_search=&_pageIndex=${i}&_rows=5&_sort=NA">&raquo;</a>--%>
<%--                    </c:if>--%>

<%--                </c:forEach>--%>
<%--            </div>--%>

<%--        </c:if>--%>
<%--    </div>--%>
<%--</div>--%>


<%--<!-- GLOBAL FOOTER -->--%>
<%--<jsp:include page="/WEB-INF/views/common/footer.jsp"/>--%>




