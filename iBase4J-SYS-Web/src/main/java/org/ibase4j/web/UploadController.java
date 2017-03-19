package org.ibase4j.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ibase4j.core.base.BaseController;
import org.ibase4j.core.support.HttpCode;
import org.ibase4j.core.util.UploadUtil;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 文件上传控制器
 * 
 * @author ShenHuaJie
 * @version 2016年5月20日 下午3:11:42
 */
@RestController
@Api(value = "文件上传接口", description = "文件上传接口")
@RequestMapping(value = "/upload", method = RequestMethod.POST)
public class UploadController extends BaseController {

	public String getService() {
		return null;
	}

	// 上传文件(支持批量)
	@RequestMapping("/image")
	@ApiOperation(value = "上传图片")
	public Object uploadImage(HttpServletRequest request, HttpServletResponse response, ModelMap modelMap) {
		List<String> fileNames = UploadUtil.uploadImage(request, true);
		if (fileNames.size() > 0) {
			modelMap.put("imgName", fileNames);
			return setSuccessModelMap(modelMap);
		} else {
			setModelMap(modelMap, HttpCode.BAD_REQUEST);
			modelMap.put("msg", "请选择要上传的文件！");
			return modelMap;
		}
	}

	// 上传文件(支持批量)
	@RequestMapping("/imageData")
	@ApiOperation(value = "上传图片")
	public Object uploadImageData(HttpServletRequest request, HttpServletResponse response, ModelMap modelMap) {
		List<String> fileNames = UploadUtil.uploadImageData(request);
		if (fileNames.size() > 0) {
			modelMap.put("imgName", fileNames);
			return setSuccessModelMap(modelMap);
		} else {
			setModelMap(modelMap, HttpCode.BAD_REQUEST);
			modelMap.put("msg", "请选择要上传的文件！");
			return modelMap;
		}
	}
}
