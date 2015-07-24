package com.simplecms.controller;

import com.liferay.util.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.LiferayPortlet;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;


import java.io.IOException;

import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.EventRequest;
import javax.portlet.EventResponse;
import javax.portlet.PortletConfig;
import javax.portlet.PortletContext;
import javax.portlet.PortletException;
import javax.portlet.PortletPreferences;
import javax.portlet.PortletRequest;
import javax.portlet.PortletRequestDispatcher;
import javax.portlet.PortletResponse;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import javax.portlet.WindowState;

public class SimpleCMSController extends MVCPortlet {

	@Override
	public void serveResource(
			ResourceRequest resourceRequest, ResourceResponse resourceResponse)
		throws IOException, PortletException {

		try {
			doIt(resourceRequest, resourceResponse);
		} catch (Exception e) {
			_log.error(e);
		}
	}

	public void doIt(
			ResourceRequest resourceRequest, ResourceResponse resourceResponse)
		throws Exception {

		_log.info(">> serveResource");
		_log.info(resourceRequest.getParameterMap());

		String json = resourceRequest.getParameter("json");
		_log.info("json " + json);
		JSONObject object = JSONFactoryUtil.createJSONObject(json);
		_log.info("object " + object);
		String cmd = object.getString("cmd");		
		_log.info("cmd " + cmd);
		JSONObject cmdParams = object.getJSONObect("cmdParams");
		
		_log.info("cmdParams " + cmdParams);

		if ("add".equalsIgnoreCase(cmd)) {

			Repository rep = SimpleCMSUtil.getRepository();
			rep.add(.....);

		} else if ("update".equalsIgnoreCase(cmd)) {
		
		} else if ("delete".equalsIgnoreCase(cmd)) {
		
		} else if ("view".equalsIgnoreCase(cmd)) {
			Repository rep = SimpleCMSUtil.getRepository();
			rep.getFilesAndFolders();
		
		}
		//....JSONFactoryUtl.createJSON();
		resourceResponse.write("");
		_log.info("<< serveResource");
		
	}


	private static Log _log = LogFactoryUtil.getLog(SimpleCMSController.class);

}
