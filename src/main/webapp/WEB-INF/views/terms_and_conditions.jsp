<!-- GLOBAL HEADER -->
<jsp:include page="common/header.jsp" />






<!-- Main content -->

        <section class="content">

            <th:block th:if="${pageName=='terms-and-conditions'}">
                <div class="row">
                    <div class="col-xs-12 col-xl-12 col-md-12 col-lg-12 col-sm-12">
                        <form method="post"
                              th:action="@{set-terms-and-conditions}">
                            <div class="form-group">
                                <textarea id="editor1" name="editor1" th:text="${tNc}"></textarea>

                            </div>
                            <div class="row">
                                <div
                                        class="form-group col-sm-2 col-lg-2 col-xl-2 col-md-2 col-xs-2">
                                    <input type="submit" class="btn btn-block btn-primary btn-sm"
                                           value="Save">
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
                <script type="text/javascript">
                    CKEDITOR.replace('editor1');
                </script>

            </th:block>

        </section>

        <!-- /.Ending Main content -->



<!-- GLOBAL FOOTER -->
<jsp:include page="common/footer.jsp" />