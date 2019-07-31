package com.shouzhong.aopplugin.demo;

import android.util.Log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AOPUtils {

    @Around("execution(* android.view.View.OnClickListener.onClick(..))")
    public void clickTest(ProceedingJoinPoint joinPoint) throws Throwable {
        Log.e("AOPUtils", "click");
        joinPoint.proceed();
    }

}
