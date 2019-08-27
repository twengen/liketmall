package com.item.liketmal.utils;

import lombok.Data;

@Data
public class Result<T> {
    private int status;
    private String msg;
    private T data;

    public static <T> Result success(T t){
        Result result = new Result();
        result.setData(t);
        result.setStatus(Constants.SUCCESS_STATUS_200);
        result.setMsg(Constants.SUCCESS_MSG);
        return result;
    }

    public static Result error(){
        Result result = new Result();
        result.setData(Constants.ERROR_STATUS_404);
        result.setMsg(Constants.ERROR_MSG);
        return result;
    }
}
