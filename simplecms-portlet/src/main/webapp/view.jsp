<%
/**
 * SimpleCMS Porltet view.jsp
 */
%>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

This is the <b>"Simple"</b> portlet.

<portlet:resourceURL var="dispatcherURL" />


<script type="text/javascript">
var simpleCMS = {};
simpleCMS.dispatcherURL = '${dispatcherURL}';
simpleCMS.namespace = '<portlet:namespace />';

</script>






