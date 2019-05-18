package com.imooc.hotdeploy;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 用途描述
 *
 * @author 胡晓磊
 * @version $Id: ExceptionHandler, v0.1
 * @company 杭州信牛网络科技有限公司
 * @date 2019年05月18日 18:42 胡晓磊 Exp $
 */
@ControllerAdvice
public class ExceptionAdviceHandler {
    private static final String IMOOC_ERROR_VIEW = "error";

    @ExceptionHandler(value = Exception.class)
    public Object errorHandler(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName(IMOOC_ERROR_VIEW);

        return modelAndView;
    }
}
