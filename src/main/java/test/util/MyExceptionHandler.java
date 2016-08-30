package test.util;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2016/8/10.
 */
@ControllerAdvice
public class MyExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    public void defaultErrorHandler(HttpServletRequest request,Exception e){
//        if (AnnotationUtils.findAnnotation(e.getClass(), ResponseStatus.class)!=null){
//            try {
//                throw e;
//            } catch (Exception e1) {
//                e1.printStackTrace();
//            }
//        }
//        ModelAndView mav = new ModelAndView();
//        mav.addObject("exception",e);
//        mav.addObject("url",request.getRequestURI());
//        return mav;
        e.printStackTrace();
        System.out.println("==================================");


    }
}
